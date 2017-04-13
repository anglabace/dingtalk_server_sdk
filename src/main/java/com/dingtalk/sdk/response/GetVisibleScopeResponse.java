package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 获取微应用的可见范围<br>
 {
 "errcode": 0,
 "errmsg": "ok",
 "isHidden":false,
 "deptVisibleScopes": [1265,9634],
 "userVisibleScopes": ["manager6577","766578"]
 }
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class GetVisibleScopeResponse extends BaseResponse{
    @JSONField(name="isHidden")
    protected boolean isHidden; //是否仅限管理员可见
    @JSONField(name="deptVisibleScopes")
    protected List<Long> deptVisibleScopes; //微应用的可见部门id列表，格式为JSON数组
    @JSONField(name="userVisibleScopes")
    protected List<String> userVisibleScopes; //微应用的可见用户id列表，格式为JSON数组

    public boolean isHidden() {
        return isHidden;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public List<Long> getDeptVisibleScopes() {
        return deptVisibleScopes;
    }

    public void setDeptVisibleScopes(List<Long> deptVisibleScopes) {
        this.deptVisibleScopes = deptVisibleScopes;
    }

    public List<String> getUserVisibleScopes() {
        return userVisibleScopes;
    }

    public void setUserVisibleScopes(List<String> userVisibleScopes) {
        this.userVisibleScopes = userVisibleScopes;
    }
}
