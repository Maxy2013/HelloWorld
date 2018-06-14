package com.spring.springboot.module.mapper;

import com.spring.springboot.module.model.UserInfo;
import com.spring.springboot.module.model.dto.PayQueryData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PayMapper {
    List<UserInfo> queryDatabase(PayQueryData payQueryData/*接受参数，然后修改mapper.xml*/);

    /**
     * 查询总条数
     * @return 总条数
     */
    Integer queryTotal(PayQueryData payQueryData);
}
