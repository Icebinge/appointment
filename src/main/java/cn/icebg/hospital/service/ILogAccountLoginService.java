package cn.icebg.hospital.service;

import cn.icebg.hospital.entity.LogAccountLogin;

import java.util.List;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/1/19
 */

public interface ILogAccountLoginService {

    /**
     * 插入登录记录
     *
     * @param name 登录账号
     * @return 是否成功
     */
    boolean insert(String name);

    boolean insertByOpenId(String openId);

    /**
     * 查找登录记录
     *
     * @param accountName 账号名称
     * @param pageNum   第几页
     * @param pageSize  页大小
     * @return 登录记录
     */
    List<LogAccountLogin> search(String accountName, Integer pageNum, Integer pageSize);
}
