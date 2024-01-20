package br.com.onaya.hexagonal.application.port.out;

import br.com.onaya.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
