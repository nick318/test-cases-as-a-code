package orders;

import com.nick318.domain.ClientBase;
import com.nick318.domain.Dates;
import com.nick318.domain.Statuses;
import org.junit.jupiter.api.Test;
import steps.ClientSteps;
import steps.OrderAssert;
import steps.OrderStep;

class OrdersTest {
    @Test
    void userCanAddOrderWithExistedUser() {
        //prerequisites
        ClientSteps.openClientPage()
                .addClient(ClientBase.newCustomer());

        OrderStep.openOrderPage()
                .clickAddOrder()
                .fillDescription("Поменять задние тормоза")
                .chooseClient(ClientBase.newCustomer())
                .chooseOrderCreateDate(Dates.TODAY)
                .chooseOrderFinishDate(Dates.TODAY)
                .choosePrice("10000")
                .chooseStatus(Statuses.PLANNED)
                .clickAddOrder();

        OrderAssert.orderShouldBeVisibleInTable();
    }
}
