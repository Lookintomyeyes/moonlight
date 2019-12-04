package com.qf.controller;

import com.alibaba.fastjson.JSON;
import com.qf.domain.Token;
import com.qf.domain.User;
import com.qf.utils.HttpClient;
import org.apache.http.client.ClientProtocolException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.text.ParseException;

/*
    微信登录
 */
@Controller
public class wxLogin {
    //获取到code值
    @RequestMapping("/wx")
    public String wx(String code) {
        if (code == null) {
            throw new RuntimeException("用户禁止授权。。。");
        }
            try {
                //获取到了code值，回调没有问题
                //定义地址
                String token_url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx7287a60bb700fd21" +
                        "&secret=1ef8755f92bebae8ad7bab432ba29cbf&code=" + code + "&grant_type=authorization_code";
                //发送请求
                HttpClient client = new HttpClient(token_url);
                //发送get请求
                client.get();
                //获取到请求的结果 json格式的字符串，把json格式的字符串转换成对象或者Map集合
                String token_content = client.getContent();
                //把json字符串转换成对象
                Token token = JSON.parseObject(token_content, Token.class);

                //获取到接口调用凭证
                //获取个人的信息
                String user_url = "https://api.weixin.qq.com/sns/userinfo?access_token=" + token.getAccess_token() + "&openid=" + token.getOpenid();
                HttpClient client1 = new HttpClient(user_url);
                client1.get();
                String user_content = client1.getContent();
                // 解析json字符串
                User user = JSON.parseObject(user_content, User.class);
                //自己逻辑


                //跳转到项目的首页
                return "main";
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("微信扫描登录异常。。。");
            }
        }

}
