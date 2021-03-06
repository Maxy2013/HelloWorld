package com.spring.springboot.module.web;

import com.spring.springboot.module.model.PayInfo;
import com.spring.springboot.module.model.PaymentOrderVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dataChange")
public class DataChangeController {

    @RequestMapping("/queryData")
    public String queryData(){
        System.out.print("---->>");

        List<PaymentOrderVO> paymentOrderVOS = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            PaymentOrderVO paymentOrder = new PaymentOrderVO();
            paymentOrder.setUserId("u2233" + i);
            paymentOrder.setOrderNo("201811111122222-" + i);
            paymentOrder.setPaymentMoney("3" + i);
            paymentOrder.setStatus("4");
            paymentOrder.setType("2");

            paymentOrderVOS.add(paymentOrder);
        }


        PayInfo payInfo = new PayInfo();
        payInfo.setGoodsType("4");
        payInfo.setPayDate("2018-06-04 13:23:23");
        payInfo.setOrderInfo(paymentOrderVOS);
        return payInfo.toString();
    }

    @GetMapping("/insertData")
    public void insertData(){

    }
}
