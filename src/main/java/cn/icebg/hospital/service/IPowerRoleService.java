package cn.icebg.hospital.service;

import cn.icebg.hospital.dto.param.PowerRoleParam;
import cn.icebg.hospital.dto.param.StatusParam;
import cn.icebg.hospital.entity.PowerAccount;
import cn.icebg.hospital.entity.PowerMenu;
import cn.icebg.hospital.entity.PowerResource;
import cn.icebg.hospital.entity.PowerRole;

import java.util.List;
import java.util.Optional;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/1/19
 */

public interface IPowerRoleService {

    boolean countByOpenid(String openid);  // 检查 openid 是否已存在
    PowerAccount registerByOpenid(String openid, String sessionKey); // 注册新用户
    Optional<PowerAccount> loginByOpenid(String openid); // 通过 openid 登录

    /**
     * 添加角色
     *
     * @param param 角色信息参数
     * @return 成功记录数
     */
    boolean insert(PowerRoleParam param);

    /**
     * 修改角色信息
     *
     * @param roleId 角色编号
     * @param param  角色信息参数
     * @return 成功记录数
     */
    boolean update(Long roleId, PowerRoleParam param);


    /**
     * 更新角色状态
     *
     * @param roleId 角色编号
     * @param param  状态参数： 0 关闭，1 开启
     * @return 是否成功
     */
    boolean updateStatus(Long roleId, StatusParam param);

    /**
     * 删除角色信息
     *
     * @param roleId 角色编号
     * @return 是否成功
     */
    boolean delete(Long roleId);

    /**
     * 批量删除角色
     *
     * @param idList 角色编号
     * @return 成功记录数
     */
    int delete(List<Long> idList);

    /**
     * 获取角色列表
     *
     * @param chineseName 中文名
     * @param pageNum     第几页
     * @param pageSize    页大小
     * @return 角色列表
     */
    List<PowerRole> list(String chineseName, Integer pageNum, Integer pageSize);

    /**
     * 判断角色是否存在
     *
     * @param id 角色编号
     * @return 是否存在
     */
    boolean count(Long id);

    /**
     * 通过账号编号，获取菜单列表
     *
     * @param accountId 账号编号
     * @return 菜单列表
     */
    List<PowerMenu> listMenu(Long accountId);

    /**
     * 通过角色编号，获取菜单列表
     *
     * @param roleId 角色编号
     * @return 菜单列表
     */
    List<PowerMenu> listMenuByRoleId(Long roleId);

    /**
     * 通过角色编号，获取资源列表
     *
     * @param roleId 角色编号
     * @return 资源列表
     */
    List<PowerResource> listMenuResource(Long roleId);

    /**
     * 更新角色菜单列表
     *
     * @param roleId     角色编号
     * @param menuIdList 菜单列表
     * @return 是否成功
     */
    boolean allocMenu(Long roleId, List<Long> menuIdList);

    /**
     * 更新角色资源列表
     *
     * @param roleId         角色编号
     * @param resourceIdList 资源列表
     * @return 是否成功
     */
    boolean allocResource(Long roleId, List<Long> resourceIdList);
}
