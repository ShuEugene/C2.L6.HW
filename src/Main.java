public class Main {
    public static void main(String[] args) {

        try {
            Account account = new Account("Sara_Conor", "жara1conor", "sara");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("\n" + e.getMessage());
        }

    }
}