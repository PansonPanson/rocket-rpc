package com.rocket.rpc;

/**
 * @description: 反序列化接口
 * @author: Panson
 **/

public interface Decoder {

    <T> T decode(byte[] bytes, Class<T> clazz);
}
