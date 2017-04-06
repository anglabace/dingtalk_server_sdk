package com.dingtalk.sdk.entity;

/**
 * 钉钉接口全局返回码枚举<br>
 * @author henrybit
 * @since 1.0
 * @version 1.0
 */
public enum ResultType {
    /**
     * 未知
     */
    SYSTEM_UNKNOW(-2, "未知状态"),

    /**
     * 请求成功
     */
    SUCCESS(0, "请求成功"),

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