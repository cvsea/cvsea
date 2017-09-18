package com.cvsea.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvsea.test.mapper.UserMapper;
import com.cvsea.test.model.User;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(int P_UserID){
        User user=userMapper.selectUserByID(P_UserID);
        //User user=null;
        return user;
    }

}
