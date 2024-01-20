package br.com.onaya.hexagonal.adapter.in.controller.response;

import lombok.Data;

import java.util.Objects;

public class AddressResponse {
    private String street;
    private String city;
    private String state;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "AddressResponse{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressResponse that)) return false;
        return Objects.equals(street, that.street) && Objects.equals(city, that.city) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state);
    }

    public AddressResponse() {
    }

    public AddressResponse(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }
}
