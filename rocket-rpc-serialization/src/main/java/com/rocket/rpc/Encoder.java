package com.rocket.rpc;


/**
 * 序列化接口
 *
 * @author panson
 */
public interface Encoder {

    byte[] encode(Object object);


}
