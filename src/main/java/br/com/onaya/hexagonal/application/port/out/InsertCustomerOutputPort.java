package br.com.onaya.hexagonal.application.port.out;

import br.com.onaya.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
