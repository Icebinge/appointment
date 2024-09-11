package cn.icebg.hospital.mapper;

import cn.icebg.hospital.entity.UserBasicInfo;
import cn.icebg.hospital.entity.UserBasicInfoExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBasicInfoMapper {
    long countByExample(UserBasicInfoExample example);

    int deleteByExample(UserBasicInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserBasicInfo record);

    int insertSelective(UserBasicInfo record);

    List<UserBasicInfo> selectByExample(UserBasicInfoExample example);

    UserBasicInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserBasicInfo record, @Param("example") UserBasicInfoExample example);

    int updateByExample(@Param("record") UserBasicInfo record, @Param("example") UserBasicInfoExample example);

    int updateByPrimaryKeySelective(UserBasicInfo record);

    int updateByPrimaryKey(UserBasicInfo record);
}