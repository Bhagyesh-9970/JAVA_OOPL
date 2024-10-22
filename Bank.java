import java.util.Scanner;
public class bank {
    private long acc;
    private String name;
    private long mobile;
    private long balance=50000;
    Scanner sc = new Scanner(System.in);
    public void add_acc(){
        System.out.println("Enter the Name:");
        name=sc.next();
        System.out.println("Enter the account number:");
        acc=sc.nextLong();
        System.out.println("Enter the mobile number:");
        mobile=sc.nextLong();
    }
    public void withdraw(){
        System.out.println("Withdrawal of Money");
        System.out.println("Enter your account number:");
        acc=sc.nextLong();
        System.out.println("Enter the ammount you want to withdraw:");
        long ammount=sc.nextLong();
        if(balance>=ammount){
            balance=balance-ammount;
            System.out.println("your ammount has been withdraw");
            System.out.println("Available balance:"+balance);
        }
        else{
            System.out.println("Money not efficient");
        }
    }
    public void deposit(){
        System.out.println("Deposition of money");
        System.out.println("Enter the money you want to deposit:");
        long deposit=sc.nextLong();
        balance=balance+deposit;
        System.out.println("your money has been deposited,Thank you!!");
        System.out.println("Available balance:"+balance);
    }
    public void remove(){
        System.out.println("Removal of account");
        System.out.println("Enter your mobile number:");
        mobile=sc.nextLong();
        System.out.println("Your account has been removed,Get lost!!");
    }
    public static void main(String[] args) {
            bank call=new bank();
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter choice :");
            int choice= s1.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Adding of Account");
                    call.add_acc();
                    break;

                case 2:
                    call.deposit();
                    break;
                case 3:
                    call.withdraw();
                case 4:
                    call.remove();
            }

        }
}
