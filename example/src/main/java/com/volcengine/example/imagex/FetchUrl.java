package com.volcengine.example.imagex;


import com.volcengine.model.request.FetchImageUrlRequest;
import com.volcengine.model.response.FetchImageUrlResponse;
import com.volcengine.service.imagex.IImageXService;
import com.volcengine.service.imagex.impl.ImageXServiceImpl;

/**
 * 单资源 URL 数据迁移
 */
public class FetchUrl {
    public static void main(String[] args) {
        // 默认 ImageX 实例为 `cn-north-1`，如果您想使用其他区域的实例，请使用 `ImageXServiceImpl.GetInstance(区域名)` 显式指定区域
        IImageXService service = ImageXServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        FetchImageUrlRequest req = new FetchImageUrlRequest();
        req.setServiceId("service id"); // 服务 ID
        req.setUrl("https://example.com/");

        try {
            FetchImageUrlResponse resp = service.fetchImageUrl(req);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
