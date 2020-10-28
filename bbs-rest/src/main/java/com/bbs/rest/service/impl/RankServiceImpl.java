package com.bbs.rest.service.impl;

import com.bbs.common.dao.PostsDao;
import com.bbs.common.dao.UserDao;
import com.bbs.rest.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author LHR
 * Create By 2017/8/31
 */
@Service
public class RankServiceImpl implements RankService{
    @Autowired
    private PostsDao postsDao;
    @Autowired
    private UserDao userDao;

    @Override
    public List<Object> findPostsRank() {
        return postsDao.findHot();
    }

    @Override
    public List<Object> findUserRank() {
        return userDao.findNewUser();
    }
}
