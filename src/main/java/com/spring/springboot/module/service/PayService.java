package com.spring.springboot.module.service;

import com.spring.springboot.module.mapper.PayMapper;
import com.spring.springboot.module.model.UserInfo;
import com.spring.springboot.module.model.dto.PayQueryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayService {

    @Autowired
    private PayMapper payMapper;

    public List<UserInfo> queryDatabase(PayQueryData payQueryData){
        //参数传递
        return payMapper.queryDatabase(payQueryData);
    }

    /**
     * 查询总条数
     * @return 总条数
     */
    public Integer queryTotal(PayQueryData payQueryData){
        return payMapper.queryTotal(payQueryData);
    }
}
