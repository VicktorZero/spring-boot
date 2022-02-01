package com.springboot.dao;



import com.springboot.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public void saveUser(User user);
    public User getUserById(Long id);
    public void deleteUser(Long id);
    public User updateUser(Long id,User user);
}
