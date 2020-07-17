package com.atguigu.gmall.user.service.Imp;

import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2020-07-16.
 */
@Service
public class UserServiceImp implements UserService{

      @Autowired
      private UserMapper userMapper;




       /*public List<UmsMemberReceiveAddress> getMenberList(String menbId){


       }*/

      public List<UmsMember> getAllUser(){
            List<UmsMember> umsMembers = userMapper.selectAll();
            return umsMembers;

      }

      public void  InsetUser(UmsMember user){
           int num = userMapper.insert(user);


      }

      @Override
      public void updateUser(UmsMember user) {
            userMapper.updateByPrimaryKey(user);
      }

      @Override
      public void deleteUser(UmsMember user) {
            userMapper.updateByPrimaryKey(user);
      }


}
