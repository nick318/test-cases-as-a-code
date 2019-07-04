package com.nick318.domain;

public class OrderBase {
    public static Order newOrder(Client client) {
        return new Order()
                .setDescription("Сделать что-то")
                .setCreateDate(Dates.TODAY)
                .setFinishDate(Dates.TODAY)
                .setPrice("12000")
                .setStatus(Statuses.PLANNED)
                .setClient(client);
    }

    public static Order newOrder() {
        return newOrder(ClientBase.newCustomer());
    }
}
