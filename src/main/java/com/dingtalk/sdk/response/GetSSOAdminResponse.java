package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.dingtalk.sdk.entity.Corporation;
import com.dingtalk.sdk.entity.User;

/**
 * SSO免登获取Admin的信息<br>
 {
 "corp_info": {
 "corp_name": "一家公司",
 "corpid": "dingxxxxxx"
 },
 "errcode": 0,
 "errmsg": "ok",
 "is_sys": true,
 "user_info": {
 "avatar": "http://xxxxxxx.jpg",
 "email": "123456@aliyun.com",
 "name": "名称",
 "userid": "0571"
 }
 }
 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class GetSSOAdminResponse extends BaseResponse{
    @JSONField(name="corp_info")
    protected Corporation corporation;
    @JSONField(name="is_sys")
    protected boolean isSys;
    @JSONField(name="user_info")
    protected User user;

    public Corporation getCorporation() {
        return corporation;
    }

    public void setCorporation(Corporation corporation) {
        this.corporation = corporation;
    }

    public boolean isSys() {
        return isSys;
    }

    public void setSys(boolean sys) {
        isSys = sys;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
