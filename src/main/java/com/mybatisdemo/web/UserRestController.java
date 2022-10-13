package com.mybatisdemo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mybatisdemo.pojo.User;
import com.mybatisdemo.service.UserService;



/**
 * 
* Title: UserRestController
* Description: 
* 用户控制层
* @author liuziyang
* @date 2022/10/13
 */
@RestController
@RequestMapping("api")
public class UserRestController {
	@Autowired
    private UserService userService;
 
	@RequestMapping("/add/{userId}/{userName}/{userAge}")
    public boolean addUser(@PathVariable("userId") int userId, @PathVariable("userName") String userName,
                           @PathVariable("userAge") int userAge) {
    	System.out.println("开始新增...");
        User user = new User();
        user.setId(userId);
        user.setName(userName);
        user.setAge(userAge);
        return userService.addUser(user);
    }

    @RequestMapping("/update/{userId}/{userName}/{userAge}")
    public boolean updateUser(@PathVariable("userId") int userId, @PathVariable("userName") String userName,
                              @PathVariable("userAge") int userAge) {
    	System.out.println("开始更新...");
        User user = new User();
        user.setId(userId);
        user.setName(userName);
        user.setAge(userAge);
        return userService.updateUser(user);
    }

    @RequestMapping("/delete/{userId}")
    public boolean delete(@PathVariable("userId") int userId) {
    	System.out.println("开始删除...");
        return userService.deleteUser(userId);
    }

    @RequestMapping("/select/{userName}")
    public User findByUserName(@PathVariable("userName") String userName) {
    	System.out.println("开始查询...");
        return userService.findUserByName(userName);
    }
    
    
    @GetMapping("/selectAll")
    public List<User> findByUserAge() {
    	System.out.println("开始查询所有数据...");
        return userService.findAll();
    }
}
