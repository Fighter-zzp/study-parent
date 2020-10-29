package com.zzp.study.common.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * <p>
 *  //TODO
 *  StuSignDto.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/29 1:05
 * @see  com.zzp.study.common.dto
 **/
@Data
public class StuSignDto implements Serializable {

    private Integer id;

    private String name;

    private String className;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date sTime;

    private String type;

    private static final long serialVersionUID = 1L;
}
