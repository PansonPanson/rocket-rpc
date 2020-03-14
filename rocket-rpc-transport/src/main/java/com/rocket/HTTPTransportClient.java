package com.rocket;

import com.rocket.rpc.Peer;

import java.io.InputStream;

/**
 * @author: Panson
 * @date: 2020年03月14日 17:28
 */
public class HTTPTransportClient implements TransportClient {

	@Override
	public void connect(Peer peer) {

	}

	@Override
	public InputStream write(InputStream inputStream) {
		return null;
	}

	@Override
	public void close() {

	}
}
