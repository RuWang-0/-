package com.bbs.admin.controller;

import com.bbs.admin.service.PostsService;
import com.bbs.admin.service.UserService;
import com.bbs.common.base.BaseController;
import com.bbs.common.dto.PageResult;
import com.bbs.common.dto.BBSResult;
import com.bbs.common.entity.Posts;
import com.bbs.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RequestMapping("/posts")
@RestController
public class PostsController extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private PostsService postsService;

    @GetMapping
    public PageResult getAll(Posts posts, Integer uid, String draw,
                             @RequestParam(required = false, defaultValue = "1") int start,
                             @RequestParam(required = false, defaultValue = "10") int length) {
        int pageNo = start / length;
        if (uid != null) {
            User user = userService.findOne(uid);
            posts.setUser(user);
        }
        Page<Posts> page = postsService.findByPage(posts, pageNo, length);
        PageResult<List<Posts>> result = new PageResult<>(
                draw,
                page.getTotalElements(),
                page.getTotalElements(),
                page.getContent());
        return result;
    }

    @PostMapping("/saveTop")
    public BBSResult saveTop(@RequestParam(value = "id[]") Integer[] id) {
        BBSResult result = restProcessor(() -> {
            postsService.changeTop(id);
            return BBSResult.ok();
        });
        return result;
    }

    @PostMapping("/saveGood")
    public BBSResult saveGood(@RequestParam(value = "id[]") Integer[] id) {
        BBSResult result = restProcessor(() -> {
            postsService.changeGood(id);
            return BBSResult.ok();
        });
        return result;
    }

    @PostMapping("/delete")
    public BBSResult deletePosts(@RequestParam(value = "id[]") Posts[] id){
        BBSResult result = restProcessor(() -> {
            postsService.deleteInBatch(Arrays.asList(id));
            return BBSResult.ok();
        });
        return result;
    }
}
