package br.com.ecommerce.checkout.resource;

import br.com.ecommerce.checkout.dtos.request.CheckoutRequest;
import br.com.ecommerce.checkout.service.interfaces.CheckoutService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/checkout")
public class CheckoutResource {

    private final CheckoutService checkoutService;

    public CheckoutResource(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    public ResponseEntity<Void> create(CheckoutRequest request) {

        return ResponseEntity.ok().build();
    }
}
