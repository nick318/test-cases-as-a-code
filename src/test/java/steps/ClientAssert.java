package steps;

import javax.swing.*;

public class ClientAssert {
    public static void newClientShouldBeVisibleInTable() {

    }

    public static ErrorPopup errorPopup() {
        return new ErrorPopup();
    }

    public static ErrorPopup errorPopupWithText(String text) {
        return new ErrorPopup();
    }

    /**
     * Измененные поля обновлены и отображаются в таблице.
     */
    public static void clientShouldHaveUpdatedFields() {

    }

    /**
     * Имя -> firstName<p></p>
     * Фамилия -> lastName<p></p>
     * Отчество -> middleName<p></p>
     * Телефон -> phone<p></p>
     */
    public static void clientIsMapped() {

    }

    public static void clientShouldBeDeleted() {

    }

    public static class ErrorPopup {
        public ErrorPopup isVisible() {
            return this;
        }
    }
}
