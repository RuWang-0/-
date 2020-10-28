package com.bbs.rest.controller;

import com.bbs.common.base.BaseController;
import com.bbs.common.dto.BBSResult;
import com.bbs.common.entity.Label;
import com.bbs.rest.service.LabelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Api(value = "标签接口",description = "获取标签")
@RestController
@RequestMapping("/label")
@CrossOrigin
public class LabelController extends BaseController{
    @Autowired
    private LabelService labelService;

    @ApiOperation("获取标签")
    @GetMapping
    public BBSResult getAllLabel(){

        BBSResult result = restProcessor(() -> {
            List<Label> labels = labelService.findAll();
            return BBSResult.ok(labels);
        });

        return result;
    }



}
