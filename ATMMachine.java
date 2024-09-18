package ATMMachine;
import java.util.Scanner;
class ATM{
    float Balance;
    int [] PIN= {5674};

    public void checkPin(){
        System.out.println("Enter your pin");
        Scanner sc=new Scanner(System.in);
        int enteredPin=sc.nextInt();
        if (enteredPin==PIN[0]){
            menu();
        }
        else{
            System.out.println("Enter the valid pin");
            checkPin();
        }

    }
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Change Pin");
        System.out.println("5. Exit ");

        Scanner sc =new Scanner(System.in);
        int opt=sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawMoney();
        }else if(opt == 3){
            depositeMoney();
        }else if(opt == 4){
            changePin();
        }else if(opt == 5) {
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }

    }

    public void checkBalance(){
        System.out.println("Balance: "+Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();

        if(amount>Balance){
            System.out.println("insufficient Balance.");
        }
        else{
            Balance-=amount;
            System.out.println("Money Withdraw successful");

        }
        menu();

    }
    public void depositeMoney(){
        System.out.println("Enter the Amount");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        Balance+=amount;
        System.out.println("Money Deposited Successfully");
        menu();

    }
    public void changePin(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your old Pin: ");
        int op=sc.nextInt();
        if(op==PIN[0]){
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the new pin: ");
            int np=s.nextInt();
            PIN[0]=np;
            menu();
        }
        else{
            System.out.println("Enter the valid PIN: ");
            changePin();
        }
    }

}
public class ATMMachine {
    public static void main(String[] args) {
        ATM obj=new ATM();
        obj.checkPin();
    }
}
