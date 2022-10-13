package com.mybatisdemo.service;

import java.util.List;

import com.mybatisdemo.pojo.User;


/**
 * 
* Title: UserService
* Description: 
* 用户接口 
* @author liuziyang
* @date 2022/10/13
 */
public interface UserService {
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	boolean addUser(User user);
	
	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	boolean updateUser(User user);
	
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	boolean deleteUser(int id);
	
	 /**
     * 根据用户名字查询用户信息
     * @param userName
     */
	User findUserByName(String userName);
    
    /**
     * 查询所有
     * @return
     */
	List<User> findAll();
}
