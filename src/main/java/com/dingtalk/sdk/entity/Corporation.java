package com.dingtalk.sdk.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 钉钉上的公司信息<br>
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class Corporation extends BaseModel{
    @JSONField(name="corp_name")
    protected String corpName; //公司名字
    @JSONField(name="corpid")
    protected String corpid; //公司corpid

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getCorpid() {
        return corpid;
    }

    public void setCorpid(String corpid) {
        this.corpid = corpid;
    }
}
