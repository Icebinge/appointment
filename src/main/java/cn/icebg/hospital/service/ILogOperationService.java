package cn.icebg.hospital.service;

import cn.icebg.hospital.dto.WebLogDTO;
import cn.icebg.hospital.entity.LogOperation;

import java.util.List;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/1/19
 */

public interface ILogOperationService {

    /**
     * 创建操作记录
     *
     * @param dto 记录参数
     * @return 是否成功
     */
    boolean insert(WebLogDTO dto);

    /**
     * 查找操作记录
     *
     * @param accountName 用户名称
     * @param method      请求方法
     * @param pageNum     第几页
     * @param pageSize    页大小
     * @return 操作记录表
     */
    List<LogOperation> search(String accountName, String method, Integer pageNum, Integer pageSize);
}
