package com.dingtalk.sdk.entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.HashMap;
import java.util.List;

/**
 * 用户信息
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class User extends BaseModel{
    @JSONField(name="userid")
    protected String userid; //员工唯一标识ID（不可修改）
    @JSONField(name="name")
    protected String name; //成员名称
    @JSONField(name="tel")
    protected String telephone; //分机号（ISV不可见）
    @JSONField(name="workPlace")
    protected String workPlace; //办公地点（ISV不可见）
    @JSONField(name="remark")
    protected String remark; //备注（ISV不可见）
    @JSONField(name="mobile")
    protected String mobile; //手机号码（ISV不可见）
    @JSONField(name="email")
    protected String email; //员工的电子邮箱（ISV不可见）
    @JSONField(name="orgEmail")
    protected String orgEmail;//员工的企业邮箱（ISV不可见）
    @JSONField(name="active")
    protected boolean active; //是否已经激活, true表示已激活, false表示未激活
    @JSONField(name="orderInDepts")
    protected String orderInDepts; //在对应的部门中的排序, Map结构的json字符串, key是部门的Id, value是人员在这个部门的排序值
    @JSONField(name="isAdmin")
    protected boolean isAdmin; //是否为企业的管理员, true表示是, false表示不是
    @JSONField(name="isBoss")
    protected boolean isBoss; //是否为企业的老板, true表示是, false表示不是
    @JSONField(name="dingId")
    protected String dingId; //钉钉Id,在钉钉全局范围内标识用户的身份,但用户可以自行修改一次
    @JSONField(name="unionid")
    protected String unionid; //在当前isv全局范围内唯一标识一个用户的身份,用户无法修改
    @JSONField(name="isLeaderInDepts")
    protected String isLeaderInDepts; //在对应的部门中是否为主管, Map结构的json字符串, key是部门的Id, value是人员在这个部门中是否为主管, true表示是, false表示不是
    @JSONField(name="isHide")
    protected boolean isHide; //是否号码隐藏, true表示隐藏, false表示不隐藏
    @JSONField(name="department")
    protected List<Long> departmentIds; //成员所属部门id列表
    @JSONField(name="position")
    protected String position; //职位信息
    @JSONField(name="avatar")
    protected String avatar; //头像url
    @JSONField(name="jobnumber")
    protected String jobnumber; //员工工号
    @JSONField(name="extattr")
    protected HashMap extattr; //扩展属性，可以设置多种属性(但手机上最多只能显示10个扩展属性，具体显示哪些属性，请到OA管理后台->设置->通讯录信息设置和OA管理后台->设置->手机端显示信息设置)性

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrgEmail() {
        return orgEmail;
    }

    public void setOrgEmail(String orgEmail) {
        this.orgEmail = orgEmail;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getOrderInDepts() {
        return orderInDepts;
    }

    public void setOrderInDepts(String orderInDepts) {
        this.orderInDepts = orderInDepts;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }

    public String getDingId() {
        return dingId;
    }

    public void setDingId(String dingId) {
        this.dingId = dingId;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public String getIsLeaderInDepts() {
        return isLeaderInDepts;
    }

    public void setIsLeaderInDepts(String isLeaderInDepts) {
        this.isLeaderInDepts = isLeaderInDepts;
    }

    public boolean isHide() {
        return isHide;
    }

    public void setHide(boolean hide) {
        isHide = hide;
    }

    public List<Long> getDepartmentIds() {
        return departmentIds;
    }

    public void setDepartmentIds(List<Long> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    public HashMap getExtattr() {
        return extattr;
    }

    public void setExtattr(HashMap extattr) {
        this.extattr = extattr;
    }
}
