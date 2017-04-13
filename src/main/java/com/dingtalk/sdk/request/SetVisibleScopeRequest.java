package com.dingtalk.sdk.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 设置微应用的可见范围请求体<br>
 {
 "agentId": 16691682,
 "isHidden":false,
 "deptVisibleScopes":[1,2],
 "userVisibleScopes":["userId1","userId2"]
 }
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class SetVisibleScopeRequest extends BaseRequest{
    @JSONField(name="agentId")
    protected long agentId;
    @JSONField(name="isHidden")
    protected boolean isHidden;
    @JSONField(name="deptVisibleScopes")
    protected List<Long> deptVisibleScopes;
    @JSONField(name="userVisibleScopes")
    protected List<String> userVisibleScopes;

    public long getAgentId() {
        return agentId;
    }

    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }

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
