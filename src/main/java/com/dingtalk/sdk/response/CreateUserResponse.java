package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 创建用户返回报文<br>
 {
 "errcode": 0,
 "errmsg": "created",
 "userid": "dedwefewfwe1231"
 }
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class CreateUserResponse extends BaseResponse{
    @JSONField(name="userid")
    protected String userid;
}
