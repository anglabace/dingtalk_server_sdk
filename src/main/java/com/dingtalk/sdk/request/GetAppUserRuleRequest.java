package com.dingtalk.sdk.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取微应用下用户的规则
 {
 "userid": "zhangsan",
 "agentId": 12345
 }
 * Created by henrybit on 2017/4/12.
 * @version 1.0
 */
public class GetAppUserRuleRequest extends BaseRequest{
    @JSONField(name="userid")
    protected String userid;
    @JSONField(name="agentId")
    protected long agentId;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public long getAgentId() {
        return agentId;
    }

    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }
}
