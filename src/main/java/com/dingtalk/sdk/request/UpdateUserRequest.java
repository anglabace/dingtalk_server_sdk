package com.dingtalk.sdk.request;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.HashMap;
import java.util.List;

/**
 * 更新用户请求<br>
 {
 "userid": "zhangsan",
 "name": "张三",
 "department": [1, 2],
 "orderInDepts": "{1:10}",
 "position": "产品经理",
 "mobile": "15913215421",
 "tel" : "010-123333",
 "workPlace" :"",
 "remark" : "",
 "email": "zhangsan@gzdev.com",
 "jobnumber": "111111",
 "isHide": false,
 "isSenior": false,
 "extattr": {
 "爱好":"旅游",
 "年龄":"24"
 }
 }
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class UpdateUserRequest extends BaseRequest{
    @JSONField(name="userid")
    protected String userid; //	员工唯一标识ID（不可修改），企业内必须唯一。长度为1~64个字符
    @JSONField(name="name")
    protected String name; //成员名称。长度为1~64个字符
    @JSONField(name="department")
    protected List<Long> departmentIds; //成员所属部门id列表
    @JSONField(name="orderInDepts")
    protected String orderInDepts; //实际是Map的序列化字符串，Map的Key是deptId，表示部门id，Map的Value是order，表示排序的值，列表是按order的倒序排列输出的，即从大到小排列输出的
    @JSONField(name="position")
    protected String position; //职位信息。长度为0~64个字符
    @JSONField(name="mobile")
    protected String mobile; //手机号码。企业内必须唯一
    @JSONField(name="tel")
    protected String telephone; //分机号，长度为0~50个字符
    @JSONField(name="workPlace")
    protected String workPlace; //办公地点，长度为0~50个字符
    @JSONField(name="remark")
    protected String remark; //备注，长度为0~1000个字符
    @JSONField(name="email")
    protected String email; //邮箱。长度为0~64个字符。企业内必须唯一
    @JSONField(name="jobnumber")
    protected String jobnumber; //员工工号，对应显示到OA后台和客户端个人资料的工号栏目。长度为0~64个字符
    @JSONField(name="isHide")
    protected boolean isHide; //是否号码隐藏, true表示隐藏, false表示不隐藏。隐藏手机号后，手机号在个人资料页隐藏，但仍可对其发DING、发起钉钉免费商务电话。
    @JSONField(name="isSenior")
    protected boolean isSenior; //是否高管模式，true表示是，false表示不是。开启后，手机号码对所有员工隐藏。普通员工无法对其发DING、发起钉钉免费商务电话。高管之间不受影响。
    @JSONField(name="extattr")
    protected HashMap extattr; //扩展属性，可以设置多种属性(但手机上最多只能显示10个扩展属性，具体显示哪些属性，请到OA管理后台->设置->通讯录信息设置和OA管理后台->设置->手机端显示信息设置)

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentIds(List<Long> departmentIds) {
        this.departmentIds = departmentIds;
    }

    public void setOrderInDepts(String orderInDepts) {
        this.orderInDepts = orderInDepts;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobnumber(String jobnumber) {
        this.jobnumber = jobnumber;
    }

    public void setHide(boolean hide) {
        isHide = hide;
    }

    public void setSenior(boolean senior) {
        isSenior = senior;
    }

    public void setExtattr(HashMap extattr) {
        this.extattr = extattr;
    }
}
