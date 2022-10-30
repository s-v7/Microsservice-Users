package com.usuarios.demo;
/**
 *
 * @author Silas
 */
public class UsuarioNotFoundException extends RuntimeException{

    public UsuarioNotFoundException(Integer id) {
            super("Could not Find Usuário " + id);
    }    
}
