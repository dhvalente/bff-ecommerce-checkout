package br.com.ecommerce.checkout.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class CheckoutEntity {

    @Id
    private Long id;

    private String code;

    public CheckoutEntity() {

    }
    public CheckoutEntity( String code) {
        this.code = code;
    }

    public CheckoutEntity(Long id, String code) {
        this.id = id;
        this.code = code;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
