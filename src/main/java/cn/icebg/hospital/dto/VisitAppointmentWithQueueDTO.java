package cn.icebg.hospital.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/4/23
 */

@EqualsAndHashCode(callSuper = true)
@Data
@ApiModel(value = "VisitAppointmentWithQueueDTO", description = "挂号记录")
public class VisitAppointmentWithQueueDTO extends VisitAppointmentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("就诊号")
    private Integer queueNum;

    @ApiModelProperty(value = "创建时间")
    private Date gmtCreate;
}
