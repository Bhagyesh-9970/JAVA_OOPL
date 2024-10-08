import java.util.Scanner;
public class practice{
    public static void main(String[] args){
        int a,b,sum;
        Scanner object=new Scanner(System.in);
        System.out.println("Enter the number:");
        a=object.nextInt();
        System.out.println("Enter the second number:");
        b=object.nextInt();
        sum=a+b;
        System.out.println("the sum is:"+sum);
    }
}

