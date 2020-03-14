package com.rocket;

import com.rocket.rpc.Peer;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author: Panson
 * @date: 2020年03月14日 17:28
 */
public class HTTPTransportClient implements TransportClient {

	private String url;

	@Override
	public void connect(Peer peer) {
		this.url = "http://" + peer.getHost() + peer.getPort();
	}

	@Override
	public InputStream write(InputStream inputStream) {

		try {
			HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
			httpURLConnection.setDoOutput(true);
			httpURLConnection.setDoInput(true);
			httpURLConnection.setUseCaches(false);
			httpURLConnection.setRequestMethod("post");

			httpURLConnection.connect();
			IOUtils.copy(inputStream, httpURLConnection.getOutputStream());

			int resultCode = httpURLConnection.getResponseCode();
			if(resultCode == HttpURLConnection.HTTP_OK) {
				return httpURLConnection.getInputStream();
			} else {
				return httpURLConnection.getErrorStream();
			}

		} catch (IOException e) {
			throw new IllegalStateException();
		}

	}


	@Override
	public void close() {

	}
}
