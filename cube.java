import java.util.Scanner;
public class cube {
    public static void main(String[]args){
        int x,cube;
        Scanner object=new Scanner(System.in);
        System.out.println("Enter the number:");
        x=object.nextInt();
        cube=x*(x*x);
        System.out.println("the cube of the number is:"+cube);
    }
}
