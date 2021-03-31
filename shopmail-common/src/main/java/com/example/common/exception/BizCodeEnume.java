package com.example.common.exception;

/* 暂时规定的系统错误码5位，前2位表示业务场景，后三位表示错误码：
         10：通用
             001：参数格式校验
         11：商品
         12：订单
         13：购物车
         14：物流*/

public enum BizCodeEnume {
    //这个两个就是两个对象
    UNKNOW_EXCEPTION(10000, "系统未知异常"),
    VALID_EXCEPTION(10001,"参数格式校验失败");


    private int code;
    private String msg;

    BizCodeEnume(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
