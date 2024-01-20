package br.com.onaya.hexagonal.config;

import br.com.onaya.hexagonal.adapter.out.FindAddressByZipCodeAdapter;
import br.com.onaya.hexagonal.adapter.out.InsertCustomerAdapter;
import br.com.onaya.hexagonal.adapter.out.SendCpfForValidationAdapter;
import br.com.onaya.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter,insertCustomerAdapter, sendCpfForValidationAdapter);
    }
}
