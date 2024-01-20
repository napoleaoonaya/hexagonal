package br.com.onaya.hexagonal.application.port.out;

import br.com.onaya.hexagonal.application.core.domain.Customer;

public interface DeleteCustomerByIdOutputPort {
    void delete(String id);
}
