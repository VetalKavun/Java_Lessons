package code.hometasks;

public class Book {
    private String nameBook;
    private String authorBook;

    public Book (String nameBook){
        this.nameBook = nameBook;
    }




    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }
}
