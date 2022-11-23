import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        int accountbalance = 1000;

            System.out.println("How much would you like to withdraw");
            Scanner scanner = new Scanner(System.in);
            int withdraw = scanner.nextInt();
            accountbalance = accountbalance - withdraw;

            if (withdraw > 1000) {
                System.out.println("You do not have enough money in your account, please amend the amount");
            } else {
                System.out.println("Amount withdrawn $" + withdraw + ", Balance after the transaction $" + accountbalance );
            }
    }
}




