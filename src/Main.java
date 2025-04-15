//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int usersAccount = 100;
        int amount = 999;
        int count = amount / 100;

        if (amount >= 1000) {
            System.out.println(count + usersAccount + amount);
        }
        else {
            System.out.println(usersAccount + amount);
        }


    }
}