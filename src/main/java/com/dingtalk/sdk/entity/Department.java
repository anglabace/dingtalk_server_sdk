package com.dingtalk.sdk.entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 钉钉的部门信息
 * Created by henrybit on 2017/4/5.
 */
public class Department extends BaseModel{
    //部门ID
    @JSONField(name="id")
    protected long id;
    //名称
    @JSONField(name="name")
    protected String name;
    //父级部门ID
    @JSONField(name="parentid")
    protected long parentid;
    //父部门的次序值
    @JSONField(name="order")
    protected int order;
    //是否创建一个关联此部门的企业群，默认false
    @JSONField(name="createDeptGroup")
    protected boolean createDeptGroup;
    //如果有新人加入部门是否会自动加入部门群
    @JSONField(name="autoAddUser")
    protected boolean autoAddUser;
    //部门的主管列表,取值为由主管的userid组成的字符串，不同的userid使用’| 符号进行分割
    @JSONField(name="deptManagerUseridList")
    protected String deptManagerUseridList;
    //是否隐藏部门：true-隐藏;false-显示
    @JSONField(name="deptHiding")
    protected boolean deptHiding;
    //可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效，取值为其他的部门id组成的的字符串，使用 | 符号进行分割
    @JSONField(name="deptPerimits")
    protected String deptPerimits;
    //可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用| 符号进行分割
    @JSONField(name="userPerimits")
    protected String userPerimits;
    //是否本部门的员工仅可见员工自己, 为true时，本部门员工默认只能看到员工自己
    @JSONField(name="outerDept")
    protected boolean outerDept;
    //本部门的员工仅可见员工自己为true时，可以配置额外可见部门，值为部门id组成的的字符串，使用|符号进行分割
    @JSONField(name="outerPermitDepts")
    protected String outerPermitDepts;
    //本部门的员工仅可见员工自己为true时，可以配置额外可见人员，值为userid组成的的字符串，使用|符号进行分割
    @JSONField(name="outerPermitUsers")
    protected String outerPermitUsers;
    //企业群群主
    @JSONField(name="orgDeptOwner")
    protected String orgDeptOwner;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getParentid() {
        return parentid;
    }

    public void setParentid(long parentid) {
        this.parentid = parentid;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isCreateDeptGroup() {
        return createDeptGroup;
    }

    public void setCreateDeptGroup(boolean createDeptGroup) {
        this.createDeptGroup = createDeptGroup;
    }

    public boolean isDeptHiding() {
        return deptHiding;
    }

    public void setDeptHiding(boolean deptHiding) {
        this.deptHiding = deptHiding;
    }

    public String getDeptPerimits() {
        return deptPerimits;
    }

    public void setDeptPerimits(String deptPerimits) {
        this.deptPerimits = deptPerimits;
    }

    public String getUserPerimits() {
        return userPerimits;
    }

    public void setUserPerimits(String userPerimits) {
        this.userPerimits = userPerimits;
    }

    public boolean isOuterDept() {
        return outerDept;
    }

    public void setOuterDept(boolean outerDept) {
        this.outerDept = outerDept;
    }

    public String getOuterPermitDepts() {
        return outerPermitDepts;
    }

    public void setOuterPermitDepts(String outerPermitDepts) {
        this.outerPermitDepts = outerPermitDepts;
    }

    public String getOuterPermitUsers() {
        return outerPermitUsers;
    }

    public void setOuterPermitUsers(String outerPermitUsers) {
        this.outerPermitUsers = outerPermitUsers;
    }

    public boolean isAutoAddUser() {
        return autoAddUser;
    }

    public void setAutoAddUser(boolean autoAddUser) {
        this.autoAddUser = autoAddUser;
    }

    public String getDeptManagerUseridList() {
        return deptManagerUseridList;
    }

    public void setDeptManagerUseridList(String deptManagerUseridList) {
        this.deptManagerUseridList = deptManagerUseridList;
    }

    public String getOrgDeptOwner() {
        return orgDeptOwner;
    }

    public void setOrgDeptOwner(String orgDeptOwner) {
        this.orgDeptOwner = orgDeptOwner;
    }
}
