package TMS.TaskStar;

/**
 * Второй способ-это вызвоть метод,который останавливает выполнение JVM
 */
public class Main2 {
    public static void main(String[] args) {
        try {
            System.out.println("Привет из блока try");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Привет из блока catch");
        } finally {
            System.out.println("Привет из блока finally");
        }
    }
}

