package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * Created by Administrator on 2020-07-16.
 */
public interface UserService {

    //会员信息查询
    public List<UmsMember> getAllUser();
      //会员新增
    public void  InsetUser(UmsMember user);
    //修改
    public void  updateUser(UmsMember user);

    //会员信息删除

    public void deleteUser(UmsMember user);

}
