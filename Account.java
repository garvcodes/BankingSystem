import java.util.Scanner;

 class BankDetails {



    public double accountNumber;
    public String name;
    public String accountType;
    public int balance = 0;
    Scanner sc = new Scanner(System.in);



    public void openAccount(){
        double accountNumber =((int)((Math.random()*10000000)));
        int wholeaccountNumber=(int)accountNumber;
        
        System.out.println("What type of account would you like to create today? Checking or Savings?");
        String accountType = sc.nextLine();
        System.out.println("Your name:");
        String name = sc.nextLine();
        System.out.println("Welcome to DBS Bank " + name);
        System.out.println("Account successfully created. Here is your account number:  " + wholeaccountNumber);
        System.out.println("Your initial balance is 0");
      
  

    }

    public void displayDetails(){

        System.out.println(this.name + this.accountNumber + this.balance + this.accountType);

    }

    public void deposit(){
        
        System.out.println("How much would you like to deposit?:  ");
        int amount = sc.nextInt();
        balance = balance + amount;
        System.out.println("Your new balance is:  " + balance);
        
    }

    public void witdraw(){
        
        System.out.println("How much would you like to withdraw?:  ");
        int amount = sc.nextInt();
        if(amount>balance){

        }

        balance = balance - amount;
        System.out.println("Your new balance is:  " + balance);
        
    }

}



public class Account {

   

    public static void main(String[] args) {
       BankDetails b1 = new BankDetails();
       b1.openAccount();
       b1.deposit();
       b1.witdraw();

       b1.displayDetails();

       BankDetails b2 = new BankDetails();
       b2.openAccount();
       b2.deposit();

        b2.displayDetails();



    }
}






