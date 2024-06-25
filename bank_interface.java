import java.util.Scanner;
// Define an interface for ATM operations
interface bankuser {
    void withdraw(int amount);
    void deposit(int amount);
    void transfer(int amount);
    float checkBalance();

}

// Define a class for basic ATM operations
class atm implements bankuser{
    private int balance;

    public atm(int balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: " + balance);
        } else {
            System.out.println("Deposit failed. Invalid amount.");
        }
    }
    @Override
    public void transfer(int amount){
        if (amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("your traction of money to another account is successful");
            System.out.println("remaining balance:"+balance);
        }
        else{
            System.out.println("traction failed ! insufficient balance: ");
        }
    }
    @Override
    public float checkBalance() {
        return balance;
    }
}

public class bank_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        int initialBalance = sc.nextInt();
        bankuser a = new atm(initialBalance);
        System.out.println("1 for with drawl ," +
                " 2 for deposit ," +
                "3 for check balance ," +
                "4 for transfer balance &"+
                " 5 for exit :");
        int option;
        do {
            System.out.println("enter your choice from above options :");
             option= sc.nextInt();
             int pin=2345;
             int account_no=1122334455;
            switch (option){
                case 1:
                    System.out.println("enter your withdraw amount :");
                    int withdraw= sc.nextInt();
                    System.out.println("enter your pin :");
                    int entered_pin= sc.nextInt();
                    if(entered_pin==pin){
                        a.withdraw(withdraw);
                        menu();
                    }
                    else {
                        System.out.println("invalid pin");
                    }
                    break;
                case 2:
                    System.out.println("enter your deposit amount :");
                    int deposit= sc.nextInt();
                    System.out.println("enter your pin :");
                     entered_pin= sc.nextInt();
                    if(entered_pin==pin){
                        a.deposit(deposit);
                        menu();
                    }
                    else {
                        System.out.println("invalid pin");
                    }
                    break;
                case 3:
                    System.out.println("enter your pin :");
                    entered_pin= sc.nextInt();
                    if(entered_pin==pin) {
                        System.out.println("your current balance is :" + a.checkBalance());
                        menu();
                    }else {
                        System.out.println("invalid pin :");
                    }
                    break;
                case 4:
                    System.out.println("enter transfer amount");
                    int transfer= sc.nextInt();
                    System.out.println("enter account number :");
                    int account= sc.nextInt();
                    if(account==account_no){
                        System.out.println("enter your pin :");
                        entered_pin= sc.nextInt();
                        if(entered_pin==pin){
                            a.transfer(transfer);
                            menu();
                        }
                        else {
                            System.out.println("invalid pin :");
                        }
                    }
                    else {
                        System.out.println("invalid account number :");
                    }
                    break;
                case 5:
                    System.out.println("thank you! visit again :");
                    break;
                default:
                    System.out.println("invalid option :");
                    menu();
            }
        }while (option !=5);{
            sc.close();
        }
    }
    public static void menu(){
        System.out.println("1 for with drawl ," +
                " 2 for deposit ," +
                "3 for check balance ," +
                "4 for transfer balance &"+
                " 5 for exit :");
    }
}