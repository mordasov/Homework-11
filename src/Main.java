import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //task-1
        checkLeapYear(2000);

        //task-2
        checkTypeReleaseOS(1, 2023);

        //task-3
        int deliveryDistance = 95;
        System.out.printf("Расстояние %d км. ", deliveryDistance);
        int dayDelivery = calculateDayDelivery(deliveryDistance);
        printResult(dayDelivery);
    }

    //метод сообщает является ли год высокосным
    public static void checkLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год  - високосный год.\n");
        } else {
            System.out.println(year + " год  - невисокосный год.\n");
        }
    }

    //метод сообщает какую версию (обычную/облегченную) и для какой OS(iOS/Android) установить
    public static void checkTypeReleaseOS(int typeOS, int year) {

        int currentYear = LocalDate.now().getYear();
        if (typeOS < 0 || typeOS > 1) {
            System.out.println("Система не распознала вашу OS");
            return;
        }
        if (typeOS == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if (typeOS == 0) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке\n");
        } else if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке\n");
        }
    }

    //метод вычисляет кол-во дней для доставки по расстоянию
    public static int calculateDayDelivery(int distance) {

        if (distance <= 20) return 1;
        else if (distance <= 60) return 2;
        else if (distance <= 100) return 3;
        else return -1;
    }

    //метод выводит на консоль требуемое количество дней для доставки
    public static void printResult(int day) {

        if (day >= 0) {
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }
}