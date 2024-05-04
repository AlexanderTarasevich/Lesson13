package TMS.TaskStar;

public class Main1 {
    public static void main(String[] args) {
        try {
            throw new OutOfMemoryError(); // Имитация ошибки, приводящей к завершению работы JVM
        } catch (Throwable e) {
            System.out.println("Перехвачено в catch");
            throw e; // Повторное выбрасывание перехваченного исключения
        } finally {
            System.out.println("Привет из блока finally"); // Этот блок может не выполниться, если JVM аварийно завершит работу
        }
    }
}

