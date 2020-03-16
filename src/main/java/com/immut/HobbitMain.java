package com.immut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HobbitMain {
    public static void main(String[] args) {
        Address address = new Address("Australia","brisbane");
        List<String> stuff = new ArrayList<>();
        stuff.add("Sword");
        stuff.add("Ring of power");
        Hobbit h = new Hobbit("Steven Smith",address, stuff);
        //Hobbit h = (Hobbit)cb;
        //System.out.println(h.getName());
        //System.out.println();
        //cb.hackTheImmut("David Warner");
        //System.out.println(h.getName());
        System.out.println("Hobbit Country :"+ h.getAddress().getCountry());
        System.out.println("Hobbit City :"+ h.getAddress().getCity());
        System.out.println("Hobbit stuff :"+ h.getStuff());

        address.setCountry("New Zealand");
        address.setCity("Auckland");
        stuff.remove("Sword");
        System.out.println("After Immut");
        System.out.println("Hobbit Country :"+ h.getAddress().getCountry());
        System.out.println("Hobbit City :"+ h.getAddress().getCity());
        System.out.println("Hobbit stuff :"+ h.getStuff());


    }
}
