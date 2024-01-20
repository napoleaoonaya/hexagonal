package br.com.onaya.hexagonal.application.core.usecase;

import br.com.onaya.hexagonal.application.core.domain.Customer;
import br.com.onaya.hexagonal.application.port.in.DeleteCustomerByIdInputPort;
import br.com.onaya.hexagonal.application.port.in.FindCustomerByIdInputPort;
import br.com.onaya.hexagonal.application.port.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdInputPort findCustomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(FindCustomerByIdInputPort findCustomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id){
        Customer customer = findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(customer.getId());
    }
}
