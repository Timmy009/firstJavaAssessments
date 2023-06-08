package musicLibrary;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    private String name;
    private List <Song> songs = new ArrayList<>();



    public void addSong (Song song) {
        if (songs.contains(song)) {
            throw new IllegalArgumentException("Song lready exists in the playlist");
        }
        songs.add(song);
    }
    public void removeSong (Song song) {
        songs.remove(song);
    }
    public int getTotalDuration () {
        int totalDuration = 0;
        for (Song song : songs) {
           totalDuration += song.getDuration();
        }
        return totalDuration;
    }
}
