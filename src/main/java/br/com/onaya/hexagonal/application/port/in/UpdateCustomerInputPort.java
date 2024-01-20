package br.com.onaya.hexagonal.application.port.in;

import br.com.onaya.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
