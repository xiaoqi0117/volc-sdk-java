// Code generated by protoc-gen-volcengine-sdk
// source: describeIpInfo
// DO NOT EDIT!

package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodDescribeIpInfoDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodDescribeIPInfoRequest.newBuilder();
			reqBuilder.setIps("your Ips");
			
            com.volcengine.service.vod.model.response.VodDescribeIPInfoResponse resp = vodService.describeIpInfo(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}