//package musicLibrary;
//
//import java.util.ArrayList;
//
//public class Demo {
//
//        private String title;
//        private String artist;
//        protected int duration;
//
//        public Demo(String title, String artist, int duration) {
//            this.title = title;
//            this.artist = artist;
//            this.duration = duration;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public String getArtist() {
//            return artist;
//        }
//
//        public int getDuration() {
//            return duration;
//        }
//    }
//
//    class PlayableSong extends Demo {
//        private String filePath;
//
//        public PlayableSong(String title, String artist, int duration, String filePath) {
//            super(title, artist, duration);
//            this.filePath = filePath;
//        }
//
//        @Override
//        public int getDuration() {
//            int minutes = duration / 60;
//            int seconds = duration % 60;
//            return minutes * 100 + seconds;
//        }
//    }
//
//    class Playlist {
//        private String name;
//        private ArrayList<Song> songs;
//
//        public Playlist(String name) {
//            this.name = name;
//            songs = new ArrayList<>();
//        }
//
//        public void addSong(Song song) throws Exception {
//            if (songs.contains(song)) {
//                throw new Exception("Song already exists in the playlist.");
//            }
//            songs.add(song);
//        }
//
//        public void removeSong(Song song) {
//            songs.remove(song);
//        }
//
//        public int getTotalDuration() {
//            int totalDuration = 0;
//            for (Song song : songs) {
//                totalDuration += song.getDuration();
//            }
//            return totalDuration;
//        }
//
//        public void playAll() {
//            System.out.println("Playing playlist: " + name);
//            for (Song song : songs) {
//                System.out.println("Title: " + song.getTitle());
//                System.out.println("Artist: " + song.getArtist());
//                System.out.println("Duration: " + song.getDuration() + " seconds");
//                System.out.println();
//            }
//        }
//    }
//
//    public class MusicLibrary {
//        public static void main(String[] args) {
//            try {
//                Song song1 = new Song("Song 1", "Artist 1", 180);
//                Song song2 = new Song("Song 2", "Artist 2", 240);
//                PlayableSong song3 = new PlayableSong("Song 3", "Artist 3", 300, "path/to/song3.mp3");
//
//                Playlist playlist = new Playlist("My Playlist");
//                playlist.addSong(song1);
//                playlist.addSong(song2);
//                playlist.addSong(song3);
//                playlist.addSong(song1); // Duplicate song, throws exception
//
//                System.out.println("Total Duration: " + playlist.getTotalDuration() + " seconds");
//                System.out.println();
//
//                playlist.playAll();
//            } catch (Exception e) {
//                System.out.println("Exception occurred: " + e.getMessage());
//            }
//        }
//    }
//
//}
