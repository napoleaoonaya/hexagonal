package br.com.onaya.hexagonal.application.core.usecase;

import br.com.onaya.hexagonal.application.core.domain.Customer;
import br.com.onaya.hexagonal.application.port.in.FindCustomerByIdInputPort;
import br.com.onaya.hexagonal.application.port.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id).orElseThrow(
                () -> new RuntimeException("Customer not found!")
        );
    }
}
