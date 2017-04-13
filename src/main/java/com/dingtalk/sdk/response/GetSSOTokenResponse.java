package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 获取SSO登录授权Token
 * Created by henrybit on 2017/4/10.
 * @version 1.0
 */
public class GetSSOTokenResponse extends BaseResponse{
    @JSONField(name="access_token")
    protected String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
