import java.util.Scanner;

class items{
    String bookname;
    String Dvds;
}
class specific extends items{
    String Author="Bhagyesh";
    int price=456;
    String publishedby="Ezra";
    int num=34;
}
public class Assignment4 {
    public static void main(String[] args) {
        specific l1=new specific();
        System.out.println("The Name of the book is:"+l1.bookname);
        System.out.println("The Author of the book is :"+ l1.Author);
        System.out.println("The price of the book is :"+l1.price);
        System.out.println("The Name of the dvd is:"+l1.Dvds);
        System.out.println("The Dvd is published by :"+l1.publishedby);
        System.out.println("The number of the dvd is :"+l1.num);
    }
}