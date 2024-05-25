package PCQs_25_5_24;
import java.util.ArrayList;

// ques5
/*Write a Java program to create a class called "Book" 
with attributes for title, author, and ISBN, and 
methods to add and remove books from a collection. */


class Book {
  private String title;
  private String author;
  private String ISBN;
  private static ArrayList < Book > bookCollection = new ArrayList < Book > ();

  public Book(String title, String author, String ISBN) {
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public static void addBook(Book book) {
    bookCollection.add(book);
  }

  public static void removeBook(Book book) {
    bookCollection.remove(book);
  }

  public static ArrayList < Book > getBookCollection() {
    return bookCollection;
  }
}

public class Ques5 {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert c Martin (Uncle Bob)", "9780131101630");
        Book book2 = new Book("An Introduction to Python", "Guido van Rossum", "9355423489");
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList < Book > bookCollection = Book.getBookCollection();
        System.out.println("List of books:");
        for (Book book: bookCollection) {
          System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
        Book.removeBook(book1);
        System.out.println("\nAfter removing " + book1.getTitle() + ":");
        System.out.println("List of books:");
        for (Book book: bookCollection) {
          System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
      }
}
