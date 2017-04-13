package com.dingtalk.sdk.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 删除规则<br>
 {
 "agentId":12345,
 "ruleId":67890
 }
 * Created by henrybit on 2017/4/12.
 * @version 1.0
 */
public class DeleteRuleRequest extends BaseRequest{
    @JSONField(name="agentId")
    protected long agentId;
    @JSONField(name="ruleId")
    protected long ruleId;

    public long getAgentId() {
        return agentId;
    }

    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }

    public long getRuleId() {
        return ruleId;
    }

    public void setRuleId(long ruleId) {
        this.ruleId = ruleId;
    }
}
