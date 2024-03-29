package ru.job4j.lifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.job4j.lifecycle.model.Product;

@Configuration
public class Config {
    @Bean(name = "myProduct",
        initMethod = "initMethod",
        destroyMethod = "destroyMethod"
    )
    public Product getProduct() {
        return new Product("Milk", 2.5);
    }
}