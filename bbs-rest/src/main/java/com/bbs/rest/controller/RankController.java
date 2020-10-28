package com.bbs.rest.controller;

import com.bbs.common.base.BaseController;
import com.bbs.common.dto.BBSResult;
import com.bbs.service.RankService;
import com.bbs.service.RedisService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;


@Api(value = "排行榜接口", description = "七天内热帖排行榜,七天内新注册用户排行榜")
@RestController
@RequestMapping("/rank")
@CrossOrigin
public class RankController extends BaseController {
    @Autowired
    private RankService rankService;

    @Autowired
    private RedisService<List<Object>> redisService;

    @Value("${REDIS_RANK_POSTS}")
    private String REDIS_RANK_POSTS;

    @Value("${REDIS_RANK_USERS}")
    private String REDIS_RANK_USERS;

    @ApiOperation("获取一个月内热帖排行榜")
    @GetMapping("/topPosts")
    public BBSResult getTotPosts() {
        BBSResult result = restProcessor(() -> {
            List<Object> hot = redisService.getString(REDIS_RANK_POSTS);
            if (hot != null) {
                return BBSResult.ok(hot);
            }
            hot = rankService.findPostsRank();
            redisService.cacheString(REDIS_RANK_POSTS, hot, 1);
            return BBSResult.ok(hot);
        });
        return result;
    }

    @ApiOperation("获取一个月内新注册的用户")
    @GetMapping("/newUsers")
    public BBSResult getNewUser() {
        BBSResult result = restProcessor(() -> {
            List<Object> users = redisService.getString(REDIS_RANK_USERS);
            if (users != null) return BBSResult.ok(users);

            users = rankService.findUserRank();
            redisService.cacheString(REDIS_RANK_USERS, users, 1);
            return BBSResult.ok(users);
        });
        return result;
    }

}
