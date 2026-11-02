package model;

import java.util.Objects;

public class Customer {
    private final String id;
    private final String name;
    private final String mobile;
    private final Address address;

    public Customer(String id, String name, String mobile, Address address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String mobile() {
        return mobile;
    }

    public Address address() {
        return address;
    }

    public static class Address {
        private final String city;
        private final String state;

        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        @Override
        public String toString() {
            return city + ", " + state;
        }
    }

    @Override
    public String toString() {
        return "Customer{id='" + id + "', name='" + name
                + "', mobile='" + mobile + "', address=" + address + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Customer other)) {
            return false;
        }
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}