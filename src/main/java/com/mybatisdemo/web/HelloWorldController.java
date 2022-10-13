package com.mybatisdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatisdemo.pojo.User;

/**
 * 
* Title: HelloWorldController
* Description: springboot 接口测试
* 首先启动 Application 程序，然后在浏览器输入http://localhost:8080/hello
* 即可查看信息
* 在类中添加  @RestController, 默认类中的方法都会以json的格式返回
* @author liuziyang
* @date 2022/10/13
 */
@RestController
public class HelloWorldController {
	
    @RequestMapping("/hello")
    public String index() {
    	System.out.println("---------开始----------");
        return "Hello World";
    }
    
     
    @RequestMapping("/getUser")
    public User getUser() {
    	System.out.println("---------开始----------");
    	User user=new User();
    	user.setId(2);
    	user.setName("李四");
        return user;
    }
    
    
}
