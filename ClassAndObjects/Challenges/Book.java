package ClassAndObjects.Challenges;

class Book {

    static int totalNoOFBooks;

    String title;

    String author;

    String isbn;

    boolean isBorrowed;

    static { // Object Init 
        totalNoOFBooks = 0;
    }
    {
        totalNoOFBooks++;
    }

    Book(String isbn, String title, String author){   //Constructor
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
        
    }
    static int getTotalNoOfBooks(){
        return totalNoOFBooks;

    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already Borrowed ");
        }else{
             this.isBorrowed = true;
             System.out.println("Enjoy the Book ");

        }
    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope you enjoy the Book");
        }else{
            System.out.println("This Book is already in Libreary");
        } 
    }
    public static void main(String[] args) {
        Book desgineOfThings = new Book("01","Desgine","Navneet");
                Book OfLaws48 = new Book("02","Laws","Krip");
                        Book LawOfPower = new Book("03","Power","Shivam");

                        Book myBook = new Book("01");

                        System.out.println(Book.getTotalNoOfBooks());

                       
                        myBook.borrowBook();

    }

}