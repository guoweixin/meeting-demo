package com.qfjy.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MeetingPub implements Serializable {
    private String id;

    private String pcode;

    private String ptime;

    private String tname;

    private String ptitle;

    private String zone;

    private String remark;

    private Date createdate;

    private Short status;

    private Integer uid;
    private User user;

}