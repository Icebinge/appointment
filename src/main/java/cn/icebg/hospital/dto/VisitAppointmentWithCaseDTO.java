package cn.icebg.hospital.dto;

import cn.icebg.hospital.entity.UserCase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/4/12
 */

@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "VisitAppointmentWithCaseDTO", description = "就诊记录详情")
@Data
public class VisitAppointmentWithCaseDTO extends VisitAppointmentDTO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("病例详情")
    private UserCase userCase;
}
