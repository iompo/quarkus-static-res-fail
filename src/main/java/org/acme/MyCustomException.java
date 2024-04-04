package org.acme;

import jakarta.ws.rs.core.Response;

public class MyCustomException extends RuntimeException {
    private final Response.Status status;

    public MyCustomException(Response.Status status, String message) {
        super(message);
        this.status = status;
    }

    public Response.Status getStatus() {
        return status;
    }
}
