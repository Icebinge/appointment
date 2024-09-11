package cn.icebg.hospital.mapper;

import cn.icebg.hospital.entity.HospitalSpecialRelation;
import cn.icebg.hospital.entity.HospitalSpecialRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalSpecialRelationMapper {
    long countByExample(HospitalSpecialRelationExample example);

    int deleteByExample(HospitalSpecialRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(HospitalSpecialRelation record);

    int insertSelective(HospitalSpecialRelation record);

    List<HospitalSpecialRelation> selectByExample(HospitalSpecialRelationExample example);

    HospitalSpecialRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") HospitalSpecialRelation record, @Param("example") HospitalSpecialRelationExample example);

    int updateByExample(@Param("record") HospitalSpecialRelation record, @Param("example") HospitalSpecialRelationExample example);

    int updateByPrimaryKeySelective(HospitalSpecialRelation record);

    int updateByPrimaryKey(HospitalSpecialRelation record);
}