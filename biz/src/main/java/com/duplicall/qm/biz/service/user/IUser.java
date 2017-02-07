package com.duplicall.qm.biz.service.user;

import com.duplicall.qm.common.model.User;

/**
 * Created by Administrator on 2017/2/7.
 */
public interface IUser {
    void addUser(User user);

    User queryById(int id);
}
