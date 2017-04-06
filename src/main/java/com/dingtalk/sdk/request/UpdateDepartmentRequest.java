package com.dingtalk.sdk.request;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 更新部门请求<br>
 {
 "name": "钉钉事业部",
 "parentid": "1",
 "order": "1",
 "id": "1",
 "createDeptGroup": true,
 "autoAddUser": true,
 "deptManagerUseridList": "manager1111|2222",
 "deptHiding" : true,
 "deptPerimits" : "3|4",
 "userPerimits" : "userid1|userid2",
 "outerDept" : true,
 "outerPermitDepts" : "1|2",
 "outerPermitUsers" : "userid3|userid4",
 "orgDeptOwner": "manager1111"
 }
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class UpdateDepartmentRequest extends BaseRequest{
    @JSONField(name="name")
    protected String name; //部门名称。长度限制为1~64个字符
    @JSONField(name="parentid")
    protected long parentid; //父部门id。根部门id为1
    @JSONField(name="order")
    protected int order; //在父部门中的次序值。order值小的排序靠前
    @JSONField(name="id")
    protected long id; //部门id
    @JSONField(name="createDeptGroup")
    protected boolean createDeptGroup; //是否创建一个关联此部门的企业群
    @JSONField(name="autoAddUser")
    protected boolean autoAddUser; //如果有新人加入部门是否会自动加入部门群
    @JSONField(name="deptManagerUseridList")
    protected String deptManagerUseridList; //部门的主管列表,取值为由主管的userid组成的字符串，不同的userid使用’| 符号进行分割
    @JSONField(name="deptHiding")
    protected boolean deptHiding; //是否隐藏部门, true表示隐藏, false表示显示
    @JSONField(name="deptPerimits")
    protected String deptPerimits; //可以查看指定隐藏部门的其他部门列表，如果部门隐藏，则此值生效，取值为其他的部门id组成的的字符串，使用 | 符号进行分割
    @JSONField(name="userPerimits")
    protected String userPerimits; //可以查看指定隐藏部门的其他人员列表，如果部门隐藏，则此值生效，取值为其他的人员userid组成的的字符串，使用| 符号进行分割
    @JSONField(name="outerDept")
    protected boolean outerDept; //是否本部门的员工仅可见员工自己, 为true时，本部门员工默认只能看到员工自己
    @JSONField(name="outerPermitDepts")
    protected String outerPermitDepts; //本部门的员工仅可见员工自己为true时，可以配置额外可见部门，值为部门id组成的的字符串，使用|符号进行分割
    @JSONField(name="outerPermitUsers")
    protected String outerPermitUsers; //本部门的员工仅可见员工自己为true时，可以配置额外可见人员，值为userid组成的的字符串，使用|符号进行分割
    @JSONField(name="orgDeptOwner")
    protected String orgDeptOwner; //企业群群主

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isCreateDeptGroup() {
        return createDeptGroup;
    }

    public void setCreateDeptGroup(boolean createDeptGroup) {
        this.createDeptGroup = createDeptGroup;
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

    public String getOrgDeptOwner() {
        return orgDeptOwner;
    }

    public void setOrgDeptOwner(String orgDeptOwner) {
        this.orgDeptOwner = orgDeptOwner;
    }
}
