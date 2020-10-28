package com.bbs.admin.controller;

import com.bbs.admin.service.LabelService;
import com.bbs.common.base.BaseController;
import com.bbs.common.dto.PageResult;
import com.bbs.common.dto.BBSResult;
import com.bbs.common.entity.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RequestMapping("/labels")
@RestController
public class LabelController extends BaseController {

    @Autowired
    private LabelService labelService;

    @GetMapping
    public PageResult getAll(String draw,
                             @RequestParam(required = false, defaultValue = "1") int start,
                             @RequestParam(required = false, defaultValue = "10") int length) {

        int pageNo = start / length;
        Page<Label> page = labelService.findByPage(pageNo, length);
        PageResult<List<Label>> result = new PageResult<>(draw,
                page.getTotalElements(),
                page.getTotalElements(),
                page.getContent());

        return result;
    }

    @PostMapping("/delete")
    public BBSResult deleteLabels(@RequestParam(value = "id[]") Label[] id) {
        BBSResult result = restProcessor(() -> {
            labelService.deleteInBatch(Arrays.asList(id));
            return BBSResult.ok();
        });
        return result;
    }

    @PostMapping("/add")
    public BBSResult addLabels(Label label){
        BBSResult result = restProcessor(() -> {
            labelService.save(label);
            return BBSResult.ok();
        });

        return result;
    }

}
