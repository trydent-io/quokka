package io.quokka.web.http;

import java.util.function.Function;

/**
 * Created by guada on 08/11/16.
 */
public interface Get extends HttpMethod {
	static Get of(final Get.Request request) {
		return new GetImpl(request);
	}

	static Get get(final Get.Request request) {
		return of(request);
	}

	/**
	 * Created by guada on 08/11/16.
	 */
	interface Request extends Function<HttpRequest, HttpResponse> {
	}
}
