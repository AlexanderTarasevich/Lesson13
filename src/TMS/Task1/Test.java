package TMS.Task1;

public class Test {
    public static void main(String[] args) {
        String login = "User123";
        String password = "pass1111";
        String confirmPassword = "pass1111";

        try {
            boolean result = Credentials.validateCredentials(login, password, confirmPassword);
            System.out.println("Результат валидации: " + result);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка в логине: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка в пароле: " + e.getMessage());
        }
    }
}
