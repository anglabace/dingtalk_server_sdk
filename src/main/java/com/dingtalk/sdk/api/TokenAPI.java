package com.dingtalk.sdk.api;

import com.dingtalk.sdk.constant.APIAddress;
import com.dingtalk.sdk.constant.Config;
import com.dingtalk.sdk.response.*;
import com.dingtalk.sdk.tools.JSONTools;

/**
 * 口令相关授权API
 * Created by henrybit on 2017/4/6.
 * @version 1.0
 */
public class TokenAPI extends BaseAPI{

    public TokenAPI(Config config) {
        super(config);
    }

    /**
     * Get方式获取一个AccessToken<br>
     * AccessToken是企业访问钉钉开放平台接口的全局唯一票据，调用接口时需携带AccessToken。
     * AccessToken需要用CorpID和CorpSecret来换取，不同的CorpSecret会返回不同的AccessToken。正常情况下AccessToken有效期为7200秒，有效期内重复获取返回相同结果，并自动续期
     * @return GetAccessTokenResponse
     */
    public GetAccessTokenResponse createAccessToken() {
        String url = APIAddress.GET_ACCESS_TOKEN;
        BaseResponse response = executeGet(url);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetAccessTokenResponse.class);
    }


    /**
     * 获取微应用后台管理免登SsoToken<br>
     * SsoToken只在微应用后台管理免登服务中使用
     * @return
     */
    public GetSSOTokenResponse createSSOToken() {
        String url = APIAddress.GET_SSO_TOKEN;
        BaseResponse response = executeGet(url);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetSSOTokenResponse.class);
    }

    /**
     * 免登获取用户信息<br>
     * @return GetSSOUserResponse
     */
    public GetSSOUserResponse getSSOUser(String code) {
        String url = APIAddress.SSO_USER_INFO;
        url = url.replace("CODE", code);
        BaseResponse response = executeGet(url);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetSSOUserResponse.class);
    }

    /**
     * 免登录获取管理员信息<br>
     * @param code
     * @return GetSSOAdminResponse
     */
    public GetSSOAdminResponse getSSOAdmin(String code) {
        String url = APIAddress.SSO_ADMIN_INFO;
        url = url.replace("CODE", code);
        BaseResponse response = executeGet(url);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetSSOAdminResponse.class);
    }
}
