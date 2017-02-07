package com.duplicall.qm.app.controller;

import com.duplicall.qm.biz.service.user.IUser;
import com.duplicall.qm.biz.service.user.UserImpl;
import com.duplicall.qm.common.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.time.LocalDateTime;

@Controller
class HomeController {
    @Resource
    private IUser userImpl;

    @GetMapping("/")
    String index(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        User user = userImpl.queryById(1);
        System.out.println("ppppp assssfadfsssassdfadfassssd dsf psssss" + user);
        return "index";
    }

    @GetMapping("properties")
    @ResponseBody
    java.util.Properties properties() {
        return System.getProperties();
    }
}
