package steps;

import com.nick318.domain.Client;

public class ClientSteps {
    /**
     * Открыть страницу клиентов.
     * @return this;
     */
    public static ClientSteps openClientPage() {
        ClientSteps clientSteps = new ClientSteps();
        clientSteps.clickOnShowAllClients();
        return clientSteps;
    }

    /**
     * Нажать на кнопку посмотреть всех клиентов.
     */
    public void clickOnShowAllClients() {

    }

    public ClientSteps clickAddClient() {
        return this;
    }

    public ClientSteps fillFirstName(String firstName) {
        return this;
    }

    public ClientSteps fillLastName(String lastName) {
        return this;
    }

    public ClientSteps fillPhone(String phone) {
        return this;
    }

    public void clickOk() {

    }

    /**
     * Добавить клиентов.
     * @param client тестовые данные для клиента
     * @return this;
     */
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

    public ClientSteps chooseClientInTable() {
        return this;
    }

    public ClientSteps clickEditClient() {
        return this;
    }

    public ClientSteps fillMiddleName(String middleName) {
        return this;
    }

    public ClientSteps clickDeleteClient() {
        return this;
    }

    /**
     * Нажать на кнопку удалить.
     */
    public ClientSteps applyDeletion() {
        clickOk();
        return this;
    }
}
