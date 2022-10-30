package com.usuarios.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Silas
 */
@ControllerAdvice
public class UsuarioNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(UsuarioNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String usuarioNotFoundHandler(UsuarioNotFoundException uv) {
        return uv.getMessage();
    }
}
