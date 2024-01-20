package br.com.onaya.hexagonal.adapter.in.controller.mapper;

import br.com.onaya.hexagonal.adapter.in.controller.request.CustomerRequest;
import br.com.onaya.hexagonal.adapter.in.controller.response.CustomerResponse;
import br.com.onaya.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "address",ignore = true)
    @Mapping(target = "isValidCpf",ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
    CustomerResponse toCustomerResponse(Customer customer);
}
