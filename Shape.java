import java.util.Scanner;

public class shape {
    public double area(int r){
        return 3.14*r*r;
    }
    public int area(int l,int w){
        return (l*w);
    }
    public double area(double s){
        return (s*s);
    }
    public double peri(double s){
        return 4*s;
    }
    public int peri(int l,int w){
        return (2*l)+(2*w);
    }
    public double peri(int s1,int s2,int s3){
        return s1+s2+s3;
    }
    public static void main(String[]args){
        shape s1= new shape();
        System.out.println("The area of Square is:"+s1.area(9.8));
        System.out.println("The area of circle is:"+s1.area(8));
        System.out.println("The area of Rectangle is:"+s1.area(4, 8));
        System.out.println("The Perimeter of Rectangle is:"+s1.peri(4, 8));
        System.out.println("The Perimeter of Square is:"+s1.peri(9.8));
        System.out.println("The Perimeter of Triangle is:"+s1.peri(2,3,4));
    }
}
