package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取AccessToken返回报文<br>
 {
 "errcode": 0,
 "errmsg": "ok",
 "access_token": "fw8ef8we8f76e6f7s8df8s"
 }
 * Created by henrybit on 2017/4/6.
 * @version 1.0
 */
public class GetAccessTokenResponse extends BaseResponse{
    @JSONField(name="access_token")
    protected String accessToken;
    @JSONField(name="expireTime")
    protected long expireTime = 7200; //单位秒

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }
}
