package io.quokka.web;

import org.eclipse.collections.impl.factory.Lists;

/**
 * Created by guada on 08/11/16.
 */
public interface Path {
	static Path of(final String... steps) {
		return new PathImpl(Lists.immutable.with(steps));
	}
	static Path path(final String... steps) {
		return of(steps);
	}

	String joined();
}
