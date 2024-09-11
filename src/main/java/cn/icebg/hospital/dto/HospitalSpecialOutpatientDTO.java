package cn.icebg.hospital.dto;

import cn.icebg.hospital.entity.HospitalOutpatient;
import cn.icebg.hospital.entity.HospitalSpecial;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 医院所属专科以及门诊封装类
 *
 * @author icebg  clj9509@163.com
 * @date 2020/2/5
 */
@ApiModel(value = "HospitalSpecialOutpatientDTO", description = "医院所属专科以及门诊封装类")
@Data
public class HospitalSpecialOutpatientDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "医院专科信息")
    private HospitalSpecial special;

    @ApiModelProperty(value = "专科包含门诊信息列表")
    private List<HospitalOutpatient> outpatientList;
}
