package com.dingtalk.sdk.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 管理员
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class Admin extends User{
    @JSONField(name="sys_level")
    protected int sysLevel; //管理员角色 1:主管理员,2:子管理员

    public int getSysLevel() {
        return sysLevel;
    }

    public void setSysLevel(int sysLevel) {
        this.sysLevel = sysLevel;
    }
}
