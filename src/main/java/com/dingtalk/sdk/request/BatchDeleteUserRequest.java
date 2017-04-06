package com.dingtalk.sdk.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/**
 * 批量删除用户请求
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class BatchDeleteUserRequest extends BaseRequest{
    @JSONField(name="useridlist")
    protected List<String> userIdList; //员工UserID列表。列表长度在1到20之间

    public List<String> getUserIdList() {
        return userIdList;
    }

    public void setUserIdList(List<String> userIdList) {
        this.userIdList = userIdList;
    }
}
