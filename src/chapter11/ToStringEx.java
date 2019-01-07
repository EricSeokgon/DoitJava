package chapter11;

class Book {
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book1 = new Book(200, "개미");

        System.out.println(book1);
        System.out.println(book1.toString());
    }
}
