package com.bbs.porent.service.impl;

import com.bbs.porent.entity.BbsResult;
import com.bbs.porent.entity.User;
import com.bbs.porent.service.UserService;
import com.bbs.porent.utils.HttpClientUtils;
import com.bbs.porent.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Value("${api_getUserByToken}")
    private String api_getUserByToken;

    @Override
    public User getUserByApi(String token) {
        String s = HttpClientUtils.doGet(api_getUserByToken + token);
        BbsResult BBSResult = JsonUtils.jsonToBbsResult(s, User.class);
        User data= (User) BBSResult.getData();
        return data;
    }
}
