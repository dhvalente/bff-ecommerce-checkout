package br.com.ecommerce.checkout.dtos.request;

public record CheckoutRequest(
        String firstName,
        String lastName,
        String email,
        String address,
        String complement,
        String country,
        String state,
        String cep,
        String saveAddress,
        String saveInfo,
        String paymentMethod,
        String cardNumber,
        String cardHolderName,
        String cardExpirationDate,
        String cardCvv
    ) {
}
