package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class VisualCertVerifyQueryRequest {

    @JSONField(name = "req_key")
    String reqKey;

    @JSONField(name = "byted_token")
    String bytedToken;

    @JSONField(name = "omit_data")
    Boolean omitData;
}