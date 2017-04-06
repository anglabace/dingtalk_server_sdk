package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.dingtalk.sdk.entity.BaseModel;
import com.dingtalk.sdk.entity.ResultType;
import com.dingtalk.sdk.tools.StringTools;

/**
 * API响应报文对象基类<br>
 * @author henrybit
 * @since 1.0
 * @version 1.0
 */
public class BaseResponse extends BaseModel {
    //错误码
    @JSONField(name="errcode")
    private String errcode;
    //错误信息
    @JSONField(name="errmsg")
    private String errmsg;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        String result = this.errmsg;
        //将接口返回的错误信息转换成中文，方便提示用户出错原因
        if (StringTools.isNotEmpty(this.errcode) && !ResultType.SUCCESS.getCode().toString().equals(this.errcode)) {
            ResultType resultType = ResultType.get(this.errcode);
            if (resultType != null) {
                return resultType.getDescription();
            }
        }
        return result;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
