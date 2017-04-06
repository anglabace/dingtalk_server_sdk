import com.dingtalk.sdk.api.TokenAPI;
import com.dingtalk.sdk.constant.Config;
import com.dingtalk.sdk.response.GetAccessTokenResponse;

/**
 * Created by henrybit on 2017/4/6.
 */
public class TestTokenAPI {
    public static void main(String[] args) {
        getAccessToken();
    }

    public static void getAccessToken() {
        String corpId = "ding487daeb4670d806135c2f4657eb6378f";
        String corpSecret = "jf1V-FEsuGz9Ett0I_8uUFMoKgEVXOscqRoCZCAVkWMDk8V2O9Opp0cnK4lBPH4U";

        Config config = new Config(corpId, corpSecret);
        TokenAPI tokenAPI = new TokenAPI(config);
        GetAccessTokenResponse getAccessTokenResponse = tokenAPI.createAccessToken();
        if (getAccessTokenResponse == null) {
            System.err.println("access_token null");
            System.exit(1);
        }
        System.out.println(getAccessTokenResponse.getAccessToken());
        System.out.println(getAccessTokenResponse.getExpireTime());
    }
}
