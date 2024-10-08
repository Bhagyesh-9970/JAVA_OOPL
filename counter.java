public class counter {
    static int count=0;
    public counter(){
        count++;
    }
    public static int getcount(){
        return count;
    }
    public static void main(String[]bhagyesh){
        counter obj1=new counter();
        counter obj2=new counter();
        counter obj3=new counter();
        counter obj4=new counter();
        counter obj5=new counter();
        System.out.println("Number of Objects:"+counter.getcount());
    }
}
