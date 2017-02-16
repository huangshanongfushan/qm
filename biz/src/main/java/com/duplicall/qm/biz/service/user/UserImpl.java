package com.duplicall.qm.biz.service.user;

import com.duplicall.qm.common.model.Users;
import com.duplicall.qm.dao.mapper.UsersMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/7.
 */
@Service
public class UserImpl implements IUser {

    @Autowired
    private UsersMapper usersMapper;
    private static Logger logger = LoggerFactory.getLogger(UserImpl.class);


    @Override
    public Users queryById(int id) {
        logger.debug("query user which id is ", id);
        return usersMapper.selectByPrimaryKey(1);
    }
}
