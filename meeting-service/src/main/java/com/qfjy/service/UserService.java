package com.qfjy.service;

import com.qfjy.bean.User;

public interface UserService {
    /**
     * 根据用户主键ID，查询用户信息
     * @param id
     * @return
     */
    User selectByPrimaryKey(Integer id);
}
