package com.example.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request input, Context context) {
        String name = input.getName();
        String message = "Hello, " + name + "! Welcome to AWS Lambda.";
        context.getLogger().log("Processed request for: " + name);
        return new Response(message);
    }
}
