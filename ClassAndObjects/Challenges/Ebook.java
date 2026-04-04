package ClassAndObjects.Challenges;

public class Ebook {

    static int totalNumberOfBook;
    String title;
    String isbn;
    String author;

    boolean isBorrowed;

    static{
        totalNumberOfBook = 0;

    }
    {
        totalNumberOfBook++;
    }
    Ebook(String title, String author, String isbn){
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }
    Ebook(String title){
        this(title , "unknown", "unkown");
    }

    static int getTotalNumberOfBooks(){
        return totalNumberOfBook;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already Borrowed ...! ");
        }else{
            this.isBorrowed = true;
            System.out.println("Enjoy the Book ");
        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Enjoy the Book  ");
        }else{

            System.out.println("This is already in the libreary ...!");
        }
    }
    public static void main(String[] args) {
        Ebook ebook = new Ebook("How was your day ", "Ram ", "001");
        Ebook hanted = new Ebook("I am alone ", "Navneet", "002");
        Ebook funny = new Ebook("Happy", "Ramesh ", "003");
        Ebook nope = new Ebook("Unknown");

        System.out.println(Ebook.totalNumberOfBook);

        System.out.println(Ebook.getTotalNumberOfBooks());

        hanted.borrowBook();

        funny.returnBook();

        hanted.borrowBook();
    }




}
