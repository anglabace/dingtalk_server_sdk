package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.dingtalk.sdk.entity.AuthOrgScope;

import java.util.List;

/**
 * 获取权限范围返回报文<br>
 {
 "errcode": 0,
 "errmsg": "created",
 "auth_user_field": ["name","email"],
 "auth_org_scopes":{
 "authed_dept":[1,2,3],
 "authed_user":["user1","user"]
 }
 }
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class GetAuthScopeResponse extends BaseResponse{
    @JSONField(name="auth_user_field")
    protected List<String> authUserField; //可以得到的企业用户字段
    @JSONField(name="auth_org_scopes")
    protected AuthOrgScope authOrgScopes;

    public List<String> getAuthUserField() {
        return authUserField;
    }

    public void setAuthUserField(List<String> authUserField) {
        this.authUserField = authUserField;
    }

    public AuthOrgScope getAuthOrgScopes() {
        return authOrgScopes;
    }

    public void setAuthOrgScopes(AuthOrgScope authOrgScopes) {
        this.authOrgScopes = authOrgScopes;
    }
}
