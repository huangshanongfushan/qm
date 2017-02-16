package com.duplicall.qm.biz.service.user;

import com.duplicall.qm.common.model.User;
import com.duplicall.qm.common.model.Users;

/**
 * Created by Administrator on 2017/2/7.
 */
public interface IUser {
    void addUser(User user);

    Users queryById(int id);
}
