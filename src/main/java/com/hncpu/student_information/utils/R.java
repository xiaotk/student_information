package com.hncpu.student_information.utils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R {
    private boolean success;
    private Integer code;
    private String message;
    private Map<String,Object> data = new HashMap<>();

    private R(){

    }

    public static R ok(){
        R r = new R();
        r.setSuccess(true);
        r.setCode(ResultCode.SUCCESS);
        r.setMessage("成功");
        return r;
    }
    public static R error(){
        R r = new R();
        r.setSuccess(false);
        r.setCode(ResultCode.ERROR);
        r.setMessage("失败");
        return r;
    }

    public R data(String name,Object obj){
        data.put(name, obj);
        return this;
    }
    public R code(Integer code){
        this.code=code;
        return this;
    }
    public R message(String message){
        this.message = message;
        return this;
    }
}
