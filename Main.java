import java.util.Scanner;
public class Main {
    static void display()

    {
        int age;
        String name;
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the age:");
        age=object.nextInt();
        System.out.println("Enter the name:");
        name=object.next();
        System.out.println("the age and the name of the person is:"+age+name);
    }
    public static void main(String[]args){
       display();
    }
}