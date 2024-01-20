package br.com.onaya.hexagonal.application.port.out;

import br.com.onaya.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
