import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму пополнения");
        int input = in.nextInt();
        int usersAccount = 100;
        int bonus = input / 100 * 3;
        int increasedBonus = input / 100 * 6;
        int maximumBonus = input / 100 * 12;
        int commis = input / 100 * 1;

        if (input <= 0) {
            System.out.println("Не верная сумма пополнения! Введите верную сумму!");
        }
        if (input > 0 && input < 100) {
            System.out.println("Минимальная сумма пополнения 100 рублей!");
        }
        if (input >= 100 && input <= 1000) {
            System.out.println("Спасибо за пополнения счета!");
            System.out.println("Сумма на счете: " + (input + usersAccount - commis));
            System.out.println("Сумма бонусов: " + (0) + " руб.");
            System.out.println("Комиссия составит: " + (commis) + " руб.");
            System.out.println("Будем рады видеть вас снова!");
        }
        if (input > 1000 && input <= 2000) {
            System.out.println("Спасибо за пополнения счета!");
            System.out.println("Сумма на счете: " + (input + bonus + usersAccount - commis));
            System.out.println("Сумма бонусов: " + (bonus) + " руб.");
            System.out.println("Комиссия составит: " + (commis) + " руб.");
            System.out.println("Будем рады видеть вас снова!");
        }
        if (input > 2000 && input <= 5000) {
            System.out.println("Спасибо за пополнения счета!");
            System.out.println("Сумма на счете: " + (input + increasedBonus + usersAccount - commis));
            System.out.println("Сумма бонусов: " + (increasedBonus) + " руб.");
            System.out.println("Комиссия составит: " + (commis) + " руб.");
            System.out.println("Будем рады видеть вас снова!");
        }
        if (input > 5000 && input <= 10000) {
            System.out.println("Спасибо за пополнения счета!");
            System.out.println("Сумма на счете: " + (input + maximumBonus + usersAccount - commis));
            System.out.println("Сумма бонусов: " + (maximumBonus) + " руб.");
            System.out.println("Комиссия составит: " + (commis) + " руб.");
            System.out.println("Будем рады видеть вас снова!");
        }
        if (input > 10000) {
            System.out.println("Превышен лимит пополнения");
        }
    }
}