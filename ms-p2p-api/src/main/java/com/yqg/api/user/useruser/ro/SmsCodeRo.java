package com.yqg.api.user.useruser.ro;

import com.yqg.common.core.annocation.ReqStringNotEmpty;
import com.yqg.common.sender.CaptchaUtils;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SmsCodeRo {
    @ReqStringNotEmpty
    @ApiModelProperty(value = "手机号", required = true)
    String mobileNumber;

    @ReqStringNotEmpty
    @ApiModelProperty(value = "图片验证码sessionId", required = true)
    String imgSessionId;

    @ReqStringNotEmpty
    @ApiModelProperty(value = "图片验证码", required = true)
    String imgCaptch;

    @ReqStringNotEmpty
    @ApiModelProperty(value = "短信类型,(LOGIN=登录, PAYPSSWORD_RESET_TEMP=设置支付密码,REGISTER=注册;", required = true)
    private CaptchaUtils.CaptchaType smsType;
}
