package br.com.onaya.hexagonal.adapter.out;

import br.com.onaya.hexagonal.adapter.out.client.FindAddressByZipCodeClient;
import br.com.onaya.hexagonal.adapter.out.client.mapper.AddressResponseMapper;
import br.com.onaya.hexagonal.application.core.domain.Address;
import br.com.onaya.hexagonal.application.port.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
