package com.duplicall.qm.app.controller;

import com.duplicall.qm.biz.service.user.IUser;
import com.duplicall.qm.common.model.User;
import com.duplicall.qm.common.model.Users;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/7.
 */
@RestController
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private IUser userImpl;

    @RequestMapping("user/{id}")
    public Users queryById(@PathVariable(name = "id") int id) {
        logger.info("Query user which id is {}", id);
        return userImpl.queryById(id);
    }

    /**
     * Post 请求
     *
     * @param request
     * @param user
     * @return
     */
    @RequestMapping(value = "user", method = RequestMethod.POST)
    public String addUser(HttpServletRequest request, @RequestBody User[] user) {
        logger.info("post method");
        return "";
    }

    @RequestMapping("users/info")
    public List<User> queryAllUsers() {
        logger.info("query all users ");
        User user = new User();
        user.setLoginId("admin");
        User user1 = new User();
        user1.setLoginId("admin1");
        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);
        return userList;
    }
}
