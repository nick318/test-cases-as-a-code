package steps;

import com.nick318.domain.Client;
import com.nick318.domain.ClientBase;
import com.nick318.domain.Dates;
import com.nick318.domain.Order;
import com.nick318.domain.Statuses;
import io.qameta.allure.Step;

public class OrderStep {
    @Step("Открыть страницу заказов")
    public static OrderStep openOrderPage() {
        return new OrderStep();
    }

    @Step("Нажать на кнопку добавить заказ")
    public OrderStep clickAddOrder() {
        return this;
    }

    @Step("Заполнить поле описание {description}")
    public OrderStep fillDescription(String description) {
        return this;
    }

    @Step("Выбрать клиента")
    public OrderStep chooseClient(Client client) {
        return this;
    }

    @Step("Выбрать дату создания")
    public OrderStep chooseOrderCreateDate(Object dates) {
        return this;
    }

    @Step("Выбрать дату завершения")
    public OrderStep chooseOrderFinishDate(Object dates) {
        return this;
    }

    @Step("Заполнить поле стоимость {price}")
    public OrderStep choosePrice(String price) {
        return this;
    }

    @Step("Выбрать статус {statuses}")
    public OrderStep chooseStatus(Statuses statuses) {
        return this;
    }

    @Step("Добавить заказ")
    public OrderStep addOrder(Order order) {
        //prerequisites
        ClientSteps.openClientPage()
                .addClient(ClientBase.newCustomer());

        addOrder(order);
        return this;
    }

    @Step("Добавить заказ с существующим клиентом")
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
