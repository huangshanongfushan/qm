package com.duplicall.qm.app.controller;

import com.duplicall.qm.biz.service.user.IUser;
import com.duplicall.qm.common.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/7.
 */
@RestController
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUser userImpl;

    @RequestMapping("user/{id}")
    public User queryById(@PathVariable(name = "id") int id) {
        logger.info("Query user which id is {}", id);
        return userImpl.queryById(id);
    }
}
