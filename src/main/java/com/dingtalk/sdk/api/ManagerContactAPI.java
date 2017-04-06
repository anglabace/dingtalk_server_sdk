package com.dingtalk.sdk.api;

import com.dingtalk.sdk.constant.APIAddress;
import com.dingtalk.sdk.request.*;
import com.dingtalk.sdk.response.*;
import com.dingtalk.sdk.tools.JSONTools;

import java.util.List;

/**
 * 管理通讯录API
 * Created by henrybit on 2017/4/5.
 * @version 1.0
 */
public class ManagerContactAPI extends BaseAPI{

    protected ManagerContactAPI(String accessToken) {
        super(accessToken);
    }

    /**
     * 获取部门列表<br>
     * @return GetDepartmentListResponse
     */
    public GetDepartmentListResponse getDepartmentList() {
        String url = APIAddress.MANAGER_CONTACT_GET_DEPARTMENT_LIST;
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetDepartmentListResponse.class);
    }

    /**
     * 获取指定的部门信息
     * @param id
     * @return GetDepartmentDetailResponse
     */
    public GetDepartmentDetailResponse getDepartmentDetail(long id) {
        String url = APIAddress.MANAGER_CONTACT_GET_DEPARTMENT_INFO;
        url = url.replace("ID",id+"");
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetDepartmentDetailResponse.class);
    }


    /**
     * 创建一个部门
     * @param request
     * @return CreateDepartmentResponse
     */
    public CreateDepartmentResponse createDepartment(CreateDepartmentRequest request) {
        String url = APIAddress.MANAGER_CONTACT_CREATE_DEPARTMENT;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, CreateDepartmentResponse.class);
    }

    /**
     * 更新一个部门
     * @param request
     * @return BaseResponse
     */
    public BaseResponse updateDepartment(UpdateDepartmentRequest request) {
        String url = APIAddress.MANAGER_CONTACT_UPDATE_DEPARTMENT;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        return response;
    }

    /**
     * 删除一个部门
     * @param id
     * @return BaseResponse
     */
    public BaseResponse deleteDepartment(long id) {
        String url = APIAddress.MANAGER_CONTACT_DELETE_DEPARTMENT;
        url = url.replace("ID",id+"");
        BaseResponse response = executePost(url, null);
        return response;
    }

    /**
     * 通过unionid获取userid
     * @param unionid
     * @return GetUserIdResponse
     */
    public GetUserIdResponse getUserIdByUnionid(String unionid) {
        String url = APIAddress.MANAGER_CONTACT_UNIONID_TO_USERID;
        url = url.replace("UNIONID",unionid);
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetUserIdResponse.class);
    }

    /**
     * 获取用户信息
     * @param userid
     * @return GetUserResponse
     */
    public GetUserResponse getUser(String userid) {
        String url = APIAddress.MANAGER_CONTACT_GET_USER_INFO;
        url = url.replace("USERID",userid);
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetUserResponse.class);
    }

    /**
     * 创建用户
     * @param request
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) {
        String url = APIAddress.MANAGER_CONTACT_CREATE_USER;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, CreateUserResponse.class);
    }

    /**
     * 更新用户信息
     * @param request
     * @return BaseResponse
     */
    public BaseResponse updateUser(UpdateUserRequest request) {
        String url = APIAddress.MANAGER_CONTACT_UPDATE_USER;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        return response;
    }

    /**
     * 删除用户
     * @param userid
     * @return BaseResponse
     */
    public BaseResponse deleteUser(String userid) {
        String url = APIAddress.MANAGER_CONTACT_DELETE_USER;
        url = url.replace("ID",userid);
        BaseResponse response = executePost(url, null);
        return response;
    }

    /**
     * 批量删除用户
     * @param request
     * @return baseResponse
     */
    public BaseResponse batchDeleteUser(BatchDeleteUserRequest request) {
        String url = APIAddress.MANAGER_CONTACT_BATCH_DELETE_USER;
        BaseResponse response = executePost(url, JSONTools.toJson(request));
        return response;
    }

    /**
     * 获取部门下用户集合
     * @param departmentId 部门ID
     * @param offset 支持分页查询，与size参数同时设置时才生效，此参数代表偏移量
     * @param size 支持分页查询，与offset参数同时设置时才生效，此参数代表分页大小，最大100
     * @param order 支持分页查询，部门成员的排序规则，默认不传是按自定义排序；entry_asc代表按照进入部门的时间升序，entry_desc代表按照进入部门的时间降序，modify_asc代表按照部门信息修改时间升序，modify_desc代表按照部门信息修改时间降序，custom代表用户定义(未定义时按照拼音)排序
     * @return GetDepartmentUserListResponse
     */
    public GetDepartmentUserListResponse getDepartmentUsers(long departmentId, long offset, int size, String order) {
        String url = APIAddress.MANAGER_CONTACT_GET_DEPARTMENT_USERS;
        url = url.replace("DEPARTMENT_ID",departmentId+"");
        url = url+"&offset="+offset+"&size="+size+"&order="+order;
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetDepartmentUserListResponse.class);
    }

    /**
     * 获取部门下用户集合
     * @param departmentId 部门ID
     * @param order 支持分页查询，部门成员的排序规则，默认不传是按自定义排序；entry_asc代表按照进入部门的时间升序，entry_desc代表按照进入部门的时间降序，modify_asc代表按照部门信息修改时间升序，modify_desc代表按照部门信息修改时间降序，custom代表用户定义(未定义时按照拼音)排序
     * @return GetDepartmentUserListResponse
     */
    public GetDepartmentUserListResponse getDepartmentUsers(long departmentId, String order) {
        String url = APIAddress.MANAGER_CONTACT_GET_DEPARTMENT_USERS;
        url = url.replace("DEPARTMENT_ID",departmentId+"");
        url = url+"&order="+order;
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetDepartmentUserListResponse.class);
    }

    /**
     * 获取部门下用户集合
     * @param departmentId 部门ID
     * @return GetDepartmentUserListResponse
     */
    public GetDepartmentUserListResponse getDepartmentUsers(long departmentId) {
        String url = APIAddress.MANAGER_CONTACT_GET_DEPARTMENT_USERS;
        url = url.replace("DEPARTMENT_ID",departmentId+"");
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetDepartmentUserListResponse.class);
    }

    /**
     * 获取部门下用户详情信息集合
     * @param departmentId 获取的部门id
     * @param offset 支持分页查询，与size参数同时设置时才生效，此参数代表偏移量
     * @param size 支持分页查询，与offset参数同时设置时才生效，此参数代表分页大小，最大100
     * @param order 支持分页查询，部门成员的排序规则，默认不传是按自定义排序；entry_asc代表按照进入部门的时间升序，entry_desc代表按照进入部门的时间降序，modify_asc代表按照部门信息修改时间升序，modify_desc代表按照部门信息修改时间降序，custom代表用户定义(未定义时按照拼音)排序
     * @return GetDepartmentUserListResponse
     */
    public GetDepartmentUserListResponse getDepartmentUsersDetail(long departmentId, long offset, int size, String order) {
        String url = APIAddress.MANAGER_CONTACT_GET_DEPARTMENT_USERS_DETAIL;
        url = url.replace("DEPARTMENT_ID",departmentId+"");
        url = url+"&offset="+offset+"&size="+size+"&order="+order;
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetDepartmentUserListResponse.class);
    }

    /**
     * 获取部门下用户详情信息集合
     * @param departmentId 获取的部门id
     * @param offset 支持分页查询，与size参数同时设置时才生效，此参数代表偏移量
     * @param size 支持分页查询，与offset参数同时设置时才生效，此参数代表分页大小，最大100
     * @return GetDepartmentUserListResponse
     */
    public GetDepartmentUserListResponse getDepartmentUsersDetail(long departmentId, long offset, int size) {
        String url = APIAddress.MANAGER_CONTACT_GET_DEPARTMENT_USERS_DETAIL;
        url = url.replace("DEPARTMENT_ID",departmentId+"");
        url = url+"&offset="+offset+"&size="+size;
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetDepartmentUserListResponse.class);
    }

    /**
     * 获取部门下用户详情信息集合
     * @param departmentId 获取的部门id
     * @param order 支持分页查询，部门成员的排序规则，默认不传是按自定义排序；entry_asc代表按照进入部门的时间升序，entry_desc代表按照进入部门的时间降序，modify_asc代表按照部门信息修改时间升序，modify_desc代表按照部门信息修改时间降序，custom代表用户定义(未定义时按照拼音)排序
     * @return GetDepartmentUserListResponse
     */
    public GetDepartmentUserListResponse getDepartmentUsersDetail(long departmentId, String order) {
        String url = APIAddress.MANAGER_CONTACT_GET_DEPARTMENT_USERS_DETAIL;
        url = url.replace("DEPARTMENT_ID",departmentId+"");
        url = url+"&order="+order;
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetDepartmentUserListResponse.class);
    }

    /**
     * 获取部门下用户详情信息集合
     * @param departmentId 获取的部门id
     * @return GetDepartmentUserListResponse
     */
    public GetDepartmentUserListResponse getDepartmentUsersDetail(long departmentId) {
        String url = APIAddress.MANAGER_CONTACT_GET_DEPARTMENT_USERS_DETAIL;
        url = url.replace("DEPARTMENT_ID",departmentId+"");
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetDepartmentUserListResponse.class);
    }

    /**
     * 获取管理员集合
     * @return GetAdminResponse
     */
    public GetAdminResponse getAdmins() {
        String url = APIAddress.MANAGER_CONTACT_GET_ADMIN_LIST;
        BaseResponse response = executePost(url, null);
        if (response == null)
            return null;
        String resultJson = isSuccess(response.getErrcode()) ? response.getErrmsg() : response.toJsonString();
        return JSONTools.parse(resultJson, GetAdminResponse.class);
    }
}
