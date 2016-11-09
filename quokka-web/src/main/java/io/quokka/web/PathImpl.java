package io.quokka.web;

import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.joining;

/**
 * Created by guada on 08/11/16.
 */
final class PathImpl implements Path {
	private final Iterable<String> steps;

	PathImpl(final Iterable<String> steps) {
		this.steps = steps;
	}

	@Override
	public String joined() {
		return StreamSupport
			.stream(this.steps.spliterator(), false)
			.collect(joining("/"));
	}

	@Override
	public Iterable<String> steps() {
		return this.steps;
	}

	@Override
	public Path after(Path path) {
		return null;
	}

	@Override
	public Path before(Path path) {
		return null;
	}
}
