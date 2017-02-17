package com.duplicall.qm.app.controller;

import com.duplicall.qm.biz.service.user.IUser;
import com.duplicall.qm.common.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/2/7.
 */
@Controller
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUser userImpl;

    @RequestMapping("user/{id}")
    public Users queryById(@PathVariable(name = "id") int id) {
        logger.info("Query user which id is {}", id);
        return userImpl.queryById(id);
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login() {
        return "index";
    }



}
