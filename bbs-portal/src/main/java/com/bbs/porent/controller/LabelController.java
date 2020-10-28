package com.bbs.porent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/label")
@Controller
@CrossOrigin
public class LabelController {

    @RequestMapping("/detail")
    public String getLabelDetail(){
        return "label/detail";
    }

}
