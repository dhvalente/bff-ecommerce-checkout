package br.com.ecommerce.checkout.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class CheckoutEntity {

    @Id
    private Long id;

    private String code;
}
