package com.bbs.admin.controller;

import com.bbs.admin.service.AdminUserService;
import com.bbs.common.base.BaseController;
import com.bbs.common.dto.PageResult;
import com.bbs.common.dto.BBSResult;
import com.bbs.common.entity.AdminUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/admins")
public class AdminUserController extends BaseController {

    @Autowired
    private AdminUserService adminUserService;

    /**
     * 翻页获取管理员
     *
     * @param adminUser
     * @param draw:请求次数
     * @param start
     * @param length
     * @return
     */
    @GetMapping
    public PageResult getAll(AdminUser adminUser, String draw,
                             @RequestParam(required = false, defaultValue = "1") int start,
                             @RequestParam(required = false, defaultValue = "10") int length) {
        int pageNo = start / length;
        Page<AdminUser> page = adminUserService.findByPage(adminUser, pageNo, length);
        PageResult<List<AdminUser>> result = new PageResult<>(
                draw,
                page.getTotalElements(),
                page.getTotalElements(),
                page.getContent());
        return result;
    }

    @PostMapping("/add")
    public BBSResult addAdmin(AdminUser adminUser) {

        BBSResult result = restProcessor(() -> {
            if (adminUserService.findByUserName(adminUser.getUsername()) != null)
                return BBSResult.error("用户名重复");
            adminUserService.saveAdmin(adminUser);
            return BBSResult.ok();
        });

        return result;
    }

    @PostMapping("/delete")
    public BBSResult deleteAdmin(@RequestParam(value = "id[]") AdminUser[] id) {

        BBSResult result = restProcessor(() -> {
            List<AdminUser> collect = Arrays.asList(id);
            adminUserService.deleteInBatch(collect);
            return BBSResult.ok();
        });
        return result;
    }


    @PostMapping("/saveAdminRoles")
    public BBSResult saveAdminRoles(Integer uid, Integer[] id) {

        BBSResult result = restProcessor(() -> {
            adminUserService.saveAdminRoles(uid, id);
            return BBSResult.ok();
        });
        return result;
    }

    @PostMapping("/saveAdminEnable")
    public BBSResult saveAdminEnable(@RequestParam(value = "id[]") Integer[] id) {
        BBSResult result = restProcessor(() -> {
            adminUserService.saveAdminEnable(id);
            return BBSResult.ok();
        });
        return result;
    }

}
