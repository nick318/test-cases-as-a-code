package steps;

import io.qameta.allure.Step;

public class ClientAssert {
    @Step("Новый клиент должен быть отображен в таблице")
    public static void newClientShouldBeVisibleInTable() {

    }

    public static ErrorPopup errorPopup() {
        return new ErrorPopup();
    }

    @Step("Должно быть показано сообщение с ошибкой {text}")
    public static ErrorPopup errorPopupWithText(String text) {
        return new ErrorPopup();
    }

    /**
     * Измененные поля обновлены и отображаются в таблице.
     */
    @Step("Измененные поля обновлены и отображаются в таблице.")
    public static void clientShouldHaveUpdatedFields() {

    }

    /**
     * Имя -> firstName<p></p>
     * Фамилия -> lastName<p></p>
     * Отчество -> middleName<p></p>
     * Телефон -> phone<p></p>
     */
    @Step("Клиент замапился Имя -> firstName Фамилия -> lastName Отчество -> middleName Телефон -> phone<p></p>")
    public static void clientIsMapped() {

    }

    @Step("Клиент удален")
    public static void clientShouldBeDeleted() {

    }

    public static class ErrorPopup {
        public ErrorPopup isVisible() {
            return this;
        }
    }
}
