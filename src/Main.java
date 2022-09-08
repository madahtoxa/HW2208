import java.time.LocalDate;

public class Main {
    public static void leapYear(double yearHW3) {
        if ((yearHW3 % 4 == 0) && (yearHW3 % 100 != 0) || (yearHW3 % 400 == 0)) {
            System.out.println(yearHW3 + " год высокосный");
        } else {
            System.out.println(yearHW3 + " не высокосный");
        }

    }

    private static void userMobile(int osUser, int year) {
        int currentYear = LocalDate.now().getYear();
        if (osUser == 0 && year == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osUser == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osUser == 1 && year == currentYear) {
            System.out.println("Установите версию приложения для android по ссылке");
        } else if (osUser == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для android по ссылке");
        } else {
            System.out.println("Некорретные данные");
        }
    }

    private static void delivery(int distance) {
        int step = 40;
        int result = 1;
        if (distance >= 20) {
            result = ((distance - 20) / step) + 2;
        }
        System.out.println("Дней на доставку " + result);
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        double yearHW3 = 2004;
        leapYear(yearHW3);

        System.out.println("Задание 2");
        userMobile(1, 2022);

        System.out.println("Задание 3");
        delivery(95);
    }
}