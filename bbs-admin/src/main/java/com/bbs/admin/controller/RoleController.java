package com.bbs.admin.controller;

import com.bbs.admin.service.RoleService;
import com.bbs.common.base.BaseController;
import com.bbs.common.dto.PageResult;
import com.bbs.common.dto.BBSResult;
import com.bbs.common.entity.Permission;
import com.bbs.common.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/roles")
public class RoleController extends BaseController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public PageResult getAll(String draw,
                             @RequestParam(required = false, defaultValue = "1") int start,
                             @RequestParam(required = false, defaultValue = "10") int length) {
        int pageNo = start / length;
        Page<Role> page = roleService.findByPage(pageNo, length);
        PageResult<List<Role>> result = new PageResult<>(
                draw,
                page.getTotalElements(),
                page.getTotalElements(),
                page.getContent());

        return result;
    }

    @PostMapping("/rolesWithSelected")
    public BBSResult rolesWithSelected(Integer uid) {
        BBSResult result = roleService.findRolesAndSelected(uid);
        return result;
    }

    @PostMapping("/add")
    public BBSResult add(Role role) {
        BBSResult result = restProcessor(() -> {
            roleService.save(role);
            return BBSResult.ok();
        });
        return result;
    }

    @PostMapping("/delete")
    public BBSResult delete(@RequestParam(value = "id[]") Role[] id){
        BBSResult result = restProcessor(() -> {
            roleService.deleteInBatch(Arrays.asList(id));
            return BBSResult.ok();
        });

        return result;
    }

    @PostMapping("/saveRolePermission")
    public BBSResult saveRolePermission(Integer roleid, @RequestParam(value = "pers[]") Permission[] pers){

        BBSResult result = restProcessor(() -> {
            roleService.saveRolePermission(roleid, pers);
            return BBSResult.ok();
        });

        return result;
    }

}
