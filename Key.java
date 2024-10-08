public class Key {
     static int a=80;
     int b=10;
    static void StaticDisplay(){
        System.out.println(a);
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[]args){
        Key obj=new Key();
        StaticDisplay();
        obj.display();
    }
}
