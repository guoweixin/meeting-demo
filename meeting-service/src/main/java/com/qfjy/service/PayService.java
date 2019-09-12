package com.qfjy.service;

public interface PayService {
    /**
     * 根据用户手机号 余询余额信息
     */
    public String selectByTelphoneBalance(String telphone);
}
