package com.dingtalk.sdk.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 创建一个微应用请求<br>
 {
 "appIcon": "@HIdsabikkhjsdsas",
 "appName": "测试微应用",
 "appDesc": "测试使用的微应用",
 "homepageUrl": "http://oa.dingtalk.com/?h5",
 "pcHomepageUrl": "http://oa.dingtalk.com/?pc",
 "ompLink": ""
 }

 * Created by henrybit on 2017/4/11.
 * @version 1.0
 */
public class CreateAppRequest extends BaseRequest{
    @JSONField(name="appIcon")
    protected String appIcon; //微应用的图标。需要调用上传接口将图标上传到钉钉服务器后获取到的mediaId
    @JSONField(name="appName")
    protected String appName; //微应用的名称。长度限制为1~10个字符
    @JSONField(name="appDesc")
    protected String appDesc; //微应用的描述。长度限制为1~20个字符
    @JSONField(name="homepageUrl")
    protected String homepageUrl; //微应用的移动端主页，必须以http开头或https开头
    @JSONField(name="pcHomepageUrl")
    protected String pcHomepageUrl; //微应用的PC端主页，必须以http开头或https开头，如果不为空则必须与homepageUrl的域名一致
    @JSONField(name="ompLink")
    protected String ompLink; //微应用的OA后台管理主页，必须以http开头或https开头

    public String getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public String getPcHomepageUrl() {
        return pcHomepageUrl;
    }

    public void setPcHomepageUrl(String pcHomepageUrl) {
        this.pcHomepageUrl = pcHomepageUrl;
    }

    public String getOmpLink() {
        return ompLink;
    }

    public void setOmpLink(String ompLink) {
        this.ompLink = ompLink;
    }
}
