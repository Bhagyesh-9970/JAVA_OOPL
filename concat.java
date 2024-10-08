public class Concat {
    public String concat1(String a, String b) {
        return a + b;
    }
    public String concat1(String a, String b, String c) {
        return a + b + c;
    }
    public String concat1(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Concat sc = new Concat();
        String twoConcat = sc.concat1("Hello, ", "world!");
        String threeConcat = sc.concat1("Java ", "is ", "fun!");
        String[] arrayConcat = {"This ", "is ", "an ", "array ", "of ", "strings."};
        System.out.println(twoConcat);
        System.out.println(threeConcat);
        System.out.println(sc.concat1(arrayConcat));
    }
}