package steps;

import com.nick318.domain.Client;
import com.nick318.domain.ClientBase;
import com.nick318.domain.Dates;
import com.nick318.domain.Order;
import com.nick318.domain.Statuses;

public class OrderStep {
    public static OrderStep openOrderPage() {
        return new OrderStep();
    }

    public OrderStep clickAddOrder() {
        return this;
    }

    public OrderStep fillDescription(String description) {
        return this;
    }

    public OrderStep chooseClient(Client client) {
        return this;
    }

    public OrderStep chooseOrderCreateDate(Object dates) {
        return this;
    }

    public OrderStep chooseOrderFinishDate(Object dates) {
        return this;
    }

    public OrderStep choosePrice(String price) {
        return this;
    }

    public OrderStep chooseStatus(Statuses statuses) {
        return this;
    }

    public OrderStep addOrder(Order order) {
        //prerequisites
        ClientSteps.openClientPage()
                .addClient(ClientBase.newCustomer());

        addOrder(order);
        return this;
    }

    public OrderStep addOrderWithExistedUser(Order order) {
        OrderStep.openOrderPage()
                .clickAddOrder()
                .fillDescription(order.getDescription())
                .chooseClient(order.getClient())
                .chooseOrderCreateDate(order.getCreateDate())
                .chooseOrderFinishDate(order.getFinishDate())
                .choosePrice(order.getPrice())
                .chooseStatus(order.getStatus());
        return this;
    }
}
