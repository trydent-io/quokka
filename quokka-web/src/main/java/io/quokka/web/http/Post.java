package io.quokka.web.http;

import java.util.function.Function;

/**
 * Created by guada on 08/11/16.
 */
public interface Post extends HttpMethod {
	static Post of(final Post.Request request) {
		return new PostImpl(request);
	}

	/**
	 * Created by guada on 08/11/16.
	 */
	interface Request extends Function<HttpRequest, HttpResponse> {
	}
}
