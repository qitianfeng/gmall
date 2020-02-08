package com.gmall.service;


import com.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<com.atguigu.gmall.bean.UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
