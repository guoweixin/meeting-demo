package com.qfjy.service;

import com.qfjy.bean.MeetingPub;

public interface MeetingPubService {
    /**
     * 根据会议编号查询会议相关信息
     * @param pcode  会议编号
     * @return
     */
    MeetingPub selectByPcode(String pcode);
}
