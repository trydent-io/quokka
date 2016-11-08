package io.quokka.web;

import io.quokka.web.http.Get;
import io.quokka.web.http.HttpMethod;
import io.quokka.web.http.Post;
import org.eclipse.collections.impl.factory.Lists;

/**
 * Created by guada on 08/11/16.
 */
public interface Endpoint {
	static Endpoint on(final String path, final HttpMethod... methods) {
		return on(Path.of(path), methods);
	}

	static Endpoint on(final Path path, final HttpMethod... methods) {
		return new PlainEndpoint(path, Lists.immutable.with(methods));
	}

	static Endpoint endpoint(final String path, final HttpMethod... methods) {
		return on(path, methods);
	}

	static Endpoint endpoint(final Path path, final HttpMethod... methods) {
		return on(path, methods);
	}

	static Endpoint on(final String path, final Endpoint endpoint, final HttpMethod... methods) {
		return on(Path.of(path), methods);
	}

	static Endpoint on(final Path path, final Endpoint endpoint, final HttpMethod... methods) {
		return new PlainEndpoint(path, Lists.immutable.with(methods));
	}

	static Endpoint endpoint(final String path, final Endpoint endpoint, final HttpMethod... methods) {
		return on(path, methods);
	}

	static Endpoint endpoint(final Path path, final Endpoint endpoint, final HttpMethod... methods) {
		return on(path, methods);
	}

	interface Match<T> {
		<G extends Get> T with(final G get);
		<P extends Post> T with(final P post);
	}
}
