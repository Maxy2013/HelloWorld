package com.spring.springboot.module.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.spring.springboot.module.model.PayInfo;
import com.spring.springboot.module.model.PaymentOrderVO;
import com.spring.springboot.module.model.UserInfo;
import com.spring.springboot.module.model.dto.PayQueryData;
import com.spring.springboot.module.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private PayService payService;

    @RequestMapping("/getPayInfo")
    public PayInfo getPayInfo(String id, String name){
        System.out.print("---->>");

        List<PaymentOrderVO> paymentOrderVOS = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            PaymentOrderVO paymentOrder = new PaymentOrderVO();
            paymentOrder.setUserId("u2233" + name);
            paymentOrder.setOrderNo("201811111122222-" + id);
            paymentOrder.setPaymentMoney("3" + i);
            paymentOrder.setStatus("4");
            paymentOrder.setType("2");

            paymentOrderVOS.add(paymentOrder);
        }


        PayInfo payInfo = new PayInfo();
        payInfo.setGoodsType("4");
        payInfo.setPayDate("2018-06-04 13:23:23");
        payInfo.setOrderInfo(paymentOrderVOS);
        return payInfo;
    }
    @RequestMapping("/queryDatabase")
    public String queryDatabase(String id, Integer page, Integer limit){
        //这里返回的就是页面中接收到的data，是个集合，集合中有元素，我们只看集合元素中的属性

        PayQueryData payQueryData = new PayQueryData();
        payQueryData.setId(id);
        payQueryData.setLimit(limit);
        payQueryData.setStart((page - 1) * limit);//先请求

        Integer count = payService.queryTotal(payQueryData);

        //参数传递到mapper中进行查询数据库
        List<UserInfo> userInfos = payService.queryDatabase(payQueryData);
        JSONObject obj = new JSONObject();
        obj.put("code", "0");
        obj.put("msg", "加载成功");
        obj.put("count", count);
        obj.put("data", userInfos);
        return obj.toJSONString();
    }

    @RequestMapping("/selectDatabase")
    public List<UserInfo> selectDatabase(PayQueryData payQueryData){
        return payService.queryDatabase(payQueryData);
    }
}
