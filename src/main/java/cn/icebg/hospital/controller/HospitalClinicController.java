package cn.icebg.hospital.controller;

import cn.icebg.hospital.service.IHospitalClinicService;
import cn.icebg.hospital.service.IHospitalOutpatientService;
import cn.icebg.hospital.common.api.CommonResult;
import cn.icebg.hospital.dto.param.HospitalClinicParam;
import cn.icebg.hospital.entity.HospitalClinic;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author icebg  clj9509@163.com
 * @date 2020/2/12
 */

@Api(value = "医院模块", tags = "诊室信息接口")
@RestController
@CrossOrigin
@RequestMapping("/hospital")
public class HospitalClinicController {

    @Resource
    private IHospitalClinicService clinicService;

    @Resource
    private IHospitalOutpatientService outpatientService;

    @ApiOperation(value = "添加诊室信息", notes = "传入 诊室信息参数（门诊编号、地址）")
    @RequestMapping(value = "/clinic", method = RequestMethod.POST)
    public CommonResult insertClinic(@RequestBody HospitalClinicParam param) {

        if (!outpatientService.count(param.getOutpatientId())) {
            return CommonResult.validateFailed("不存在，该门诊编号! ");
        }

        if (clinicService.insert(param)) {
            return CommonResult.success();
        }

        return CommonResult.failed("服务器错误，请联系管理员！");
    }

    @ApiOperation(value = "更新诊室信息", notes = "传入 诊室信息参数（门诊编号、地址）")
    @ApiImplicitParam(name = "id", value = "诊室编号", paramType = "path", dataType = "Long", required = true)
    @RequestMapping(value = "/clinic/{id}", method = RequestMethod.PUT)
    public CommonResult updateClinic(@PathVariable Long id, @RequestBody HospitalClinicParam param) {

        if (!clinicService.count(id)) {
            return CommonResult.validateFailed("不存在，该诊室编号！");
        }

        if (!outpatientService.count(param.getOutpatientId())) {
            return CommonResult.validateFailed("不存在，该门诊编号! ");
        }

        if (clinicService.update(id, param)) {
            return CommonResult.success();
        }

        return CommonResult.failed("服务器错误，请联系管理员！");
    }

    @ApiOperation(value = "删除诊室信息", notes = "传入 诊室编号")
    @ApiImplicitParam(name = "id", value = "诊室编号", paramType = "path", dataType = "Long", required = true)
    @RequestMapping(value = "/clinic/{id}", method = RequestMethod.DELETE)
    public CommonResult deleteClinic(@PathVariable Long id) {
        if (!clinicService.count(id)) {
            return CommonResult.validateFailed("不存在，该诊室编号！");
        }

        if (clinicService.delete(id)) {
            return CommonResult.success();
        }

        return CommonResult.failed("服务器错误，请联系管理员！");
    }

    @ApiOperation(value = "获取诊室信息", notes = "传入 诊室编号")
    @ApiImplicitParam(name = "id", value = "诊室编号", paramType = "path", dataType = "Long", required = true)
    @RequestMapping(value = "/clinic/{id}", method = RequestMethod.GET)
    public CommonResult<HospitalClinic> getClinic(@PathVariable Long id) {

        if (!clinicService.count(id)) {
            return CommonResult.validateFailed("不存在，该诊室编号！");
        }

        Optional<HospitalClinic> clinicOptional = clinicService.getOptional(id);

        return clinicOptional.map(CommonResult::success).orElseGet(() -> CommonResult.failed("服务器错误，请联系管理员！"));

    }
}
