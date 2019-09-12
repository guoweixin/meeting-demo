package com.qfjy.web.controller;

import com.qfjy.bean.User;
import com.qfjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname UserController
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/7/30 9:57
 * @Created by Administrator
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value ="{id}",method = RequestMethod.GET)
    public User selectById(@PathVariable("id")Integer id){
        return  userService.selectByPrimaryKey(id);
    }
}
