package com.bbs.porent.service;

import com.bbs.porent.entity.User;

public interface UserService {

    User getUserByApi(String token);
    
}
