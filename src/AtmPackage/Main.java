package AtmPackage;

public class Main {

    public static void main(String[] args) {




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




    }
}