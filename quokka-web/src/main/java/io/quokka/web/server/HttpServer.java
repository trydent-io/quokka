package io.quokka.web.server;

public interface HttpServer {
	static HttpServer onDefault() {
		return HttpServer.on(8080);
	}

	static HttpServer on(final int port) {
		return new PlainHttpServer(port);
	}

	HttpServer start();
	HttpServer stop();
}
