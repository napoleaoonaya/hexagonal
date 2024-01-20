package br.com.onaya.hexagonal.application.core.usecase;

import br.com.onaya.hexagonal.application.port.in.InsertCustomerInputPort;
import br.com.onaya.hexagonal.application.port.out.FindAddressByZipCodeOutputPort;
import br.com.onaya.hexagonal.application.port.out.InsertCustomerOutputPort;
import br.com.onaya.hexagonal.application.core.domain.Customer;
import br.com.onaya.hexagonal.application.port.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutPutPort;
    private final InsertCustomerOutputPort insertCustomerOutPutPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;


    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutPutPort,
            InsertCustomerOutputPort insertCustomerOutPutPort, SendCpfForValidationOutputPort sendCpfForValidationOutputPort){
        this.findAddressByZipCodeOutPutPort = findAddressByZipCodeOutPutPort;
        this.insertCustomerOutPutPort = insertCustomerOutPutPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeOutPutPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutPutPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}
