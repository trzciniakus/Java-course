package CH8.LinkedListChallenge;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> tracklist;

    public Album(String name, Song song) {
        this.name = name;
        this.tracklist = new ArrayList<Song>();
        tracklist.add(song);
    }

    public String getName() {
        return name;
    }

    public boolean addSong(String name, double duration) {
        if (findSong(name) == null) {
            Song newSong = new Song(name, duration);
            tracklist.add(newSong);
            return true;
        } else {
            return false;
        }
    }

    public Song findSong(String name) {
        for (int i = 0; i < tracklist.size(); i++) {
            Song checkedSong = tracklist.get(i);
            if (checkedSong.getName().equals(name)) {
                return checkedSong;
            }
        }
        return null;
    }

}
