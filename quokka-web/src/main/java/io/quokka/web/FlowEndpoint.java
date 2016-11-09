package io.quokka.web;

import io.quokka.web.http.HttpMethod;
import org.eclipse.collections.impl.factory.Lists;

/**
 * Created by guada on 09/11/16.
 */
public interface FlowEndpoint extends Endpoint {
    static FlowEndpoint on(final String path, final Endpoint endpoint, final HttpMethod... methods) {
        return on(Path.of(path), endpoint, methods);
    }

    static FlowEndpoint on(final Path path, final Endpoint endpoint, final HttpMethod... methods) {
        return new FlowEndpointImpl(path, Lists.immutable.with(methods));
    }

    static FlowEndpoint endpoint(final String path, final Endpoint endpoint, final HttpMethod... methods) {
        return on(path, methods);
    }

    static FlowEndpoint endpoint(final Path path, final Endpoint endpoint, final HttpMethod... methods) {
        return on(path, methods);
    }

}
