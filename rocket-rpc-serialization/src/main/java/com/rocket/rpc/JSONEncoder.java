package com.rocket.rpc;

import com.alibaba.fastjson.JSON;

/**
 * @description: 基于 json 的序列化实现
 * @author: Panson
 **/

public class JSONEncoder implements Encoder {


    @Override
    public byte[] encode(Object object) {
        return JSON.toJSONBytes(object);
    }
}
