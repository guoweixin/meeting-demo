package com.qfjy.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qfjy.bean.User;
import com.qfjy.mapper.UserMapper;
import com.qfjy.service.MeetingPubService;
import com.qfjy.service.PayService;
import com.qfjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/7/30 9:55
 * @Created by Administrator
 */
@Service
@com.alibaba.dubbo.config.annotation.Service  //注册到注册中心中
public class UserServiceImpl implements UserService {
   @Autowired
    private UserMapper userMapper;
    @Reference(check = false)  //在注册中心将对象取出并赋值
   private MeetingPubService meetingPubService;
   @Reference(check = false) //在注册中心将对象取出并赋值
   private PayService payService;
    /**
     * 根据用户主键ID，查询用户信息
     *
     * @param id
     * @return
     */
    @Override
    public User selectByPrimaryKey(Integer id) {
        System.out.println("会议微服务的对象信息："+meetingPubService);
        System.out.println("支付微服务：余额信息是：");
        User user=userMapper.selectByPrimaryKey(id);
        System.out.println(payService.selectByTelphoneBalance(user.getTelephone()));

        user.setProvince(payService.selectByTelphoneBalance(user.getTelephone()));
        return user;
    }
}
