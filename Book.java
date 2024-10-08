public class Book {
    public static void main(String[] args) {
        library l1 = new library();
        l1.add_book("book1", 1);
        l1.add_book("book2", 4);
        l1.remove_book("book2", 1);
        l1.display();
    }
}
class library {
    static int total_books = 0;

    void add_book(String name, int no) {
        total_books += no;
    }

    void remove_book(String name, int no) {
        total_books -= no;
    }

    void display() {
        System.out.println(total_books);
    }
}