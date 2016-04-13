package com.cyou.logic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.cyou.common.core.BusinessLogicImpl;
import com.cyou.common.core.Pager;
import com.cyou.common.exception.LogicException;
import com.cyou.logic.UserLogic;
import com.cyou.po.UserPo;

/**
 * 类UserLogicImpl.java的实现描述：TODO 类实现描述
 *
 * @author qibaichao 2014年7月21日 下午5:37:57
 */
@Service
public class UserLogicImpl extends BusinessLogicImpl implements UserLogic {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public UserPo getUserById(int userId) throws LogicException {
        String userAccountSql = "select user_id,user_name,email,phone,address,age from t_user_test where user_id=" + userId;
        UserPo po = (UserPo) jdbcTemplate.queryForObject(userAccountSql, UserPo.class);
        return po;
    }

    @Override
    public int addUser(UserPo userPo) throws LogicException {
        return jdbcTemplate.update("");
    }

    @Override
    public void deleteUser(int[] userIds) throws LogicException {
         jdbcTemplate.execute("");

    }

    @Override
    public int updateUser(UserPo userPo) throws LogicException {
        return jdbcTemplate.update("");
    }

    @Override
    public int selectCount(Pager pager) throws LogicException {
        return jdbcTemplate.update("");
    }

    @Override
    public List<UserPo> selectUserList(Pager pager) throws LogicException {
        return null;
    }

}
