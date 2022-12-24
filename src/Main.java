public class Main {
    public static void main(String[] args) {

        Account sarahConor = new Account("Sarah_Conor", "жara1conor", "sara");
        try {
            if (sarahConor.isValid()) {
                System.out.println("\nЛогин и пароль аккаунта " + sarahConor.getLogin() + " прошли проверку.");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("\n" + e.getMessage());
        }

        Account duncanMcLoud = new Account("Duncan_McL0ud", "pas123word", "pas123word");
        try {
            if (duncanMcLoud.isValid()) {
                System.out.println("\nЛогин и пароль аккаунта " + duncanMcLoud.getLogin() + " прошли проверку.");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("\n" + e.getMessage());
        }
    }
}