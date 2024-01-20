package br.com.onaya.hexagonal.adapter.in.consumer;

import br.com.onaya.hexagonal.adapter.in.consumer.mapper.CustomerMessageMapper;
import br.com.onaya.hexagonal.adapter.in.consumer.message.CustomerMessage;
import br.com.onaya.hexagonal.application.port.in.UpdateCustomerInputPort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validations", groupId = "hexagonal")
    public void receive(CustomerMessage customerMessage){
        var customer = customerMessageMapper.toCustomerMessageMapper(customerMessage);
        updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
