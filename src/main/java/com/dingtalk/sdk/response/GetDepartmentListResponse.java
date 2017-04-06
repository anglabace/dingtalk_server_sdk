package com.dingtalk.sdk.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.dingtalk.sdk.entity.Department;

import java.util.List;

/**
 * 获取部门列表返回报文
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class GetDepartmentListResponse extends BaseResponse{
    @JSONField(name="department")
    protected List<Department> departmentList;

    public List<Department> getDepartmentList() {
        return departmentList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
}
