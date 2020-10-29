package com.zzp.study.business.controller;

import com.zzp.study.business.feign.StudentSignFeign;
import com.zzp.study.common.dto.SignDto;
import com.zzp.study.common.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 *
 * <p>
 *  //TODO
 *  StudentSignController.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/29 9:06
 * @see  com.zzp.study.business.controller
 **/
@RestController
@RequestMapping(value = "/api/sign")
public class StudentSignController {
    @Resource
    private StudentSignFeign studentSignFeign;

    @PostMapping("/save.do")
    public ResultVo save(@RequestBody SignDto dto){
        return studentSignFeign.save(dto);
    }

    @GetMapping("/queryname.do")
    public ResultVo names(@RequestParam String name){
        return studentSignFeign.names(name);
    }

    @GetMapping("/all.do")
    public ResultVo all(){
        return studentSignFeign.all();
    }
}
