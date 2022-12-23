public class Account {

    public static boolean checkFailed(String string) {
        return string == null || string.isEmpty() || string.isBlank() || string.length() > 20
                || !string.matches("\\w+");
    }

    private final String login;
    private String password, confirmPassword;


    public Account(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


    public boolean isValid() throws WrongLoginException, WrongPasswordException {
        if (checkFailed(login)) {
            throw new WrongLoginException("Логин аккаунта «" + getLogin() + "» содержит запрещённые символы.");
        }
        if (checkFailed(password)) {
            throw new WrongPasswordException("Пароль аккаунта «" + getLogin() + "» содержит запрещённые символы.");
        } else {
            if (!confirmPassword.equals(password)) {
                throw new WrongPasswordException("Пароль аккаунта «" + getLogin() + "» не подтверждён.");
            }
        }
        return true;
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
