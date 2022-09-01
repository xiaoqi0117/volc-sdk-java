package com.volcengine.service.visual.model.request;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.Data;

@Data
public class VisualImageScoreRequest {
    
    @JSONField(name = "image_base64")
    String imageBase64;
}