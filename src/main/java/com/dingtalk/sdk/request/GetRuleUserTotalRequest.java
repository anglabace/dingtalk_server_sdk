package com.dingtalk.sdk.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 获取规则绑定的用户数<br>
 {
 "agentId": 12345,
 "ruleIdList": [123,456]
 }
 * Created by henrybit on 2017/4/12.
 * @version 1.0
 */
public class GetRuleUserTotalRequest extends BaseRequest{
    @JSONField(name="agentId")
    protected long agentId;
    @JSONField(name="ruleIdList")
    protected List<Long> ruleIdList; //需要查询的规则id集合

    public long getAgentId() {
        return agentId;
    }

    public void setAgentId(long agentId) {
        this.agentId = agentId;
    }

    public List<Long> getRuleIdList() {
        return ruleIdList;
    }

    public void setRuleIdList(List<Long> ruleIdList) {
        this.ruleIdList = ruleIdList;
    }
}
