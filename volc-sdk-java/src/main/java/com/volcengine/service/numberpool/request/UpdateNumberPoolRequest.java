package com.volcengine.service.numberpool.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: chenhui
 * @Date: 2023/02/20
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateNumberPoolRequest {

    private String numberPoolNo;

    private String name;

    private Integer serviceType;

    private Integer subServiceType;
}
