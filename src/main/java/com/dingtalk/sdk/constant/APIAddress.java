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
    /**获取微应用后台管理免登SsoToken-本接口获取的SsoToken和上面获取的AccessToken应用场景不一样，SsoToken只在微应用后台管理免登服务中使用。ISV开发的微应用后台免登中的SsoToken，使用ISV自己的corpid和ssosecret来换取，不是使用用户企业的*/
    public final static String GET_SSO_TOKEN = "https://oapi.dingtalk.com/sso/gettoken?corpid=CORPID&corpsecret=SSOSECRET";
    /**通过CODE换取用户身份-企业应用的服务器在拿到CODE后，需要将CODE发送到钉钉开放平台接口，如果验证通过，则返回CODE对应的用户信息。**此接口只用于免登服务中用来换取用户信息***/
    public final static String SSO_USER_INFO = "https://oapi.dingtalk.com/user/getuserinfo?access_token=ACCESS_TOKEN&code=CODE";
    /**通过CODE换取微应用管理员的身份信息-企业应用的服务器在拿到CODE后，需要将CODE发送到钉钉开放平台接口，如果验证通过，则返回CODE对应的管理员信息。**此接口只用于微应用后台管理员免登中用来换取管理员信息***/
    public final static String SSO_ADMIN_INFO = "https://oapi.dingtalk.com/sso/getuserinfo?access_token=ACCESS_TOKEN&code=CODE";
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
    /**获取通讯录权限*/
    public final static String MANAGER_CONTACT_GET_AUTH_SCOPE = "https://oapi.dingtalk.com/auth/scopes?access_token=ACCESS_TOKEN";
    /**管理通讯录 end**/


    /**管理APP start*/
    /**创建微应用*/
    public final static String MANAGER_APP_CREATE = "https://oapi.dingtalk.com/microapp/create?access_token=ACCESS_TOKEN";
    /**查看微应用的可见范围*/
    public final static String MANAGER_APP_VISIBLE_SCOPE = "https://oapi.dingtalk.com/microapp/visible_scopes?access_token=ACCESS_TOKEN";
    /**设置微应用的可见范围*/
    public final static String MANAGER_APP_VISIBLE_SCOPE_SETTING = "https://oapi.dingtalk.com/microapp/set_visible_scopes?access_token=ACCESS_TOKEN";
    /**获取指定微应用下指定用户绑定的全部规则*/
    public final static String MANAGER_APP_GET_USER_ALL_RULE = "https://oapi.dingtalk.com/microapp/rule/get_rule_list?access_token=ACCESS_TOKEN";
    /**获取规则绑定的用户数*/
    public final static String MANAGER_APP_RULE_GET_USER_TOTAL = "https://oapi.dingtalk.com/microapp/rule/get_user_total?access_token=ACCESS_TOKEN";
    /**删除规则-请求说明(规则被删除后,与此规则绑定的用户及部门将解绑)*/
    public final static String MANAGER_APP_DELETE_RULE = "https://oapi.dingtalk.com/microapp/rule/delete?access_token=ACCESS_TOKEN";
    /**管理APP end*/
}
