package com.cyou.logic;

import java.util.List;

import com.cyou.common.core.Pager;
import com.cyou.common.exception.LogicException;
import com.cyou.po.UserPo;

/**
 * 类UserLogic.java的实现描述：TODO 类实现描述
 * 
 * @author qibaichao 2014年7月21日 下午5:37:29
 */
public interface UserLogic {

    public UserPo getUserById(int userId) throws LogicException;

    public int addUser(UserPo userPo) throws LogicException;

    public int selectCount(Pager pager) throws LogicException;

    public List<UserPo> selectUserList(Pager pager) throws LogicException;

    public void deleteUser(int[] userId) throws LogicException;

    public int updateUser(UserPo userPo) throws LogicException;

}
