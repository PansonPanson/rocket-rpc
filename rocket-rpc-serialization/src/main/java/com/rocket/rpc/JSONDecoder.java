package com.rocket.rpc;

import com.alibaba.fastjson.JSON;

/**
 * @description: 基于 json 的反序列化
 * @author: Panson
 **/

public class JSONDecoder implements Decoder {

    @Override
    public <T> T decode(byte[] bytes, Class<T> clazz) {
        return JSON.parseObject(bytes, clazz);
    }
}
