package br.com.ecommerce.checkout.service.interfaces;

import br.com.ecommerce.checkout.dtos.request.CheckoutRequest;
import br.com.ecommerce.checkout.entity.CheckoutEntity;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest request);
}
