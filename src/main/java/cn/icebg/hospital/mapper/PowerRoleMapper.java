package cn.icebg.hospital.mapper;

import cn.icebg.hospital.entity.PowerRoleExample;
import cn.icebg.hospital.entity.PowerRole;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerRoleMapper {
    long countByExample(PowerRoleExample example);

    int deleteByExample(PowerRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PowerRole record);

    int insertSelective(PowerRole record);

    List<PowerRole> selectByExample(PowerRoleExample example);

    PowerRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PowerRole record, @Param("example") PowerRoleExample example);

    int updateByExample(@Param("record") PowerRole record, @Param("example") PowerRoleExample example);

    int updateByPrimaryKeySelective(PowerRole record);

    int updateByPrimaryKey(PowerRole record);
}