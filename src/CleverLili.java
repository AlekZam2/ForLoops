import java.util.Scanner;

public class CleverLili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int savedMoney = 0;
        int toysCount = 0;
        int moneyPerYear = 10;
        int evenCount = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 == 0) {
                savedMoney = savedMoney + moneyPerYear;
                moneyPerYear += 10;
                evenCount++;
            } else {
                toysCount++;
            }
        }
        int moneyFromToys = toysCount * toyPrice;
        int money = moneyFromToys + savedMoney - evenCount;

        if (money >= washingMachinePrice) {
            double price = money - washingMachinePrice;
            System.out.printf("Yes %.2f ", price);
        } else {
            double price = washingMachinePrice - money;
            System.out.printf("No %.2f ", price);
        }


    }
}
