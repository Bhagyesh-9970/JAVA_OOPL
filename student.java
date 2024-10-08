import java.util.Scanner;

class person{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    void person(){
        System.out.println("The Name of the Student is:");
        name=sc.next();
        System.out.println("The age of the Student is:");
        age=sc.nextInt();
    }
}
class info extends person{
    int id;
    void person(){
        super.person();
        System.out.println("The id of the Student is:");
        id=sc.nextInt();
    }
}
public class student {
    public static void main(String[] args) {
        info l1=new info();
        l1.person();
    }
}
