package Lect4;

public class Library{
    // feild
    String address;
    Book books[];
    int bookCount;
    int initialBookNumber;
    static String beginTime = "9am";
    static String endTime = "5pm";

    // methods
    public Library(String libraryAddress){
        this.address = libraryAddress;
        this.initialBookNumber = 10;
        this.bookCount = 0;
        this.books = new Book[initialBookNumber];
    }

    public void checkBookNumber(int addition){
        if(bookCount + addition >= books.length){
            Book[] oldBooks = this.books;
            Book[] newBooks = new Book[(oldBooks.length + addition) * 2];
            System.arraycopy(oldBooks, 0, newBooks, 0, oldBooks.length);
            this.books = newBooks;
        }
    }
    public void addBook(Book newBook){
        checkBookNumber(1);
        books[bookCount] = newBook;
        bookCount += 1;
    }

    public static void printOpeningHours(){
        System.out.println("Libraried are open daily from " + beginTime + " to " + endTime);
    }

    public void printAddress(){
        System.out.println(address);
    }

    public void borrowBook(String bookName){
        int flag = 0;
        for(int i = 0; i < bookCount; i++) {
            if(books[i].title == bookName){
                flag = 1;
                if(books[i].isBorrowed() == false){
                    System.out.println("You successfully borrowed " + bookName);
                    books[i].borrowed = true;
                    return;
                }
            }
        }
        if(flag == 1){
            System.out.println("Sorry, this book is already borrowed.");
        }
        else {
            System.out.println("Sorry, this book is not in our catalog.");
        }
        
    }

    public void printAvailableBooks(){
        int count = 0;
        for(int i = 0; i < bookCount; i++) {
            if(books[i].isBorrowed() == false) {
                count++;
                System.out.println(books[i].title);
            }
        }
        if(count == 0){
            System.out.println("No book in catalog.");
        }
    }

    public void returnBook(String returnedTitle){
        for(int i = 0; i < bookCount; i++) {
            if(books[i].title == returnedTitle && books[i].isBorrowed() == true) {
                books[i].borrowed = false;
                System.out.println("You successfully returned " + returnedTitle);  
                return;              
            }
        }
        System.out.println("error: this book doesn't belong to this labrary!");
    }


    public static void main(String[] args) { 
    // Create two libraries
    Library firstLibrary = new Library("10 Main St.");
    Library secondLibrary = new Library("228 Liberty St."); 

    // Add four books to the first library 
    firstLibrary.addBook(new Book("The Da Vinci Code")); 
    firstLibrary.addBook(new Book("Le Petit Prince")); 
    firstLibrary.addBook(new Book("A Tale of Two Cities")); 
    firstLibrary.addBook(new Book("The Lord of the Rings")); 

    // Print opening hours and the addresses 
    System.out.println("Library hours:"); 
    printOpeningHours(); 
    System.out.println(); 
    System.out.println("Library addresses:"); 
    firstLibrary.printAddress(); 
    secondLibrary.printAddress(); 
    System.out.println(); 

    // Try to borrow The Lords of the Rings from both libraries 
    System.out.println("Borrowing The Lord of the Rings:"); 
    firstLibrary.borrowBook("The Lord of the Rings"); 
    firstLibrary.borrowBook("The Lord of the Rings"); 
    secondLibrary.borrowBook("The Lord of the Rings"); 
    System.out.println(); 

    // Print the titles of all available books from both libraries 
    System.out.println("Books available in the first library:"); 
    firstLibrary.printAvailableBooks(); 
    System.out.println(); 
    System.out.println("Books available in the second library:"); 
    secondLibrary.printAvailableBooks(); 
    System.out.println(); 

    // Return The Lords of the Rings to the first library 
    System.out.println("Returning The Lord of the Rings:"); 
    firstLibrary.returnBook("The Lord of the Rings"); 
    System.out.println(); 

    // Print the titles of available from the first library 
    System.out.println("Books available in the first library:"); 
    firstLibrary.printAvailableBooks(); 
    } 

}