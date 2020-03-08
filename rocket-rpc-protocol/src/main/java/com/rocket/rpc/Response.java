package com.rocket.rpc;

import lombok.Data;

/**
 * @description: 表示 RPC 的返回
 * @author: Panson
 **/

@Data
public class Response {

    /**
     * 服务返回码， 0 - 成功， 非0 - 失败
     */
    private Integer code = 0;

    /**
     * 错误信息
     */
    private String message = "OK";

    /**
     * 返回的数据
     */
    private Object data ;
}
