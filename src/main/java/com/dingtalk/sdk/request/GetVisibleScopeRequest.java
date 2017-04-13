package com.dingtalk.sdk.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取微应用可见范围请求参数<br>
 {
 "agentId": 16691682,
 }
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class GetVisibleScopeRequest extends BaseRequest{
    @JSONField(name="agentId")
    protected long agentId; //需要查询的微应用agentId

    public long getAgentId() {
        return agentId;
    }

    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }
}
