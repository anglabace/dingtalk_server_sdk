package com.dingtalk.sdk.api;

import com.dingtalk.sdk.constant.APIAddress;
import com.dingtalk.sdk.request.*;
import com.dingtalk.sdk.response.*;
import com.dingtalk.sdk.tools.JSONTools;

/**
 * 管理APP的API工具<br>
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class ManagerAppAPI extends BaseAPI{

    public ManagerAppAPI(String accessToken) {
        super(accessToken);
    }

    /**
     * 创建一个微应用<br>
     * @param request
     * @return CreateAppResponse
     */
    public CreateAppResponse createApp(CreateAppRequest request) {
        String url = APIAddress.MANAGER_APP_CREATE;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, CreateAppResponse.class);
    }

    /**
     * 获取一个微应用可见范围<br>
     * @param request
     * @return GetVisibleScopeResponse
     */
    public GetVisibleScopeResponse getAppVisibleScope(GetVisibleScopeRequest request) {
        String url = APIAddress.MANAGER_APP_VISIBLE_SCOPE;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetVisibleScopeResponse.class);
    }

    /**
     * 设置一个微应用可见范围
     * @param request
     * @return BaseResponse
     */
    public BaseResponse setAppVisibleScope(SetVisibleScopeRequest request) {
        String url = APIAddress.MANAGER_APP_VISIBLE_SCOPE_SETTING;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        return response;
    }

    /**
     * 获取一个微应用下的用户的规则集
     * @param request
     * @return GetAppUserRuleResponse
     */
    public GetAppUserRuleResponse getUserRules(GetAppUserRuleRequest request) {
        String url = APIAddress.MANAGER_APP_GET_USER_ALL_RULE;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetAppUserRuleResponse.class);
    }

    /**
     * 获取规则绑定的用户数
     * @param request
     * @return GetRuleUserTotalResponse
     */
    public GetRuleUserTotalResponse getRuleUserTotal(GetRuleUserTotalRequest request) {
        String url = APIAddress.MANAGER_APP_RULE_GET_USER_TOTAL;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetRuleUserTotalResponse.class);
    }

    /**
     * 删除指定的规则
     * @param request
     * @return BaseResponse
     */
    public BaseResponse deleteRule(DeleteRuleRequest request) {
        String url = APIAddress.MANAGER_APP_DELETE_RULE;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        return response;
    }
}
