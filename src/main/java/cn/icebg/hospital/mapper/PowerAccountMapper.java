package cn.icebg.hospital.mapper;

import cn.icebg.hospital.entity.PowerAccount;
import cn.icebg.hospital.entity.PowerAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowerAccountMapper {
    long countByExample(PowerAccountExample example);

    int deleteByExample(PowerAccountExample example);

    int deleteByPrimaryKey(Long id);

//    int insert(PowerAccount record);

    int insertSelective(PowerAccount record);

    List<PowerAccount> selectByExample(PowerAccountExample example);

    PowerAccount selectByPrimaryKey(Long id);

//    PowerAccount selectByIdAndPassword(Long id, String password);

    int updateByExampleSelective(@Param("record") PowerAccount record, @Param("example") PowerAccountExample example);

    int updateByExample(@Param("record") PowerAccount record, @Param("example") PowerAccountExample example);

    int updateByPrimaryKeySelective(PowerAccount record);

    int updateByPrimaryKey(PowerAccount record);

    int countByOpenid(@Param("openid") String openid);  // 根据 openid 查询是否存在

    int insert(PowerAccount account);  // 插入新用户

    PowerAccount selectByOpenid(@Param("openid") String openid);  // 通过 openid 查找用户
}