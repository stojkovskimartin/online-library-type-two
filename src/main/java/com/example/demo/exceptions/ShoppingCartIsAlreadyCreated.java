package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.METHOD_NOT_ALLOWED)
public class ShoppingCartIsAlreadyCreated extends RuntimeException {
    public ShoppingCartIsAlreadyCreated(String firstName) {
        super(String.format("Shopping cart is already created for user: %s", firstName));
    }
}

