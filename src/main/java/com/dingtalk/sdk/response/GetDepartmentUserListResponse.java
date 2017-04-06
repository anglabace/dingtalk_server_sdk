package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.dingtalk.sdk.entity.User;

import java.util.List;

/**
 * 获取部门下用户集合<br>
 {
 "errcode": 0,
 "errmsg": "ok",
 "hasMore": false,
 "userlist": [
 {
 "userid": "zhangsan",
 "name": "张三"
 }
 ]
 }
 or
 {
 "errcode": 0,
 "errmsg": "ok",
 "hasMore": false,
 "userlist":[
 {
 "userid": "zhangsan",
 "dingId": "dwdded",
 "mobile": "13122222222",
 "tel" : "010-123333",
 "workPlace" :"",
 "remark" : "",
 "order" : 1,
 "isAdmin": true,
 "isBoss": false,
 "isHide": true,
 "isLeader": true,
 "name": "张三",
 "active": true,
 "department": [1, 2],
 "position": "工程师",
 "email": "zhangsan@alibaba-inc.com",
 "avatar":  "./dingtalk/abc.jpg",
 "jobnumber": "111111",
 "extattr": {
 "爱好":"旅游",
 "年龄":"24"
 }
 }
 ]
 }
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class GetDepartmentUserListResponse extends BaseResponse{
    @JSONField(name="hasMore")
    protected boolean hasMore;
    @JSONField(name="userlist")
    protected List<User> userList;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
