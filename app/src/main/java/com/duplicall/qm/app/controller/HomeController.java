package com.duplicall.qm.app.controller;

import com.duplicall.qm.biz.service.user.IUser;
import com.duplicall.qm.common.model.Users;
import com.duplicall.qm.common.model.UsersExample;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
class HomeController {
    @Resource
    private IUser userImpl;

    @GetMapping("/login")
    String index() {
        return "login";
    }

    @GetMapping("/home")
    String home() {
        return "login";
    }

    @GetMapping("properties")
    @ResponseBody
    java.util.Properties properties() {
        return System.getProperties();
    }

    @GetMapping("teamBoard")
    public String teamBoard() {
        return "teams_board";
    }

    @GetMapping("contacts")
    public String contacts(Model model) {
        List<Users> usersList = userImpl.selectByExample(new UsersExample());
        model.addAttribute("userList", usersList);
        return "contacts";
    }

}
