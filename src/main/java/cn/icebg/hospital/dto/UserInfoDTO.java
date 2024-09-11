package cn.icebg.hospital.dto;

import cn.icebg.hospital.entity.UserBasicInfo;
import cn.icebg.hospital.entity.PowerAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/3/19
 */

@ApiModel(value = "UserInfoDTO", description = "用户信息封装对象")
@Data
public class UserInfoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("账号信息")
    private PowerAccount account;

    @ApiModelProperty("用户信息")
    private UserBasicInfo basicInfo;

}
