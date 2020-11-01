package com.zzp.study.business.controller;

import com.zzp.study.business.feign.StudentSignFeign;
import com.zzp.study.common.dto.SignDto;
import com.zzp.study.common.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * //TODO
 * StudentSignController.java
 * </p>
 *
 * @author 佐斯特勒
 * @version v0.0.1
 * @date 2020/10/29 9:06
 * @see com.zzp.study.business.controller
 **/
@RestController
@RequestMapping(value = "/api/sign")
@Api(value = "签到接口", tags = "签到功能")
public class StudentSignController {
    @Resource
    private StudentSignFeign studentSignFeign;

    @ApiOperation(value = "保存签到信息", notes = "save")
    @ApiImplicitParams({@ApiImplicitParam(name = "签到参数", required = true, paramType = "body")})
    @PostMapping("/save.do")
    public ResultVo save(@RequestBody SignDto dto) {
        return studentSignFeign.save(dto);
    }

    @ApiOperation(value = "查询签到信息", notes = "通过名字查询签到")
    @ApiImplicitParams({@ApiImplicitParam(name = "名字", required = true, paramType = "query")})
    @GetMapping("/query_name.do")
    public ResultVo names(@RequestParam String name) {
        return studentSignFeign.names(name);
    }

    @ApiOperation(value = "查询全部签到信息", notes = "这里测试熔断")
    @GetMapping("/all.do")
    public ResultVo all() {
        return studentSignFeign.all();
    }
}
