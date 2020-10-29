package com.zzp.study.common.vo;

import lombok.Data;
/**
 *
 * <p>
 *  //TODO
 *  ResultVo.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/29 1:04
 * @see  com.zzp.study.common.vo
 **/
@Data
public class ResultVo {
    private int code;
    private String msg;
    private Object data;

    public ResultVo(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVo() {
    }
    public static ResultVo ok(){
        return new ResultVo(0,"OK",null);
    }
    public static ResultVo fail(){
        return new ResultVo(1,"ERROR",null);
    }
    public static ResultVo ok(Object obj){
        return new ResultVo(0,"OK",obj);
    }
    public static ResultVo fail(String msg){
        return new ResultVo(1,msg,null);
    }
}
