package com.volcengine.example.secretnumber;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.sercretnumber.ISecretNumberService;
import com.volcengine.service.sercretnumber.impl.SecretNumberServiceImpl;
import com.volcengine.service.sercretnumber.model.request.BindAXNRequest;
import com.volcengine.service.sercretnumber.model.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindAXNDemo {
    public static void main(String[] args) {
        ISecretNumberService secretNumberService = SecretNumberServiceImpl.getInstance();

        secretNumberService.setAccessKey("your ak");
        secretNumberService.setSecretKey("your sk");

        try {
            BindAXNRequest bindAXNRequest = new BindAXNRequest();
            bindAXNRequest.setNumberPoolNo("NP167092127702825445");
            bindAXNRequest.setPhoneNoA("18800000003");
            bindAXNRequest.setPhoneNoB("18800000004");
            bindAXNRequest.setPhoneNoX("13120407901");
            bindAXNRequest.setExpireTime(1674261085L);
            SecretBindResponse response = secretNumberService.bindAXN(bindAXNRequest);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
