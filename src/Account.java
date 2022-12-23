public class Account {

    public static boolean isChecked(String string) {
        return string != null && !string.isEmpty() && !string.isBlank() && string.length() <= 20
                && string.matches("\\w+");
    }

    private final String login;
    private String password, confirmPassword;


    public Account(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (isChecked(login)) {
            this.login = login;
        } else {
            throw new WrongLoginException("Логин содержит запрещённые символы.");
        }
        if (isChecked(password)) {
            if (confirmPassword.equals(password)) {
                this.password = password;
                this.confirmPassword = confirmPassword;
            } else {
                throw new WrongPasswordException("Пароль не подтверждён.");
            }
        } else {
            throw new WrongPasswordException("Пароль содержит запрещённые символы.");
        }
    }

    public final String getLogin() {
        return login;
    }

    public final String getPassword() {
        return password;
    }

    public final void setPassword(String password) {
        this.password = password;
    }

    public final String getConfirmPassword() {
        return confirmPassword;
    }

    public final void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
