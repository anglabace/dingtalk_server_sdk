package com.dingtalk.sdk.entity;

import com.dingtalk.sdk.tools.JSONTools;

/**
 * 抽象实体基类<br>
 * 实现toJsonString方法
 * @author henrybit
 * @since 1.0
 * @version 1.0
 */
public abstract class BaseModel implements Model {
    @Override
    public String toJsonString() {
        return JSONTools.toJson(this);
    }
}
