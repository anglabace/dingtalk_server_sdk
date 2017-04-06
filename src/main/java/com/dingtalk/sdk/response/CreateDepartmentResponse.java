package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 创建部门返回报文
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class CreateDepartmentResponse extends BaseResponse{
    @JSONField(name="id")
    protected long id; //部门ID

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
