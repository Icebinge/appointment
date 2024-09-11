package cn.icebg.hospital.controller;

import cn.icebg.hospital.common.api.CommonResult;
import cn.icebg.hospital.service.IPowerAccountService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/wechat")
public class WeChatLoginController {

    @Value("${wx.appId}")
    private String appid;

    @Value("${wx.appSecret}")
    private String secret;

    private final IPowerAccountService accountService;

    public WeChatLoginController(IPowerAccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public CommonResult<Map<String, String>> login(@RequestParam String code) {
        // 构造请求微信接口的URL
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + appid + "&secret=" + secret
                + "&js_code=" + code + "&grant_type=authorization_code";

        // 使用RestTemplate发送请求
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map> response = restTemplate.getForEntity(url, Map.class);

        Map<String, Object> weChatResult = response.getBody();

        if (weChatResult == null || weChatResult.containsKey("errcode")) {
            // 如果有错误，返回错误信息
            return CommonResult.failed("微信授权登录失败: " + weChatResult.get("errmsg"));
        }

        // 获取微信返回的openid和session_key
        String openId = (String) weChatResult.get("openid");
        String sessionKey = (String) weChatResult.get("session_key");

        // TODO: 存储或处理微信用户信息，如注册或绑定系统用户
        accountService.login(openId, sessionKey);
//        accountService.loginByOpenId(openId, sessionKey);
        // 将openid返回给前端
        Map<String, String> result = new HashMap<>();
        result.put("openid", openId);

        return CommonResult.success(result);
    }
}
