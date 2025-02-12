package com.volcengine.service.notify.model.request;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class FetchVoiceResourceRequest {

    /**
     * url
     */
    @JSONField(name = "Url")
    private String url;

    /**
     * file name
     */
    @JSONField(name = "Name")
    private String name;
}
