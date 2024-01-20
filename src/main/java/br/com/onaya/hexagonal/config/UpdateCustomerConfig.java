package br.com.onaya.hexagonal.config;

import br.com.onaya.hexagonal.adapter.out.FindAddressByZipCodeAdapter;
import br.com.onaya.hexagonal.adapter.out.UpdateCustomerAdapter;
import br.com.onaya.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import br.com.onaya.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdAdapter,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter

    ){
        return new UpdateCustomerUseCase(findCustomerByIdAdapter,findAddressByZipCodeAdapter,updateCustomerAdapter);
    }
}
