package com.qfjy.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname PayController
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/7/30 16:36
 * @Created by Administrator
 */
@RestController
@RequestMapping("pay")
public class PayController {
    @RequestMapping(value = "{telphone}",method = RequestMethod.GET)  // pay/102..
    public String selectByTelphoneBalance(@PathVariable("telphone") String telphone) {
        return telphone+"当前的余额是：19000万";
    }
}
