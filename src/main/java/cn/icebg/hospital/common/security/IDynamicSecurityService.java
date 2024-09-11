package cn.icebg.hospital.common.security;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/3/12
 */

public interface IDynamicSecurityService {
    /**
     * 加载 资源 ANT 通配符和 资源对应MAP
     *
     * @return 资源 ANT 通配符和 资源
     */
    Map<String, ConfigAttribute> loadDataSource();
}
