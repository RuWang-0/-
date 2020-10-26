package com.fduexchange.porent.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fduexchange.porent.entity.FduexchangeResult;

import java.io.IOException;

public class JsonUtils {
    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static FduexchangeResult jsonToFduexchangeResult(String json, Class<?> clazz) {

        try {
            if (clazz == null) {
                return MAPPER.readValue(json, FduexchangeResult.class);
            }

            JsonNode jsonNode = MAPPER.readTree(json);
            JsonNode data = jsonNode.get("data");
            Object obj = null;
            if (clazz != null) {
                if (data.isObject()) {
                    obj = MAPPER.readValue(data.traverse(), clazz);
                } else if (data.isTextual()) {
                    obj = MAPPER.readValue(data.asText(), clazz);
                }
            }

            return new FduexchangeResult(jsonNode.get("status").intValue(), obj, jsonNode.get("error").asText());
        } catch (IOException e) {
            return null;
        }

    }
}
