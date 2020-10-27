package com.bbs.admin.service;

import com.bbs.common.base.BaseService;
import com.bbs.common.entity.Reply;
import org.springframework.data.domain.Page;


public interface ReplyService extends BaseService<Reply>{

    /**
     * 翻页条件查询回复
     * @param reply
     * @param pageNo
     * @param length
     * @return
     */
   Page<Reply> findByPage(Reply reply, int pageNo, int length);

   
}
