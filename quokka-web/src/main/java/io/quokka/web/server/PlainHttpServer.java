package io.quokka.web.server;

class PlainHttpServer implements HttpServer {
	private final int port;

	PlainHttpServer(final int port) {
		this.port = port;
	}

	@Override
	public HttpServer start() {
		return null;
	}

	@Override
	public HttpServer stop() {
		return null;
	}
}
