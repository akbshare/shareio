package com.immut;

import java.util.ArrayList;
import java.util.List;

public final class Hobbit {
    private String name;
    private Address address;
    private List<String> stuff;

    /*public Hobbit() {
    }*/

    public Hobbit(String name, Address address, List<String> stuff) {
        this.name = name;
        this.address = new Address(address.getCountry(),address.getCity());
        this.stuff = new ArrayList(stuff);
    }

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public Address getAddress() {
        return address;
    }

    /*public void setAddress(Address address) {
        this.address = address;
    }*/

    public List<String> getStuff() {
        return stuff;
    }

    /*public void setStuff(List<String> stuff) {
        this.stuff = stuff;
    }*/
}
