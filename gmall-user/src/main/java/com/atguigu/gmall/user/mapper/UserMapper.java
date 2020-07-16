package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * Created by Administrator on 2020-07-16.
 */
public interface UserMapper {


    public List<UmsMember> selectAllUser();

}
