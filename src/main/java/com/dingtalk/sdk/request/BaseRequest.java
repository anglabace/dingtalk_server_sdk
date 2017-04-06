package com.dingtalk.sdk.request;


import com.dingtalk.sdk.tools.JSONTools;

/**
 * 请求发送内容的基础类
 * @author henrybit
 * @since 1.0
 * @version 1.0
 */
public abstract class BaseRequest {
    /**
     * Json格式数据
     * @return
     */
    public String toJson() {
        return JSONTools.toJson(this);
    }

    @Override
    public String toString() {
        return toJson();
    }
}
