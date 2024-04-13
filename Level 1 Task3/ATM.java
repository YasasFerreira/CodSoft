import java.util.Scanner;

public class ATM {

    
    public int acc_no;
    public int balance;
    
    public ATM(int acc_no,int balance){
        this.acc_no = acc_no;
        this.balance = balance;
        
    }
    
    public int getBalance(){
        return balance;
    }
    
    public int getAccNo(){
        return acc_no;
    }
    
    public int Deposit(int amount){
        System.out.println("Successful!!");
        balance = getBalance()+amount;
        System.out.println("Your balance amount is "+balance);
        return balance;
    }
    
    public void checkbalance(){
        System.out.println("Account No : "+getAccNo());
        System.out.println("Your account balance is "+getBalance());
    }
    
    public int withdraw(int amount){
        balance = getBalance()-amount;
        System.out.println("Your balance amount is "+balance);
        return balance;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("\nEnter your account No : " );
        int accNo = sc.nextInt();
        int bal = 1000;//set default account balance as 1000
        int amount = 0;
        int sel = 1;
        
        ATM atm = new ATM(accNo,bal);
        
        while(sel == 1){
            System.out.println("\n\nPlease press the number"
                    + "\n\nPress 1 for check the balance"
                    + "\nPress 2 for deposit"
                    + "\nPress 3 for Withdraw");
        
            int fun = sc.nextInt();
        
             switch (fun){
                case 1:
                    atm.checkbalance();
                    break;
                case 2:
                    System.out.print("Enter the amount : ");
                    amount =sc.nextInt();
                    atm.Deposit(amount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount : ");
                    amount = sc.nextInt();
                    atm.withdraw(amount);
                    break;
                default:
                    System.out.println("Invalid!!");
                    break;
            }
            System.out.println("\n\nDo you need another service"
                + "\n (1) YES"
                + "\n (2) NO");
        
            sel = sc.nextInt();
        }
        
        
        
        
    }
   
}
