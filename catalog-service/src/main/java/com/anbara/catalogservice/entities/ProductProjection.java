package com.anbara.catalogservice.entities;

import org.springframework.data.rest.core.config.Projection;

import java.math.BigDecimal;

@Projection(name = "P1",types = Product.class)
public interface ProductProjection {

    BigDecimal getPrice();
    String getQuantity();
}
