package com.bbs.service;

import com.bbs.common.base.BaseService;
import com.bbs.common.entity.Notification;
import com.bbs.common.entity.User;

import java.util.List;


public interface NotificationService extends BaseService<Notification>{

    /**
     * 获取用户的未读通知数量
     * @param uid
     * @return
     */
    long getNotificationCount(int uid);

    /**
     * 获取用户所有通知
     * @param user
     */
    List<Notification> findByUser(User user);

    /**
     * 根据用户删除所有通知
     * @param user
     * @return
     */
    void deleteByUser(User user);
}
