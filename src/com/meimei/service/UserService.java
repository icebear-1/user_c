package com.meimei.service;

import com.meimei.dao.UserDao;
import com.meimei.entity.User;

import java.util.List;

public class UserService {
    private UserDao userDao=new UserDao();
    public List<User> list(){
        return userDao.list();
    }
    public void addUser(User user){
        user.setId(null);
        user.setDeptId(null);
        userDao.addUser(user);
    }
    public User getUserById(Integer id){
        return userDao.getUserById(id);
    }
    public void updateUser(User user){
        userDao.updateUser(user);
    }
    public void deleteById(Integer id){
        userDao.deleteById(id);
    }


}
