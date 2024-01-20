package br.com.onaya.hexagonal.adapter.out.client.mapper;

import br.com.onaya.hexagonal.adapter.out.client.response.AddressResponse;
import br.com.onaya.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
