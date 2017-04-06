package com.dingtalk.sdk.api;

import com.dingtalk.sdk.constant.Config;
import com.dingtalk.sdk.entity.ResultType;
import com.dingtalk.sdk.response.BaseResponse;
import com.dingtalk.sdk.tools.CollectionTools;
import com.dingtalk.sdk.tools.NetWorkCenter;
import com.dingtalk.sdk.tools.StringTools;

import java.io.File;
import java.util.HashMap;
import java.util.List;

/**
 * API基类，提供一些通用方法<br>
 * 包含自动刷新token、通用get post请求等
 * @author peiyu,henrybit
 * @since 1.2
 * @version 2.0
 */
public abstract class BaseAPI {

    protected HashMap<String, String> header = new HashMap<String, String>();

    protected Config config;
    protected String accessToken;

    protected BaseAPI(Config config){
        this.config = config;
        header.put("Content-Type", "application/json");
    }

    protected BaseAPI(String accessToken) {
    	this.accessToken = accessToken;
        header.put("Content-Type", "application/json");
    }


    /**
     * 通用post请求
     *
     * @param url  地址，其中token用ACCESS_TOKEN代替
     * @param json 参数，json格式
     * @return 请求结果
     */
    protected BaseResponse executePost(String url, String json) {
        return executePost(url, json, null);
    }

    /**
     * 通用post请求
     *
     * @param url  地址，其中token用ACCESS_TOKEN代替
     * @param json 参数，json格式
     * @param file 上传的文件
     * @return 请求结果
     */
    protected BaseResponse executePost(String url, String json, File file) {
        BaseResponse response;
        List<File> files = null;
        if (null != file) {
            files = CollectionTools.newArrayList(file);
        }
        //需要传token
        String postUrl = "";
        if (StringTools.isNotEmpty(accessToken)) {
        	postUrl = url.replace("ACCESS_TOKEN", accessToken);
        } else if (config != null) {
            postUrl = url;
            if (StringTools.isNotEmpty(config.corpId))
                postUrl = postUrl.replace("CORPID", config.corpId);
            if (StringTools.isNotEmpty(config.corpSecret))
                postUrl = postUrl.replace("CORPSECRET", config.corpSecret);
            if (StringTools.isNotEmpty(config.ssoSecret))
                postUrl = postUrl.replace("SSOSECRET", config.ssoSecret);
            if (StringTools.isNotEmpty(config.channelSecret))
                postUrl = postUrl.replace("CHANNELSECRET", config.channelSecret);
        }
        if (StringTools.isNotEmpty(postUrl)) return null;
        response = NetWorkCenter.post(postUrl, json, files);
        return response;
    }


    /**
     * 通用get请求
     *
     * @param url 地址，其中token用ACCESS_TOKEN代替
     * @return 请求结果
     */
    protected BaseResponse executeGet(String url) {
        BaseResponse response;
        if (StringTools.isEmpty(url))
            return null;
        //需要传token
        String getUrl = "";
        if (StringTools.isNotEmpty(accessToken)) {
        	getUrl = url.replace("ACCESS_TOKEN", accessToken);
        } else if (config != null) {
            getUrl = url;
            if (StringTools.isNotEmpty(config.corpId))
                getUrl = getUrl.replace("CORPID", config.corpId);
            if (StringTools.isNotEmpty(config.corpSecret))
                getUrl = getUrl.replace("CORPSECRET", config.corpSecret);
            if (StringTools.isNotEmpty(config.ssoSecret))
                getUrl = getUrl.replace("SSOSECRET", config.ssoSecret);
            if (StringTools.isNotEmpty(config.channelSecret))
                getUrl = getUrl.replace("CHANNELSECRET", config.channelSecret);
        }
        if (StringTools.isEmpty(getUrl)) return null;
        response = NetWorkCenter.get(getUrl);
        return response;
    }

    /**
     * 判断本次请求是否成功
     *
     * @param errCode 错误码
     * @return 是否成功
     */
    protected boolean isSuccess(String errCode) {
        return ResultType.SUCCESS.getCode().toString().equals(errCode);
    }
}
