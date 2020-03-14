package com.rocket;

/**
 *
 * 1、启动、监听
 * 2、接受请求
 * 3、关闭监听
 *
 * @author: Panson
 * @date: 2020年03月14日 17:21
 */
public interface TransportServer {

	void init(int port, RequestHandler handler);

	void start();

	void stop();
}
