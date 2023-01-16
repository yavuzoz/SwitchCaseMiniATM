package switchcase.mini.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //yavuz özbay : IBAN CH1234 000 000
        //halide edip : IBAN CH1235 000 000

        /* bank account to view :1,
           to get money : 2,
           to deposit money:3,
           to exit the application : 4
           yavuz accounts username and password : yavuz12, 123,
           halide accounts username and password : halide12, 321
         */
        Scanner scanner = new Scanner(System.in);

        String accountOptions = "balance to view --> 1"
                + "to get money --> 2"
                +"different deposit to money--->3 "
                + "to exit the application --> q";

        double halideBalance = 2455;
        String halideIBAN = "CH1235 000 000";
        String halideUsername = "halide12";
        String halidePassword = "321";

        double yavuzBalance = 1300;
        String yavuzIBAN = "CH1234 000 000";
        String yavuzUsername = "yavuz12";
        String yavuzPassword = "123";

        System.out.print("Username : ");
        String userName = scanner.nextLine();

        System.out.print("Password : ");
        String userPassword = scanner.nextLine();

        if(userName.equals("halide12")&& userPassword.equals("321")){
            System.out.println("Halide's account has been logged in...");
            System.out.println(accountOptions);

            System.out.println("please choice a selection");
            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    System.out.println("your balance : "+ halideBalance);
                    break;
                case "2":
                    System.out.print("Enter the amount you want to withdraw:  ");
                    int amountWithdrawn = scanner.nextInt();
                    if(halideBalance>=amountWithdrawn){
                        halideBalance -= amountWithdrawn;
                        System.out.println("remaining amount :  "+ halideBalance);
                    }else {
                        System.out.println("You cannot withdraw large amounts of money from your balance !!");
                    }
                    break;
                case "3":
                    System.out.println("how much money do you want to deposit? ");
                    int amountToDeposited= scanner.nextInt();
                    if(amountToDeposited<= halideBalance ){
                        System.out.println("enter IBAN number: ");
                        String transferIBAN = scanner.nextLine();
                        if(transferIBAN.equals(yavuzIBAN))
                        {
                            System.out.println("money transfered to halide bank account..");
                            halideBalance -= amountToDeposited;
                            yavuzBalance += amountToDeposited;
                        }
                    }
                    break;
            }
        }
        else if(userName.equals("yavuz12")&& userPassword.equals("123")){
            System.out.println("yavuz's account has been logged in...");

            System.out.println(accountOptions);
            System.out.println("please choice a selection");
        }else{
            System.out.println("surname or password not correct!! ");
        }

    }
}
