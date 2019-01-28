package com.anusha.testing;

import com.anusha.model.Address;
import com.anusha.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PersonApp {
    public static void main(String[] args) {
        Person p = new Person("anusha", "rao");


        Address hrr = new Address("hrr", 57014);
        Address blr= new Address("blr", 57084);

        ArrayList<Address> addresses=new ArrayList<>();
        addresses.add(hrr);
        addresses.add(blr);

    p.setAddresses(addresses);

        List<Address> anushaAddresses = p.getAddresses();
        for(Address address:anushaAddresses)
        {
            System.out.println("Person address is: "+address.getCity());

        }

/*        for(Address phone:p.getAddresses())
        {
            System.out.println("Person phone Number is: "+phone.getPhoneNumber());
        } */

        System.out.println("Person address is: "+p.getAddresses());

    }
}
