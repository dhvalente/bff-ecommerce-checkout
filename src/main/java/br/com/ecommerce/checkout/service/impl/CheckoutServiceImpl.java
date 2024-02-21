package br.com.ecommerce.checkout.service.impl;

import br.com.ecommerce.checkout.dtos.request.CheckoutRequest;
import br.com.ecommerce.checkout.entity.CheckoutEntity;
import br.com.ecommerce.checkout.repository.CheckoutRepository;
import br.com.ecommerce.checkout.service.interfaces.CheckoutService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private final CheckoutRepository checkoutRepository;

    public CheckoutServiceImpl(CheckoutRepository checkoutRepository) {
        this.checkoutRepository = checkoutRepository;
    }

    @Override
    public Optional<CheckoutEntity> create(CheckoutRequest request) {
        final CheckoutEntity checkout = new CheckoutEntity(UUID.randomUUID().toString());
        return Optional.of(checkoutRepository.save(checkout));
    }
}
