package br.com.onaya.hexagonal.application.port.in;

import br.com.onaya.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
