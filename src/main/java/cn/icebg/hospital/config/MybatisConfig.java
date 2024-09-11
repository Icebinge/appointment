package cn.icebg.hospital.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis 配置类
 *
 * @author icebg  clj9509@163.com
 * @date 2020/1/19
 */

@MapperScan("cn.icebg.hospital.mapper")
@Configuration
public class MybatisConfig {
}
