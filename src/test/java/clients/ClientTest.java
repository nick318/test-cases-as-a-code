package clients;

import com.nick318.domain.ClientBase;
import com.nick318.domain.OrderBase;
import errors.ErrorsText;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ClientAssert;
import steps.ClientSteps;
import steps.OrderStep;

@Feature("Клиенты")
@Severity(SeverityLevel.CRITICAL)
public class ClientTest {

    @Test
    @DisplayName("Пользователь может добавить нового клиента")
    void userCanAddNewClient() {
        ClientSteps.openClientPage()
                .clickAddClient()
                .fillFirstName("Ivan")
                .fillLastName("Ivanov")
                .fillMiddleName("Ivanovich")
                .fillPhone("+78652782343")
                .clickOk();

        ClientAssert.newClientShouldBeVisibleInTable();
    }

    @Test
    void clientShouldBeMappedProperly() {
        ClientSteps.openClientPage()
               .addClient(ClientBase.newCustomer());

        ClientAssert.clientIsMapped();
    }

    @Test
    void userCanAddNewClientUsingOnlyPhone() {
        ClientSteps.openClientPage()
                .clickAddClient()
                .fillPhone("+78652782343")
                .clickOk();

        ClientAssert.newClientShouldBeVisibleInTable();
    }

    @Test
    void userCannotAddClientWithoutPhone() {
        ClientSteps.openClientPage().clickAddClient().clickOk();
        ClientAssert.errorPopupWithText(ErrorsText.requirePhoneNumber).isVisible();
    }

    @Test
    void userCanEditClient() {
        ClientSteps.openClientPage()
                .addClient(ClientBase.newCustomer())
                .chooseClientInTable()
                .clickEditClient()
                .fillFirstName("Update name")
                .fillLastName("Update lastName")
                .fillMiddleName("Update middle name")
                .fillPhone("+71112223456")
                .clickOk();

        ClientAssert.clientShouldHaveUpdatedFields();
    }

    @Test
    void userCanDeleteClient() {
        ClientSteps.openClientPage()
                .addClient(ClientBase.newCustomer())
                .chooseClientInTable()
                .clickDeleteClient()
                .applyDeletion();

        ClientAssert.clientShouldBeDeleted();
    }

    @Test
    void userCannotDeleteClientWithOrder() {
        ClientSteps.openClientPage()
                .addClient(ClientBase.newCustomer());
        OrderStep.openOrderPage()
                .addOrderWithExistedUser(OrderBase.newOrder());

        ClientSteps.openClientPage()
                .chooseClientInTable()
                .clickDeleteClient()
                .applyDeletion();

        ClientAssert.errorPopupWithText(ErrorsText.couldNotDeleteUserWithOrder).isVisible();
    }

}
