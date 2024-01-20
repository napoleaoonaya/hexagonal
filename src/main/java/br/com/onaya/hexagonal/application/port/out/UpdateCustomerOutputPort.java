package br.com.onaya.hexagonal.application.port.out;

import br.com.onaya.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
