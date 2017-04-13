package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 获取微应用下用户的规则<br>
 {
 "errcode": 0,
 "errmsg": "ok",
 "ruleIdList": [123,456,789]
 }
 * Created by henrybit on 2017/4/12.
 * @version 1.0
 */
public class GetAppUserRuleResponse extends BaseResponse{
    @JSONField(name="ruleIdList")
    protected List<Long> ruleIdList;

    public List<Long> getRuleIdList() {
        return ruleIdList;
    }

    public void setRuleIdList(List<Long> ruleIdList) {
        this.ruleIdList = ruleIdList;
    }
}
