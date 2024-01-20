package br.com.onaya.hexagonal.adapter.in.consumer.mapper;

import br.com.onaya.hexagonal.adapter.in.consumer.message.CustomerMessage;
import br.com.onaya.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomerMessageMapper(CustomerMessage customerMessage);
}
