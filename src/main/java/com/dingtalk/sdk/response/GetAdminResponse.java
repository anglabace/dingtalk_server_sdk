package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.dingtalk.sdk.entity.Admin;

import java.util.List;

/**
 * 获取管理员返回报文<br>
 {
     "errcode": 0,
     "errmsg": "ok",
     "adminList":[
         {"sys_level":2,"userid":"123abc"}
         {"sys_level":1,"userid":"456efg"}
     ]
 }
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class GetAdminResponse extends BaseResponse{
    @JSONField(name="adminList")
    protected List<Admin> adminList;

    public List<Admin> getAdminList() {
        return adminList;
    }

    public void setAdminList(List<Admin> adminList) {
        this.adminList = adminList;
    }
}
