package com.bbs.controller;

import com.bbs.common.base.BaseController;
import com.bbs.common.dto.BBSResult;
import com.bbs.common.entity.Reply;
import com.bbs.common.entity.User;
import com.bbs.service.ReplyService;
import com.bbs.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "回复接口", description = "对帖子进行回复,点赞回复等服务")
@RestController
@RequestMapping("/reply")
public class ReplyController extends BaseController{

    @Autowired
    private com.bbs.controller.WebSocketController webSocketController;

    @Autowired
    private UserService userService;

    @Autowired
    private ReplyService replyService;
    @ApiOperation("发布回复接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "content", value = "回复内容", dataType = "String"),
            @ApiImplicitParam(name = "token", value = "用户令牌", dataType = "String"),
            @ApiImplicitParam(name = "postsId", value = "帖子ID", dataType = "Integer")
    })
    @PostMapping
    public BBSResult CreateReply(Reply reply,Integer postsId,String token){
        BBSResult result = restProcessor(() -> {
            if (token == null) return BBSResult.warn("请先登录！");

            User userbytoken = userService.getUserByToken(token);
            if (userbytoken == null) return BBSResult.warn("用户不存在,请先登录！");

            User user = userService.findOne(userbytoken.getId());
            if (user.getEnable() != 1) return BBSResult.warn("用户处于封禁状态！");

            replyService.saveReply(reply, postsId, user);
            return BBSResult.ok();
        });
        return result;
    }


}
