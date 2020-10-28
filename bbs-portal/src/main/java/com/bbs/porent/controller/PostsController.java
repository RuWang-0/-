package com.bbs.porent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
@CrossOrigin
public class PostsController {

    @RequestMapping("/add")
    public String add(){
        return "posts/add";
    }

    @RequestMapping("/detail")
    public String detail() {
        return "posts/detail";
    }
}
