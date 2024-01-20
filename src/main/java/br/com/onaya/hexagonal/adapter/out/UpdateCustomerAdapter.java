package br.com.onaya.hexagonal.adapter.out;

import br.com.onaya.hexagonal.adapter.out.repository.CustomerRepository;
import br.com.onaya.hexagonal.adapter.out.repository.mapper.CustomerEntityMapper;
import br.com.onaya.hexagonal.application.core.domain.Customer;
import br.com.onaya.hexagonal.application.port.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort{
    
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    
    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
