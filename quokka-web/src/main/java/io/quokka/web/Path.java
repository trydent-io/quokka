package io.quokka.web;

import org.eclipse.collections.impl.factory.Lists;

/**
 * Created by guada on 08/11/16.
 */
public interface Path {
	static Path of(final String... steps) {
		return new PathImpl(Lists.immutable.with(steps));
	}
	static Path of(final Iterable<String> steps) {
		return new PathImpl(steps);
	}
	static Path path(final String... steps) {
		return of(steps);
	}
	static Path path(final Iterable<String> steps) {
		return of(steps);
	}

	Iterable<String> steps();
	String joined();
	Path after(final Path path);
	Path before(final Path path);
}
