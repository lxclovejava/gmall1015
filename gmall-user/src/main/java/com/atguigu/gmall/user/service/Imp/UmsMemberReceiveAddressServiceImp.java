package com.atguigu.gmall.user.service.Imp;

import com.atguigu.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.user.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UmsMemberReceiveAddressServiceImp implements UmsMemberReceiveAddressService {
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


}
