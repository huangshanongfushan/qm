package com.duplicall.qm.dao.user;

import com.duplicall.qm.common.model.User;

/**
 * Created by Administrator on 2017/2/7.
 */
public interface IUserDao {
    User selectById(int id);
}
