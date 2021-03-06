package com.ashwin.ukforum.service;

import java.util.List;
 
import com.ashwin.ukforum.model.User;
 
public interface UserService {
     
    public void addUser(User user);
 
    public User getUser(Long userid);
    
    public Long getUserId(String username);
    
    public User updateUser(User user);
    
    public User findByUsername(String username);
    
    public void deleteUser(Long userId);
    
    public List<User> getAllUsers();    
}