package com.fduexchange.porent.entity;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;


public class FduexchangeResult implements Serializable {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private Integer status;

    private Object data;

    private String error;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public FduexchangeResult(Integer status, Object data, String error) {
        this.status = status;
        this.data = data;
        this.error = error;
    }
}
