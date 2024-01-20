package br.com.onaya.hexagonal.adapter.in.controller.response;


import java.util.Objects;

public class CustomerResponse {
    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;

    @Override
    public String toString() {
        return "CustomerResponse{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", cpf='" + cpf + '\'' +
                ", isValidCpf=" + isValidCpf +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerResponse that)) return false;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getAddress(), that.getAddress()) && Objects.equals(getCpf(), that.getCpf()) && Objects.equals(isValidCpf, that.isValidCpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getCpf(), isValidCpf);
    }

    public CustomerResponse() {
    }

    public CustomerResponse(String name, AddressResponse address, String cpf, Boolean isValidCpf) {
        this.name = name;
        this.address = address;
        this.cpf = cpf;
        this.isValidCpf = isValidCpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressResponse getAddress() {
        return address;
    }

    public void setAddress(AddressResponse address) {
        this.address = address;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getIsValidCpf() {
        return isValidCpf;
    }

    public void setIsValidCpf(Boolean isValidCpf) {
        this.isValidCpf = isValidCpf;
    }
}
