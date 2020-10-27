package com.bbs.admin.controller;

import com.bbs.admin.service.UserService;
import com.bbs.common.base.BaseController;
import com.bbs.common.dto.PageResult;
import com.bbs.common.dto.BBSResult;
import com.bbs.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @GetMapping
    public PageResult getAll(User user, String draw,
                             @RequestParam(required = false, defaultValue = "1") int start,
                             @RequestParam(required = false, defaultValue = "10") int length) {
        int pageNo = start / length;
        Page<User> page = userService.findByPage(user, pageNo, length);
        PageResult<List<User>> result = new PageResult<>(
                draw,
                page.getTotalElements(),
                page.getTotalElements(),
                page.getContent());
        return result;
    }

    @PostMapping("/saveUserEnable")
    public BBSResult saveUserEnable(@RequestParam(value = "id[]") Integer[] id){
        BBSResult result = restProcessor(() -> {
            userService.saveUserEnable(id);
            return BBSResult.ok();
        });
        return result;
    }

}
