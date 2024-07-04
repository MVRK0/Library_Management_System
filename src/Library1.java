import java.util.*;

public class Library1 {
    private boolean availabity = true;
    private Vector<String> library= new Vector<>();
    //method to add book to the library using a book object
    public void addBook(Book book){
        library.add(book.getTitle());
        System.out.println(book.getTitle() + " has been added to the library");
    }
    //method to remove a book from the library
    public void removeBook(Book book){
        library.remove(book.getTitle());
        System.out.println(book.getTitle() + " has been removed from the library");
    }
    //method to check for the availability of a book
    public void isAvailable(String Title){
        for (int i = 0; i < library.size(); i++) {
            if(library.contains(Title)){
                availabity = true;
                System.out.println(Title + " is available.");
                break;
            }else{
                availabity = false;
                System.out.println("the book is not available.");
                break;
            }
        }
    }
    //method to display all books in the library
    public void displayBooks(){
        for (String i : library) {
            System.out.println(i + " is in the library");
        }
    }
    public void borrowBook(String Title){
        for (int i = 0; i < library.size(); i++) {
            if(library.contains(Title)){
                System.out.println("the book has been borrowed successfully");
                library.remove(i);
                availabity = false;
                break;
            }else{
                System.out.println(Title + " is not available for borrowing");
                break;
            }
        }
    }
    public void borrowBookByISBN(String ISBN) {


        for (int i = 0; i < library.size(); i++) {
            if (library.contains(ISBN)) {
                System.out.println("the book has been borrowed successfully");
                library.remove(i);
                availabity = false;
                break;
            } else {
                System.out.println(ISBN + " is not available for borrowing");
                break;
            }
        }
    }
    public void returnBook(String Title){
        availabity = false;
        System.out.println(Title + " has been returned and is now available for borrowing.");
        library.add(Title);
        availabity = true;
    }
    public void searchBook(Book book){
        for (int i = 0; i < library.size(); i++) {
            if(library.contains(book.getTitle())){
                System.out.println(book.getTitle() + " is in the library");
                break;
            }
        }
    }
    public Book searchBook(String search, Book book){
        for (int i = 0; i < library.size(); i++) {
            if(library.contains(search)){
                return book;
            }
        }return null;
    }
}