package io.quokka.web.http;

/**
 * Created by guada on 08/11/16.
 */
final class GetImpl implements Get {
	private final Get.Request request;

	GetImpl(final Request request) {
		this.request = request;
	}
}
