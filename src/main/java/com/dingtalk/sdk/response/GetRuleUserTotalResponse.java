package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 获取规则绑定的用户数<br>
 {
 "errcode": 0,
 "errmsg": "ok",
 "result": [
 {
 "ruleId": 123,
 "userTotal": 100
 },
 {
 "ruleId": 456,
 "userTotal": 1200
 }
 ]
 }
 * Created by henrybit on 2017/4/12.
 * @version 1.0
 */
public class GetRuleUserTotalResponse extends BaseResponse{
    @JSONField(name="result")
    protected List<UserTotalResult> resultList;

    public List<UserTotalResult> getResultList() {
        return resultList;
    }

    public void setResultList(List<UserTotalResult> resultList) {
        this.resultList = resultList;
    }

    public static class UserTotalResult {
        @JSONField(name="ruleId")
        protected long ruleId;
        @JSONField(name="userTotal")
        protected long userTotal;

        public long getRuleId() {
            return ruleId;
        }

        public void setRuleId(long ruleId) {
            this.ruleId = ruleId;
        }

        public long getUserTotal() {
            return userTotal;
        }

        public void setUserTotal(long userTotal) {
            this.userTotal = userTotal;
        }
    }
}
