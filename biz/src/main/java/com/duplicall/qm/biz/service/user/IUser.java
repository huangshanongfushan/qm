package com.duplicall.qm.biz.service.user;

import com.duplicall.qm.common.model.Users;
import com.duplicall.qm.common.model.UsersExample;

import java.util.List;

/**
 * Created by Administrator on 2017/2/7.
 */
public interface IUser {

    Users queryById(int id);
    List<Users> selectByExample(UsersExample usersExample);
}
