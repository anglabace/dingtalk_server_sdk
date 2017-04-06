package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 通过unionid获取用户ID<br>
 {
 "errcode": 0,
 "errmsg": "ok",
 "userid": "zhangsan"
 }
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class GetUserIdResponse extends BaseResponse {
    @JSONField(name="userid")
    protected String userid; //用户唯一标识

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
