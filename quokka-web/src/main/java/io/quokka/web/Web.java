package io.quokka.web;

import org.eclipse.collections.impl.factory.Lists;

/**
 * Created by guada on 08/11/16.
 */
public interface Web {
	static Web byDefault() {
		return new WebImpl();
	}

	default Web endpoints(final Endpoint... endpoints) {
		return endpoints(Lists.immutable.with(endpoints));
	}
	Web endpoints(final Iterable<Endpoint> endpoints);
}
