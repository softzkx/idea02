package com.huarui.entity;

/**
 * Created by Administrator on 2017/11/3.
 */
public class Users {

    private Integer uid;
    private String Uname;
    //自动 get  set  tostring的快借鉴（alt+insert）
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return Uname;
    }

    public void setUname(String uname) {
        Uname = uname;
    }
}
