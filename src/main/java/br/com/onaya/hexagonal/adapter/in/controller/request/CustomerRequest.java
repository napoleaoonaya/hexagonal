package br.com.onaya.hexagonal.adapter.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Objects;

public class CustomerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String cpf;
    @NotBlank
    private String zipCode;

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerRequest that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getCpf(), that.getCpf()) && Objects.equals(getZipCode(), that.getZipCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCpf(), getZipCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public CustomerRequest() {
    }

    public CustomerRequest(String name, String cpf, String zipCode) {
        this.name = name;
        this.cpf = cpf;
        this.zipCode = zipCode;
    }
}
