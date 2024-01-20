package br.com.onaya.hexagonal.adapter.out.repository.mapper;

import br.com.onaya.hexagonal.adapter.out.repository.entity.CustomerEntity;
import br.com.onaya.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Optional;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
    Customer toCustomer(CustomerEntity customerEntity);
}
