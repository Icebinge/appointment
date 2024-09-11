package cn.icebg.hospital.mapper;

import cn.icebg.hospital.entity.VisitPlan;
import cn.icebg.hospital.entity.VisitPlanExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitPlanMapper {
    long countByExample(VisitPlanExample example);

    int deleteByExample(VisitPlanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VisitPlan record);

    int insertSelective(VisitPlan record);

    List<VisitPlan> selectByExample(VisitPlanExample example);

    VisitPlan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VisitPlan record, @Param("example") VisitPlanExample example);

    int updateByExample(@Param("record") VisitPlan record, @Param("example") VisitPlanExample example);

    int updateByPrimaryKeySelective(VisitPlan record);

    int updateByPrimaryKey(VisitPlan record);
}