package com.rocket;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 处理网络请求的handler
 * @author: Panson
 * @date: 2020年03月14日 17:24
 */
public interface RequestHandler {

	void onRequest(InputStream inputStream, OutputStream outputStream);
}
