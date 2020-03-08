package com.rocket.rpc;

import lombok.Data;

/**
 * @description: 表示 RPC 的一个请求
 * @author: Panson
 **/

@Data
public class Request {

    private ServiceDescriptor serviceDescriptor;

    private Object[] parameters;
}
