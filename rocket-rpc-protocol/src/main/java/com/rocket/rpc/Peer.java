package com.rocket.rpc;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description: 表示网络传输的一个端点
 * @author: Panson
 **/

@Data
@AllArgsConstructor
public class Peer {

    private String host;

    private Integer port;
}
