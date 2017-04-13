package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 创建微应用返回报文<br>
 {
 "errcode": 0,
 "errmsg": "created",
 "id": 2
 }
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class CreateAppResponse extends BaseResponse{
    @JSONField(name="id")
    protected long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
