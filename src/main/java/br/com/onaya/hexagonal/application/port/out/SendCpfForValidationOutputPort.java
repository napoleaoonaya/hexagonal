package br.com.onaya.hexagonal.application.port.out;

public interface SendCpfForValidationOutputPort {
    void send(String cpf);
}
