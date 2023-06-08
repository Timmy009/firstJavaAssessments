package musicLibrary;

public class PlayableSong  extends Song{
    private String filePath;


    public PlayableSong(String title, String artist, int duration, String filePath) {
        super(title, artist, duration);
        this.filePath = filePath;
    }

    @Override
    public int getDuration () {
        int minutes = duration / 60;
        int seconds = duration % 60;
        return minutes * 100 + seconds;

    }
}
