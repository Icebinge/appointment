package cn.icebg.hospital.mapper.dao;

import cn.icebg.hospital.entity.PowerMenu;
import cn.icebg.hospital.entity.PowerResource;

import java.util.List;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/3/12
 */

public interface PowerRoleDao {

    /**
     * 通过账号编号，获取菜单列表
     *
     * @param id 账号编号
     * @return 菜单列表
     */
    List<PowerMenu> listMenu(Long id);

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
    List<PowerResource> listResourceByRoleId(Long roleId);
}
