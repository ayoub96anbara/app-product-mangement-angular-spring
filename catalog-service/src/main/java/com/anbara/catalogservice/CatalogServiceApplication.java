package com.anbara.catalogservice;

import com.anbara.catalogservice.dao.ProductRepository;
import com.anbara.catalogservice.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.math.BigDecimal;
import java.util.stream.Stream;

@SpringBootApplication
public class CatalogServiceApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Product.class);
//        Stream.of(
//                new Product("pc", "pc portable", new BigDecimal(50), 100),
//                new Product("smartphone", "android os", new BigDecimal(20), 69),
//                new Product("camera", "hd", new BigDecimal(10), 88)
//        ).forEach(productRepository::save);

    }
}
