package cn.icebg.hospital.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class QiNiuYunConfig {
    /**
     * 七牛域名domain
     */
    @Value("${qiniu.url}")
    private String url;
    /**
     * 七牛ACCESS_KEY
     */
    @Value("${qiniu.accesskey}")
    private String AccessKey;
    /**
     * 七牛SECRET_KEY
     */
    @Value("${qiniu.secretKey}")
    private String SecretKey;
    /**
     * 七牛空间名
     */
    @Value("${qiniu.bucket}")
    private String BucketName;

}
