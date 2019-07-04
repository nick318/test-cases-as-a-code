package com.nick318.domain;

public class ClientBase {
    public static Client newCustomer() {
        return new Client()
                .setFirstName("My firstName")
                .setMiddleName("My middle name")
                .setLastName("My lastName")
                .setPhone("+78654357632");
    }
}
