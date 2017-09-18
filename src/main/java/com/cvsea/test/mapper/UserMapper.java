package com.cvsea.test.mapper;
import java.util.List;

import com.cvsea.test.model.User;

public interface UserMapper {    
    public User selectUserByID(int id);
    
    public List<User> selectUsers(String userName);    
    
    public void addUser(User user);
}