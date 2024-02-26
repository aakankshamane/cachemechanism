package com.csi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class REcordNotFoundException extends RuntimeException {

    public REcordNotFoundException(String msg) {

        super(msg);
    }
}
