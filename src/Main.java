import java.time.LocalDate;

public class Main {
    public static void leapYear(double yearHW3) {
        if (yearHW3 / 4 % 1 == 0 && yearHW3 % 100 != 0 || yearHW3 % 400 == 0) {
            System.out.println(yearHW3 + " год высокосный");
        } else
            System.out.println(yearHW3 + " не высокосный");

    }

    public static void userMobile(int osUser, int year) {
        int currentYear = LocalDate.now().getYear();
        if (osUser == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osUser == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osUser == 1 && year == currentYear) {
            System.out.println("Установите версию приложения для android по ссылке");
        } else if (osUser == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else System.out.println("Некорретные данные");
    }

    public static void delivery(int deliveryDistance, int startInterval, int deliveryDays, int interval) {
        if (deliveryDistance <= startInterval) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        System.out.println("Дней на доставку "+deliveryDays);
    }
    public static void main(String[] args) {
        System.out.println("Задание 1");
        double yearHW3 = 2024;
        leapYear(yearHW3);

        System.out.println("Задание 2");
        userMobile(1, 2022);

        System.out.println("Задание 4");
        delivery(95,1,20,40);
    }
}