package com.bbs.rest.controller;

import com.bbs.common.base.BaseController;
import com.bbs.common.dto.BBSResult;
import com.bbs.common.entity.Label;
import com.bbs.common.entity.Posts;
import com.bbs.common.entity.Reply;
import com.bbs.common.entity.User;
import com.bbs.service.LabelService;
import com.bbs.service.PostsService;
import com.bbs.service.ReplyService;
import com.bbs.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @Author LHR
 * Create By 2017/8/26
 */
@Api(value = "帖子接口", description = "发布帖子,获取帖子")
@RestController
@RequestMapping("/posts")
@CrossOrigin
public class PostsController extends BaseController {

    @Autowired
    private UserService userService;

    @Autowired
    private LabelService labelService;

    @Autowired
    private PostsService postsService;

    @Autowired
    private ReplyService replyService;

    @ApiOperation("发帖接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "content", value = "帖子内容", dataType = "String"),
            @ApiImplicitParam(name = "title", value = "帖子标题", dataType = "String"),
            @ApiImplicitParam(name = "token", value = "用户令牌", dataType = "String"),
            @ApiImplicitParam(name = "labelId", value = "标签ID", dataType = "Integer")
    })
    @PostMapping
    public BBSResult CreatePosts(Posts posts, String token, Integer labelId) {
        BBSResult result = restProcessor(() -> {

            if (token == null) return BBSResult.warn("请先登录！");

            User userbytoken = userService.getUserByToken(token);
            if (userbytoken == null) return BBSResult.warn("用户不存在,请先登录！");

            User user = userService.findOne(userbytoken.getId());
            if (user.getEnable() != 1) return BBSResult.warn("用户处于封禁状态！");

            postsService.savePosts(posts, labelId, user);
            return BBSResult.ok();
        });

        return result;
    }

    @ApiOperation("翻页查询帖子接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "search", value = "查询条件", dataType = "int"),
            @ApiImplicitParam(name = "type", value = "帖子类型[top : good : ]", dataType = "String"),
            @ApiImplicitParam(name = "pageNo", value = "页码[从1开始]", dataType = "int"),
            @ApiImplicitParam(name = "length", value = "返回结果数量[默认20]", dataType = "int")
    })
    @GetMapping()
    public BBSResult GetPosts(
            @RequestParam(required = false, defaultValue = "") String search,
            @RequestParam(required = false, defaultValue = "") String type,
            @RequestParam(required = false, defaultValue = "1") int pageNo,
            @RequestParam(required = false, defaultValue = "20") int length) {
        BBSResult result = restProcessor(() -> {
            if (!type.equals("good") && !type.equals("top") && !type.equals(""))
                return BBSResult.error("类型错误!");
            Page<Posts> page = postsService.getPostsByPage(type, search, pageNo - 1, length);
            return BBSResult.ok(page.getContent(), page.getTotalElements(), page.getNumberOfElements());

        });

        return result;

    }


    @ApiOperation("翻页帖子详情与回复接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "postsid", value = "帖子的id", dataType = "int"),
            @ApiImplicitParam(name = "pageNo", value = "页码[从1开始]", dataType = "int"),
            @ApiImplicitParam(name = "length", value = "返回结果数量[默认20]", dataType = "int")
    })
    @GetMapping("/detail/{postsid}")
    public BBSResult GetPostsDetail(
            @PathVariable("postsid") Integer postsid,
            @RequestParam(required = false, defaultValue = "1") int pageNo,
            @RequestParam(required = false, defaultValue = "20") int length) {
        BBSResult result = restProcessor(() -> {
            HashMap<String, Object> map = new HashMap<>();
            Posts posts = postsService.findOne(postsid);
            if (posts == null) return BBSResult.error("帖子不存在");
            map.put("posts", posts);

            Page<Reply> page = replyService.getReplyByPage(postsid, pageNo - 1, length);
            map.put("replys", page.getContent());

            return BBSResult.ok(map, page.getTotalElements(), page.getNumberOfElements());
        });
        return result;

    }

    @ApiOperation("根据labelId获取帖子接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "labelid", value = "标签的id", dataType = "int"),
            @ApiImplicitParam(name = "pageNo", value = "页码[从1开始]", dataType = "int"),
            @ApiImplicitParam(name = "length", value = "返回结果数量[默认20]", dataType = "int"),
    })
    @GetMapping("/label/{labelid}")
    public BBSResult GetPostsByLabel(
            @PathVariable("labelid") Integer labelid,
            @RequestParam(required = false, defaultValue = "1") int pageNo,
            @RequestParam(required = false, defaultValue = "20") int length) {

        BBSResult result = restProcessor(() -> {
            Label label = labelService.findOne(labelid);
            if (label == null) return BBSResult.error("标签不存在");
            Page<Posts> page = postsService.getPostsByLabel(label, pageNo - 1, length);
            return BBSResult.ok(page.getContent(), page.getTotalElements(), page.getNumberOfElements());

        });

        return result;

    }

}
