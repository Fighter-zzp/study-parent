package com.zzp.study.business.controller;


import com.zzp.study.common.dto.SignDto;
import com.zzp.study.common.vo.ResultVo;
import com.zzp.study.provider.service.StudentSignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * //TODO
 * StudentSignController.java
 * </p>
 *
 * @author 佐斯特勒
 * @version v0.0.1
 * @date 2020/11/1 23:14
 * @see com.zzp.study.business.controller
 **/
@RestController
@RequestMapping("/busi")
@Api(value = "签到接口", tags = "签到功能")
public class StudentSignController {

    @DubboReference(version = "0.0.1", retries = 5, timeout = 12000)
    private StudentSignService studentSignService;

    @ApiOperation(value = "保存签到信息", notes = "save", httpMethod = "POST")
    @ApiImplicitParams({@ApiImplicitParam(name = "签到参数", required = true, paramType = "body")})
    @PostMapping("/api/sign/save.do")
    public ResultVo save(@RequestBody SignDto dto) {
        return studentSignService.sign(dto);
    }

    @ApiOperation(value = "查询签到信息", notes = "通过名字查询签到", httpMethod = "GET")
    @ApiImplicitParams({@ApiImplicitParam(name = "名字", required = true, paramType = "query")})
    @GetMapping("/api/sign/queryname.do")
    public ResultVo names(@RequestParam String name) {
        return studentSignService.queryByName(name);
    }

    @ApiOperation(value = "查询全部签到信息", notes = "这里测试熔断(暂无)", httpMethod = "GET")
    @GetMapping("/api/sign/all.do")
    public ResultVo all() {
        return studentSignService.queryAll();
    }
}
