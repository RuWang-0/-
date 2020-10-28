package com.bbs.rest.service.impl;

import com.bbs.common.base.BaseServiceImpl;
import com.bbs.common.dao.NotificationDao;
import com.bbs.common.entity.Notification;
import com.bbs.common.entity.User;
import com.bbs.rest.service.NotificationService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Author LHR
 * Create By 2017/9/6
 */
@Service
@Transactional
public class NotificationServiceImpl extends BaseServiceImpl<NotificationDao,Notification> implements NotificationService{

    @Override
    public long getNotificationCount(int uid) {
        return repository.getNotificationCount(uid);
    }

    @Override
    public List<Notification> findByUser(User user) {
        List<Notification> list = repository.getByTouserOrderByInitTimeDesc(user);
        repository.updateByIsRead(user);
        return list;
    }

    @Override
    public void deleteByUser(User user) {
        List<Notification> list = repository.getByTouserOrderByInitTimeDesc(user);
        repository.deleteInBatch(list);
    }
}
