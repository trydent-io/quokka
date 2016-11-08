package io.quokka.web.http;

/**
 * Created by guada on 08/11/16.
 */
final class PostImpl implements Post {
	private final Request request;

	PostImpl(final Request request) {
		this.request = request;
	}
}
