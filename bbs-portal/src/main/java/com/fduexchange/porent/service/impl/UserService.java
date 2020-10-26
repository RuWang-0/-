package com.fduexchange.porent.service;

import com.fduexchange.porent.entity.User;

public interface UserService {

    User getUserByApi(String token);
    
}
