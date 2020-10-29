package com.zzp.study.provider.controller;

import com.zzp.study.common.dto.SignDto;
import com.zzp.study.common.vo.ResultVo;
import com.zzp.study.provider.service.StudentSignService;
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
 * StuSignController.java
 * </p>
 *
 * @author 佐斯特勒
 * @version v0.0.1
 * @date 2020/10/29 1:08
 * @see com.zzp.study.provider.controller
 **/
@RestController
@RequestMapping(value = "/provider/sign")
public class StuSignController {

    @Resource
    private StudentSignService studentSignService;

    @PostMapping("/save.do")
    public ResultVo save(@RequestBody SignDto dto) {
        return studentSignService.sign(dto);
    }

    @GetMapping("/queryname.do")
    public ResultVo names(@RequestParam String name) {
        return studentSignService.queryByName(name);
    }

    @GetMapping("/all.do")
    public ResultVo all() {
        // 测试熔断
        int i = 1 / 0;
        return studentSignService.queryAll();
    }

}
