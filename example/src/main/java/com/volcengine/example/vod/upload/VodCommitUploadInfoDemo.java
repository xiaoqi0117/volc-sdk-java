// Code generated by protoc-gen-volcengine-sdk
// source: commitUploadInfo
// DO NOT EDIT!

package com.volcengine.example.vod.upload;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodCommitUploadInfoDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodCommitUploadInfoRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodCommitUploadInfoRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setSessionKey("your SessionKey");
			reqBuilder.setCallbackArgs("your CallbackArgs");
			reqBuilder.setFunctions("your Functions");
			
            com.volcengine.service.vod.model.response.VodCommitUploadInfoResponse resp = vodService.commitUploadInfo(reqBuilder.build());
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