import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        person object1 = new person();
        person object2 = new person();
        object1.accept();
        object1.display();
        object2.accept();
        object2.display();
    }
}
    class person{
        Scanner sc = new Scanner(System.in);
        String name;
        int basic;
        double hra, ta, tax, total, gross;
        int age;

        void accept() {
            System.out.println("Enter the name of the person:");
            name = sc.next();
            System.out.println("Enter the age of the person:");
            age = sc.nextInt();
            System.out.println("Enter the basic salary:");
            basic = sc.nextInt();
            hra = (0.05 * basic);
            ta = 0.1 * basic;
            total = basic + hra + ta;
            tax = 0.02 * total;
            gross = total - tax;
        }


    void display() {
        System.out.println("The name and age of the person are:" +name +age);
        System.out.println("The basic salary of the person is:" +basic);
        System.out.println("The hra is:" +hra);
        System.out.println("the da is:" +ta);
        System.out.println("The tax is:" +tax);
        System.out.println("The total salary of the person after tax and hra,ta:" +gross);
    }
}