package io.quokka.web;

import io.quokka.web.http.HttpMethod;

/**
 * Created by guada on 08/11/16.
 */
final class FlowEndpointImpl implements FlowEndpoint {
	private final Endpoint endpoint;
	private final


	FlowEndpointImpl(final Path path, final Iterable<HttpMethod> methods) {
		this.path = path;
		this.methods = methods;
	}
}
