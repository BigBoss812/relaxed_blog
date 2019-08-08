package com.relaxed.blog.suport;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jerry
 * @version 1.0
 * @description controller 响应模型
 * @Date 2019/8/7 13:29
 */
public class ResultBean {

    private static final String CODE_SUCCESS = "success";

    private static final String CODE_FAIL = "fail";
    
    private String message = CODE_SUCCESS;
    
    /**
     * 200√  500×
     */
    private Integer code = 200;
    
    private Map<String, Object> result = null;

    public ResultBean() {
        this.message = CODE_SUCCESS;
    }
    
    public ResultBean(String message) {
        this.message = message;
    }
    
    public ResultBean(String message, Integer code) {
        super();
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public ResultBean setMessage(String message) {
        this.message = message;
        return this;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }
    
    public static ResultBean success() {
        return new ResultBean();
    }
    
    public static ResultBean success(String message) {
        return new ResultBean(message);
    }
    
    public static ResultBean fail() {
        return new ResultBean(CODE_FAIL , 1);
    }
    
    public static ResultBean fail(String message) {
        return new ResultBean(message  , 1 );
    }
    
    public ResultBean result(Map<String, Object> result) {
        this.result = result;
        return this;
    }
    
    public ResultBean putResult(String key, Object value) {
        if(result == null) {
            result = new HashMap<>(1);
        }
        this.result.put(key, value);
        return this;
    }

    public ResultBean msg(String message) {
       this.message = message;
       return this;
    }
    
}
