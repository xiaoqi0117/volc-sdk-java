// Code generated by protoc-gen-volcengine-sdk
// source: listVQScoreTask
// DO NOT EDIT!

package com.volcengine.service.live.v_q_score;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveListVQScoreTaskDemo {

    public static void main(String[] args) throws Exception {
        ILiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.ListVQScoreTaskRequest.Builder reqBuilder = com.volcengine.service.live.model.request.ListVQScoreTaskRequest.newBuilder();
			reqBuilder.setStartTime("your StartTime");
			reqBuilder.setEndTime("your EndTime");
			reqBuilder.setPageNum(0);
			reqBuilder.setPageSize(0);
			reqBuilder.setStatus(0);
			
            com.volcengine.service.live.model.response.ListVQScoreTaskResponse resp = liveService.listVQScoreTask(reqBuilder.build());
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