import java.util.Scanner;
import java.util.function.Function;

class Actions {
    public void deposit(double balance) {
        System.out.println("Your amount deposited successfully!");
    }

    public void withdraw(double amt) {
        System.out.println("Your amount Withdrawn successfully!");
    }

}

class ATM_interface {
     public static void main(String[] args) {

        Actions act = new Actions();
        double balance = 0;
        double amt = 0;
        while (true) {
            System.out.println("Choose the action to be performed:");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.CheckBalance");
            System.out.println("4.Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to be Deposited:");
                    Scanner dposit = new Scanner(System.in);
                    double depositamt = dposit.nextInt();
                    amt += balance + depositamt;
                    act.deposit(balance);
                    break;

                case 2:
                    System.out.println("Enter amount to be WithDrawn:");
                    Scanner dposit1 = new Scanner(System.in);
                    double withdrawnamt = dposit1.nextInt();
                    if (withdrawnamt <= amt) {
                        amt = amt - withdrawnamt;
                        act.withdraw(amt);

                    } else {
                        System.out.println("Enter a valid amount.Withdrawn unsucceesssful");
                    }
                    break;

                case 3:
                    System.out.println("Your Balance is Rs." + amt + " only!");
                    break;

                case 4:
                    System.out.println("Thank You For using our Service!!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
            if (choice == 4) {
                break;
            }
        }
    }
}