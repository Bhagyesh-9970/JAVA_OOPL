import java.util.Scanner;
class employee{
    String name;
    int id;
    int basic=100000;
    double ta;
    double da;
    double total;
    int gross;
    double bonus;
    Scanner sc = new Scanner(System.in);
    void calculate(){
        ta=(0.05*basic);
        da=(0.02*basic);
        total=basic+ta+da;
        System.out.println("The Total salary is"+total);
    }

}
class manager extends employee{
    void calculate(){
            super.calculate();
            bonus=0.03*basic;
            total=ta+da+basic+bonus;
            System.out.println("The Total salary of manager:"+total);
        }
}

public class salary {
    public static void main(String[] args){
        manager m1=new manager();
        m1.calculate();
    }
}
