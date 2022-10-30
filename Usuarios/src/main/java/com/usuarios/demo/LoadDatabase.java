package com.usuarios.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Silas
 */
@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDataBase(UsuariosRepository repository) {
        return (String[] args) -> {
            log.info("Preloading " + repository.save(new Usuarios(7, "0X0000edasbdasbbfhsaffa", 32, "0X000111euvfahfgaksfgasfhkg", "0Xei10Shwhyxuvfhdgfd", "Brasil")));
        };
    }
}
