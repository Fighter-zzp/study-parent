package com.zzp.study.provider.domain;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;
/**
 *
 * <p>
 *  //TODO
 *  StuSign.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/11/1 22:41
 * @see  com.zzp.study.provider.domain
 **/
@Data
@Table(name = "stu_sign")
public class StuSign {
    /**
     * 主键值
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "class_name")
    private String className;

    @Column(name = "s_time")
    private Date sTime;

    @Column(name = "`type`")
    private String type;
}