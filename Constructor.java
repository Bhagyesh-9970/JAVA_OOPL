import java.util.Scanner;
public class Constructor{
    int a,b,sum;
    Constructor()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sc.nextInt();
        System.out.println("Enter the second number:");
        b=sc.nextInt();
        sc.close();
    }
    void add(){
        sum=a+b;
    }
    void display(){
        System.out.println("The sum of two numbers is:"+sum);
    }
    public static void main(String[]args)
    {
        Constructor object=new Constructor();
        object.add();
        object.display();
    }
}