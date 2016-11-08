package io.quokka;

import static io.quokka.web.Endpoint.endpoint;
import static io.quokka.web.Path.path;
import static io.quokka.web.http.Get.get;

/**
 * Created by guada on 08/11/16.
 */
public class Demo {
	public static void main(String... args) {
		endpoint(
			path("api", "people"),
			get(request -> null)
		);
	}
}
