package com.spring.springboot.module.mapper;

import com.spring.springboot.module.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PayMapper {
    List<UserInfo> queryDatabase();
}
