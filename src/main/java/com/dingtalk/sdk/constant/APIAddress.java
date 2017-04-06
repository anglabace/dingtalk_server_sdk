package com.dingtalk.sdk.constant;

/**
 * API接口地址常量类
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class APIAddress {

    /**Token API start**/
    /**获取accessToken*/
    public final static String GET_ACCESS_TOKEN = "https://oapi.dingtalk.com/gettoken?corpid=CORPID&corpsecret=CORPSECRET";
    /**Token API end**/

    /**管理通讯录 start**/
    /**获取部门列表*/
    public final static String MANAGER_CONTACT_GET_DEPARTMENT_LIST = "https://oapi.dingtalk.com/department/list?access_token=ACCESS_TOKEN";
    /**获取部门详情*/
    public final static String MANAGER_CONTACT_GET_DEPARTMENT_INFO = "https://oapi.dingtalk.com/department/get?access_token=ACCESS_TOKEN&id=ID";
    /**创建部门*/
    public final static String MANAGER_CONTACT_CREATE_DEPARTMENT = "https://oapi.dingtalk.com/department/create?access_token=ACCESS_TOKEN";
    /**更新部门*/
    public final static String MANAGER_CONTACT_UPDATE_DEPARTMENT = "https://oapi.dingtalk.com/department/update?access_token=ACCESS_TOKEN";
    /**删除一个部门*/
    public final static String MANAGER_CONTACT_DELETE_DEPARTMENT = "https://oapi.dingtalk.com/department/delete?access_token=ACCESS_TOKEN&id=ID";
    /**根据unionid获取成员的userid*/
    public final static String MANAGER_CONTACT_UNIONID_TO_USERID = "https://oapi.dingtalk.com/user/getUseridByUnionid?access_token=ACCESS_TOKEN&unionid=UNIONID";
    /**获取成员详情*/
    public final static String MANAGER_CONTACT_GET_USER_INFO = "https://oapi.dingtalk.com/user/get?access_token=ACCESS_TOKEN&userid=USERID";
    /**创建成员*/
    public final static String MANAGER_CONTACT_CREATE_USER = "https://oapi.dingtalk.com/user/create?access_token=ACCESS_TOKEN";
    /**更新成员*/
    public final static String MANAGER_CONTACT_UPDATE_USER = "https://oapi.dingtalk.com/user/update?access_token=ACCESS_TOKEN";
    /**删除成员*/
    public final static String MANAGER_CONTACT_DELETE_USER = "https://oapi.dingtalk.com/user/delete?access_token=ACCESS_TOKEN&userid=ID";
    /**批量删除成员*/
    public final static String MANAGER_CONTACT_BATCH_DELETE_USER = "https://oapi.dingtalk.com/user/batchdelete?access_token=ACCESS_TOKEN";
    /**获取部门成员*/
    public final static String MANAGER_CONTACT_GET_DEPARTMENT_USERS = "https://oapi.dingtalk.com/user/simplelist?access_token=ACCESS_TOKEN&department_id=DEPARTMENT_ID";
    /**获取部门成员（详情）*/
    public final static String MANAGER_CONTACT_GET_DEPARTMENT_USERS_DETAIL = "https://oapi.dingtalk.com/user/list?access_token=ACCESS_TOKEN&department_id=DEPARTMENT_ID";
    /**获取管理员列表*/
    public final static String MANAGER_CONTACT_GET_ADMIN_LIST = "https://oapi.dingtalk.com/user/get_admin?access_token=ACCESS_TOKEN";
    /**管理通讯录 end**/

}
