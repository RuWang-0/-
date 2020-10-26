package com.fduexchange.porent.service.impl;

import com.fduexchange.porent.entity.QuarkResult;
import com.fduexchange.porent.entity.User;
import com.fduexchange.porent.service.UserService;
import com.fduexchange.porent.utils.HttpClientUtils;
import com.fduexchange.porent.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Value("${api_getUserByToken}")
    private String api_getUserByToken;

    @Override
    public User getUserByApi(String token) {
        String s = HttpClientUtils.doGet(api_getUserByToken + token);
        FduexchangeResult fduexchangeResult = JsonUtils.jsonToFduexchangeResult(s, User.class);
        User data= (User) fduexchangeResult.getData();
        return data;
    }
}
