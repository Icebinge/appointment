package cn.icebg.hospital.mapper;

import cn.icebg.hospital.entity.VisitAppointment;
import cn.icebg.hospital.entity.VisitAppointmentExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitAppointmentMapper {
    long countByExample(VisitAppointmentExample example);

    int deleteByExample(VisitAppointmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VisitAppointment record);

    int insertSelective(VisitAppointment record);

    List<VisitAppointment> selectByExample(VisitAppointmentExample example);

    VisitAppointment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VisitAppointment record, @Param("example") VisitAppointmentExample example);

    int updateByExample(@Param("record") VisitAppointment record, @Param("example") VisitAppointmentExample example);

    int updateByPrimaryKeySelective(VisitAppointment record);

    int updateByPrimaryKey(VisitAppointment record);
}