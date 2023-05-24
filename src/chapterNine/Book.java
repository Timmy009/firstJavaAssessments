package chapterNine;

public class Book {
    private String title;
    private String yearOfPublication;
    private String nameOfAuthor;

    public Book(String title, String yearOfPublication, String nameOfAuthor) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.nameOfAuthor = nameOfAuthor;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                ", nameOfAuthor='" + nameOfAuthor + '\'' +
                '}';
    }


}
