package com.qfjy.service.impl;

import com.qfjy.service.PayService;
import org.springframework.stereotype.Service;

/**
 * @Classname PayServiceImpl
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/7/30 16:35
 * @Created by Administrator
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class PayServiceImpl implements PayService {
    /**
     * 根据用户手机号 余询余额信息
     *
     * @param telphone
     */
    @Override
    public String selectByTelphoneBalance(String telphone) {
        return telphone+"当前的余额是：19000万";
    }
}
