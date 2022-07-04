package com.nellmicro.customer;

public record CustomerRegistrationRequest (
    String firstName,
    String lastName,
    String email) {
}

