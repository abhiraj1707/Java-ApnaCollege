/*
What will the output of this code?
    a. Error
    b. 0 2
    c. 1 2
    d. 2 2

    Ans = b
*/

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

public class Practice_Question08 {
    public static void main(String[] args) {
        System.out.print(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.print(Book.count);
    }
}
