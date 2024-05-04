package TMS.Task1;

public class Credentials {


    public static boolean validateCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!isLoginValid(login)) {
            throw new WrongLoginException("Логин неверный. Он должен быть меньше 20 символов и не содержать пробелы.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("повроверочный пароль не совпадает!");
        }
        if (!isPasswordValid(password, confirmPassword)) {
            throw new WrongPasswordException("Пароль неверный. Он должен быть меньше 20 символов, не содержать пробелов и содержать хотя бы одну цифру.");
        }

        return true;
    }

    private static boolean isLoginValid(String login) {
        return login.length() < 20 && !login.contains(" ");
    }

    private static boolean isPasswordValid(String password, String confirmPassword) {
        return password.length() < 20 && !password.contains(" ") && password.equals(confirmPassword) && password.matches(".*\\d.*");
    }


}
