package chapterNine;

public class PrintBook extends Book{
    private String publisher;
    private String ISBN;

    public PrintBook(String title, String yearOfPublication, String nameOfAuthor, String publisher, String ISBN) {
        super(title, yearOfPublication, nameOfAuthor);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }



}
