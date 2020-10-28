package com.bbs.porent.interceptor;

import com.bbs.porent.entity.User;
import com.bbs.porent.service.UserService;
import com.bbs.porent.utils.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginInterceptor implements HandlerInterceptor {

    private UserService userService;

    @Value("${cookie_name}")
    private String CookieName;

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

        String token = CookieUtils.getCookieValue(httpServletRequest, "BBS_TOKEN");
        if (token==null) {
            httpServletResponse.sendRedirect("/user/login");
            return false;
        }
        User user = userService.getUserByApi(token);

        if (user == null) {
            httpServletResponse.sendRedirect("/user/login");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
