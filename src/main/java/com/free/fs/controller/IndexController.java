package com.free.fs.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.free.fs.model.User;
import com.free.fs.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final UserService userService;

    /**
     * 主页
     */
    @GetMapping({"", "/index"})
    public String index(Model model) {
        if (!StpUtil.isLogin()) {
            return "redirect:/login";
        }
        Long userId = StpUtil.getLoginIdAsLong();
        User loginUser = userService.getById(userId);
        // 登录用户信息
        model.addAttribute("loginUser", loginUser);
        return "index";
    }

    @GetMapping("/fileChoose")
    public String fileChoose() {

        return "fileChoose";
    }

    /**
     * 错误页
     */
    @RequestMapping("/error/{code}")
    public String error(@PathVariable("code") String code) {
        if ("403".equals(code)) {
            return "error/403";
        } else if ("500".equals(code)) {
            return "error/500";
        }
        return "error/404";
    }
}
