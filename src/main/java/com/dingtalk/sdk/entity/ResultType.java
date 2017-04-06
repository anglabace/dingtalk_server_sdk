package com.dingtalk.sdk.entity;

/**
 * 钉钉接口全局返回码枚举<br>
 * @author henrybit
 * @since 1.0
 * @version 1.0
 */
public enum ResultType {
    /**
     * 分机号在公司已存在
     */
    TELEPHONE_EXSIT(40100, "分机号已在公司存在"),
    /**
     * 手机号在通讯录中已存在
     */
    PHONE_EXSIT(60104, "手机号已经在公司存在了"),
    /**
     * 不合法的用户ID
     */
    ILLEGAL_USERID(40003, "不合法的UserId"),

    /**
     * 请求成功
     */
    SUCCESS(0, "请求成功"),

    /**
     * 请求失败:需要使用Get方式访问
     */
    NEED_GET(43001, "需要使用Get请求"),
    /**
     * 不合法的AccessToken
     */
    ACCESS_TOKEN(40014, "不合法的access_token"),
    /**
     * 父亲部门不存在
     */
    PARENT_DEPARTMENT_NOT_EXSIT(60004, "父亲部门不存在"),

    /**
     * 其他错误
     */
    OTHER_ERROR(99999, "其他错误");

    /**
     * 结果码
     */
    Integer code;

    /**
     * 结果描述
     */
    String description;

    /**
     * 返回结果枚举构造方法
     *
     * @param code        结果码
     * @param description 结果描述
     */
    ResultType(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * 通过code得到返回结果对象
     *
     * @param code 结果码
     * @return 结果枚举对象
     */
    public static ResultType get(String code) {
        ResultType[] list = values();
        for (ResultType resultType : list) {
            if (code.equals(resultType.getCode().toString())) {
                return resultType;
            }
        }
        return null;
    }

    /**
     * 获得结果码
     *
     * @return 结果码
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 获得结果描述
     *
     * @return 结果描述
     */
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ResultType{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}