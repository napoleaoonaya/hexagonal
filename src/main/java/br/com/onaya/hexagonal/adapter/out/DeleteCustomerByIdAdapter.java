package br.com.onaya.hexagonal.adapter.out;

import br.com.onaya.hexagonal.adapter.out.repository.CustomerRepository;
import br.com.onaya.hexagonal.application.port.out.DeleteCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteCustomerByIdAdapter implements DeleteCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }
}
