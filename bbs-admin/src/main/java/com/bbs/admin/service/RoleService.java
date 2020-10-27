package com.bbs.admin.service;

import com.bbs.common.base.BaseService;
import com.bbs.common.dto.BBSResult;
import com.bbs.common.entity.Permission;
import com.bbs.common.entity.Role;
import org.springframework.data.domain.Page;


public interface RoleService extends BaseService<Role> {

    /**
     * 根据用户id查询用户的角色
     *
     * @param id
     * @return
     */
    BBSResult findRolesAndSelected(Integer id);

    /**
     * 翻页查询
     * @param pageNo
     * @param length
     * @return
     */
    Page<Role> findByPage(int pageNo, int length);

    /**
     * 保存角色的权限
     * @param roleid
     * @param pers
     */
    void saveRolePermission(Integer roleid, Permission[] pers);
}
