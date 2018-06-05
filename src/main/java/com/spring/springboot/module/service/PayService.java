package com.spring.springboot.module.service;

import com.spring.springboot.module.mapper.PayMapper;
import com.spring.springboot.module.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayService {

    @Autowired
    private PayMapper payMapper;

    public List<UserInfo> queryDatabase(){
        return payMapper.queryDatabase();
    }
}
