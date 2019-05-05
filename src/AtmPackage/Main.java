package AtmPackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ATM[] atm = new ATM[10];

        initialBalance(atm);


    }


    public static void initialBalance(ATM[] acc) {

        double balance = 100.0;

        for (int i = 0; i < acc.length; i++) {

            acc[i] = new ATM(i, balance);
        }
    }

    public void showMenu() {

        System.out.print("Welcome to ATM Menu. Choose your option: " +
                "\n1. check balance" +
                "\n2. deposit" +
                "\n3. withdraw" +
                "\n4. exit");
    }

    public void switchMethod(int id, ATM[] acc, int choise) {

        switch (choise) {

            case 1:

                System.out.println("Your account balance is: " + acc[id].getBalance());

                break;

            case 2:

                Scanner s = new Scanner(System.in);

                System.out.println("How much would you like to deposit?");

                double value = s.nextDouble();

                if (value > 0) {

                    acc[id].deposit(value);

                    System.out.println("Deposit transfer completed.");
                } else {

                    System.out.println("Wrong input. Try again");
                }

                break;

            case 3:

                System.out.println("How much would you like to withdraw?");

                Scanner input = new Scanner(System.in);
                double withdraw = input.nextDouble();

                if (withdraw - acc[id].getBalance() > 0) {

                    acc[id].withdraw(withdraw);

                    System.out.println("Withdraw transfer completed.");
                    System.out.println("Your account balance is: " + acc[id].getBalance());
                } else {

                    System.out.println("Wrong input. Try again");
                }
                break;

            case 4:

                System.out.println("Thank you for using our service");

                break;

            default:

                System.out.println("Wrong input. Try again");
        }
    }
}