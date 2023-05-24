package chapterNine;

public class AudioBook extends Book{
    private double bookSize;
    private double playLength;
    private String artistName;

    public AudioBook(String title, String yearOfPublication, String nameOfAuthor, double bookSize, double playLength, String artistName) {
        super(title, yearOfPublication, nameOfAuthor);
        this.bookSize = bookSize;
        this.playLength = playLength;
        this.artistName = artistName;
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "bookSize=" + bookSize +
                ", playLength=" + playLength +
                ", artistName='" + artistName + '\'' +
                '}';
    }
}
