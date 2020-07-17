package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2020-07-16.
 */
@Controller
public class UserController
{

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    @ResponseBody
     public String index(){

        System.out.println("这个类的方法是可以访问的！");

        return "这个类的方法是可以访问的！";

     }

     @RequestMapping("/userList")
     @ResponseBody
     public  String getAllList(){

         List<UmsMember> allUser = userService.getAllUser();
            if(allUser!=null&&allUser.size()>0){
         }
         return allUser.toString();

     }




}
