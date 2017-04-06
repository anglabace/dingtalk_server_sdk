import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.dingtalk.sdk.api.ManagerContactAPI;
import com.dingtalk.sdk.request.*;
import com.dingtalk.sdk.response.*;
import com.dingtalk.sdk.tools.JSONTools;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by henrybit on 2017/4/6.
 */
public class TestManagerContactAPI {
    public static void main(String[] args) {
        String accessToken = "9ae693773b173fbf9bbede674024e2d0";
        ManagerContactAPI managerContactAPI = new ManagerContactAPI(accessToken);
        //获取部门列表
        //getDepartmentList(managerContactAPI);

        //获取一个部门信息
        //getDepartmentInfo(managerContactAPI);

        //创建一个部门
        //createDepartment(managerContactAPI);

        //更新一个部门
        //updateDepartment(managerContactAPI);

        //删除一个部门
        //deleteDepartment(managerContactAPI);

        //创建一个用户
        //createUser(managerContactAPI);

        //更新一个用户
        //updateUser(managerContactAPI);

        //删除一个用户
        //deleteUser(managerContactAPI);

        //批量删除用户
        //batchDeleteUser(managerContactAPI);

        //查询部门下的用户
        //getDepartmentUsers(managerContactAPI);

        //查询部门下用户详情
        getDepartmentUsersDetail(managerContactAPI);

        //查询管理员
        getAdmins(managerContactAPI);
    }


    public static void getDepartmentList(ManagerContactAPI managerContactAPI) {
        GetDepartmentListResponse getDepartmentListResponse = managerContactAPI.getDepartmentList();
        System.out.println(JSONTools.toJson(getDepartmentListResponse));
    }

    public static void getDepartmentInfo(ManagerContactAPI managerContactAPI) {
        GetDepartmentDetailResponse getDepartmentDetailResponse = managerContactAPI.getDepartmentDetail(33813076);
        System.out.println(JSONTools.toJson(getDepartmentDetailResponse));
    }

    public static void createDepartment(ManagerContactAPI managerContactAPI) {
        CreateDepartmentRequest createDepartmentRequest = new CreateDepartmentRequest();
        createDepartmentRequest.setName("行政部");
        createDepartmentRequest.setParentid(1);
        createDepartmentRequest.setOrder(1);
        createDepartmentRequest.setCreateDeptGroup(true);
        createDepartmentRequest.setDeptHiding(false);
        createDepartmentRequest.setDeptPerimits("");
        createDepartmentRequest.setUserPerimits("");
        createDepartmentRequest.setOuterDept(false);
        createDepartmentRequest.setOuterPermitDepts("");
        createDepartmentRequest.setOuterPermitUsers("");
        CreateDepartmentResponse createDepartmentResponse = managerContactAPI.createDepartment(createDepartmentRequest);
        System.out.println(JSONTools.toJson(createDepartmentResponse));
    }

    public static void updateDepartment(ManagerContactAPI managerContactAPI) {
        UpdateDepartmentRequest request = new UpdateDepartmentRequest();
        request.setAutoAddUser(false);
        request.setName("技术部");
        request.setId(33813076);
        request.setParentid(1);
        BaseResponse response = managerContactAPI.updateDepartment(request);
        System.out.println(JSONTools.toJson(response));
    }

    public static void deleteDepartment(ManagerContactAPI managerContactAPI) {
        long id = 33813076;
        BaseResponse baseResponse = managerContactAPI.deleteDepartment(id);
        System.out.println(JSONTools.toJson(baseResponse));
    }

    public static void getUser(ManagerContactAPI managerContactAPI) {
        String userid = "";
        GetUserResponse getUserResponse = managerContactAPI.getUser(userid);
        System.out.println(JSONTools.toJson(getUserResponse));
    }

    public static void createUser(ManagerContactAPI managerContactAPI) {
        CreateUserRequest request = new CreateUserRequest();
        List<Long> departmentIds = new ArrayList<Long>();
        departmentIds.add(33813076L);
        request.setName("henrybit2");
        request.setEmail("qiph@chinacdc.com");
        request.setHide(false);
        request.setDepartmentIds(departmentIds);
        request.setJobnumber("1784192");
        request.setMobile("13811494685");
        request.setPosition("技术架构");
        request.setRemark("测试");
        request.setTelephone("0599-6655359");
        request.setWorkPlace("厦门建发大厦");
        request.setSenior(false);
        CreateUserResponse createUserResponse = managerContactAPI.createUser(request);
        System.out.println(JSONTools.toJson(createUserResponse));
    }

    public static void updateUser(ManagerContactAPI managerContactAPI) {
        UpdateUserRequest request = new UpdateUserRequest();
        request.setUserid("0934670864-1141835299");
        request.setJobnumber("123131");
        request.setMobile("18478193781");
        request.setSenior(false);
        request.setName("henrybit1");
        BaseResponse baseResponse = managerContactAPI.updateUser(request);
        System.out.println(JSONTools.toJson(baseResponse));
    }


    public static void deleteUser(ManagerContactAPI managerContactAPI) {
        String userid = "0934670864-1141835299";
        BaseResponse baseResponse = managerContactAPI.deleteUser(userid);
        System.out.println(JSONTools.toJson(baseResponse));
    }

    public static void batchDeleteUser(ManagerContactAPI managerContactAPI) {
        List<String> userIds = new ArrayList<String>();
        userIds.add("0932462565-729570059");
        BatchDeleteUserRequest request = new BatchDeleteUserRequest();
        request.setUserIdList(userIds);
        BaseResponse baseResponse = managerContactAPI.batchDeleteUser(request);
        System.out.println(JSONTools.toJson(baseResponse));
    }

    public static void getDepartmentUsers(ManagerContactAPI managerContactAPI) {
        long did = 1L;
        GetDepartmentUserListResponse getDepartmentUserListResponse = managerContactAPI.getDepartmentUsers(did);
        System.out.println(JSONTools.toJson(getDepartmentUserListResponse));
    }

    public static void getDepartmentUsersDetail(ManagerContactAPI managerContactAPI) {
        long did = 33813076L;
        GetDepartmentUserListResponse getDepartmentUserListResponse = managerContactAPI.getDepartmentUsersDetail(did);
        System.out.println(JSONTools.toJson(getDepartmentUserListResponse));
    }


    public static void getAdmins(ManagerContactAPI managerContactAPI) {
        GetAdminResponse response = managerContactAPI.getAdmins();
        System.out.println(JSONTools.toJson(response));
    }
}
