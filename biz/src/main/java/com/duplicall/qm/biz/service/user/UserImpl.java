package com.duplicall.qm.biz.service.user;

import com.duplicall.qm.common.model.User;
import com.duplicall.qm.dao.user.IUserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/2/7.
 */
@Service
public class UserImpl implements IUser {
    @Resource
    private IUserDao userDao;
    private static Logger logger = LoggerFactory.getLogger(UserImpl.class);

    @Override
    public void addUser(User user) {
    }

    @Override
    public User queryById(int id) {
        logger.debug("query user which id is ", id);
        return userDao.selectById(id);
    }
}
