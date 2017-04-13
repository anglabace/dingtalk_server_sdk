package com.dingtalk.sdk.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 授权范围实体<br>
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class AuthOrgScope extends BaseModel{
    @JSONField(name="authed_dept")
    protected List<Long> authedDept; //企业授权的部门id列表
    @JSONField(name="authed_user")
    protected List<String> authedUser; //企业授权的员工userid列表

    public List<Long> getAuthedDept() {
        return authedDept;
    }

    public void setAuthedDept(List<Long> authedDept) {
        this.authedDept = authedDept;
    }

    public List<String> getAuthedUser() {
        return authedUser;
    }

    public void setAuthedUser(List<String> authedUser) {
        this.authedUser = authedUser;
    }
}
