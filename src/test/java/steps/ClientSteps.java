package steps;

import com.nick318.domain.Client;
import io.qameta.allure.Step;

public class ClientSteps {
    /**
     * Открыть страницу клиентов.
     * @return this;
     */
    @Step("Открыть страницу клиентов")
    public static ClientSteps openClientPage() {
        ClientSteps clientSteps = new ClientSteps();
        clientSteps.clickOnShowAllClients();
        return clientSteps;
    }

    /**
     * Нажать на кнопку посмотреть всех клиентов.
     */
    @Step("Нажать на кнопку посмотреть всех клиентов")
    public void clickOnShowAllClients() {

    }

    @Step("Нажать на кнопку добавить клиента")
    public ClientSteps clickAddClient() {
        return this;
    }

    @Step("Заполнить поле имя {firstName}")
    public ClientSteps fillFirstName(String firstName) {
        return this;
    }

    @Step("Заполнить поле фамилия {lastName}")
    public ClientSteps fillLastName(String lastName) {
        return this;
    }

    @Step("Заполнить поле телефон {phone}")
    public ClientSteps fillPhone(String phone) {
        return this;
    }

    @Step("Нажать ок")
    public void clickOk() {

    }

    /**
     * Добавить клиентов.
     * @param client тестовые данные для клиента
     * @return this;
     */
    @Step("Добавить клиента")
    public ClientSteps addClient(Client client) {
        openClientPage()
                .clickAddClient()
                .fillFirstName(client.getFirstName())
                .fillLastName(client.getLastName())
                .fillMiddleName(client.getMiddleName())
                .fillPhone(client.getPhone())
                .clickOk();
        return this;
    }

    @Step("Выбрать клиента в таблице")
    public ClientSteps chooseClientInTable() {
        return this;
    }

    @Step("Нажать на кнопку редактировать клиента")
    public ClientSteps clickEditClient() {
        return this;
    }

    @Step("Заполнить поле отчество")
    public ClientSteps fillMiddleName(String middleName) {
        return this;
    }

    @Step("Нажать на кнопку удалить клиента")
    public ClientSteps clickDeleteClient() {
        return this;
    }

    /**
     * Нажать на кнопку удалить.
     */
    @Step("Подтвердить удаление")
    public ClientSteps applyDeletion() {
        clickOk();
        return this;
    }
}
