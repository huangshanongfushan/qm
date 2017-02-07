package com.duplicall.qm.dao.user;

import com.duplicall.qm.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/7.
 */
@Repository
public class UserDao implements IUserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User selectById(int id) {
        SqlRowSet sqlRowSet = jdbcTemplate.queryForRowSet("SELECT * FROM  USERS WHERE id = ?", id);
        List<User> userList = new ArrayList<User>();
        while (sqlRowSet.next()) {
            User user = new User();
            user.setId(sqlRowSet.getInt("id"));
            user.setLoginId(sqlRowSet.getString("login_Id"));
            return user;
        }
        return null;
    }
}
