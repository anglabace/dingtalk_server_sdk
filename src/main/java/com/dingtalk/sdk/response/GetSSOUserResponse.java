package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * SSO免登获取用户信息<br>
 {
 "errcode": 0,
 "errmsg": "ok",
 "userid": "USERID",
 "deviceId":"DEVICEID",
 "is_sys": true,
 "sys_level": 0|1|2
 }
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class GetSSOUserResponse extends BaseResponse{
    @JSONField(name="userid")
    protected String userid; //员工在企业内的UserID
    @JSONField(name="deviceId")
    protected String deviceId; //手机设备号,由钉钉在安装时随机产生
    @JSONField(name="is_sys")
    protected boolean isSys; //是否是管理员
    @JSONField(name="sys_level")
    protected int sysLevel; //级别，0：非管理员 1：超级管理员（主管理员） 2：普通管理员（子管理员） 100：老板

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public boolean isSys() {
        return isSys;
    }

    public void setSys(boolean sys) {
        isSys = sys;
    }

    public int getSysLevel() {
        return sysLevel;
    }

    public void setSysLevel(int sysLevel) {
        this.sysLevel = sysLevel;
    }
}
