package io.quokka.web;

import io.quokka.web.http.HttpMethod;

/**
 * Created by guada on 08/11/16.
 */
final class EndpointImpl implements Endpoint {
	private final Path path;
	private final Iterable<HttpMethod> methods;

	EndpointImpl(final Path path, final Iterable<HttpMethod> methods) {
		this.path = path;
		this.methods = methods;
	}
}
