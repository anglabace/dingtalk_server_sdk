package com.dingtalk.sdk.constant;

/**
 * 钉钉配置<br>
 * Created by henrybit on 2017/4/6.
 * @version 1.0
 */
public class Config {
    public String corpId;
    public String corpSecret;
    public String ssoSecret;
    public String channelSecret;

    public Config(String corpId, String corpSecret, String ssoSecret, String channelSecret) {
        this.corpId = corpId;
        this.corpSecret = corpSecret;
        this.ssoSecret = ssoSecret;
        this.channelSecret = channelSecret;
    }

    public Config(String corpId, String corpSecret) {
        this.corpId = corpId;
        this.corpSecret = corpSecret;
    }

    public Config() {
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    public void setSsoSecret(String ssoSecret) {
        this.ssoSecret = ssoSecret;
    }

    public void setChannelSecret(String channelSecret) {
        this.channelSecret = channelSecret;
    }

    public void setCorpSecret(String corpSecret) {
        this.corpSecret = corpSecret;
    }
}
