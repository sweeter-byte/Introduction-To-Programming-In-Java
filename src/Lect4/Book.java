package Lect4;

public class Book{
    String title;
    boolean borrowed;

    public Book(String bookTitle){
        title = bookTitle;
        borrowed = false;
    }

    public void borrowed(){
        borrowed = true;
    }

    public void returned(){
        borrowed = false;
    }

    public boolean isBorrowed(){
        return borrowed;
    }

    public String getTitle(){
        return title;
    }

    public void rented(){
        borrowed = true;
    }

    public static void main(String[] args){
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title: " + example.getTitle());
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.rented();
        System.out.println("Borrowed?: " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed?: " + example.isBorrowed());
    }
}