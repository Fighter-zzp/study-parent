package com.zzp.study.provider;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zzp.study.common.vo.ResultVo;
import com.zzp.study.provider.service.StudentSignService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class SignStudyProviderApplicationTests {

    @Resource
    private StudentSignService studentSignService;

    @Test
    void test() throws JsonProcessingException {
        var resultVo = studentSignService.queryAll();
        System.out.println(new ObjectMapper().writeValueAsString(resultVo));
    }

}
