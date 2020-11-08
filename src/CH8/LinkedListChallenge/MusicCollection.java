package CH8.LinkedListChallenge;

import java.util.ArrayList;

public class MusicCollection {
    private ArrayList<Album> musicCollection;

    public MusicCollection() {
        this.musicCollection = new ArrayList<Album>();
    }

    public void addSong(String albumName, String songName, double songDuration) {
        if (findAlbum(albumName) == null) {
            Song newSong = new Song(songName, songDuration);
            Album newAlbum = new Album(albumName, newSong);
            musicCollection.add(newAlbum);
        } else {
            Album album = findAlbum(albumName);
            album.addSong(songName, songDuration);
        }
    }

    public Song getSong(String albumName, String songName) {
        Album album = findAlbum(albumName);
        Song song = album.findSong(songName);
        return song;
    }

    private Album findAlbum(String name) {
        for (int i = 0; i < musicCollection.size(); i++) {
            Album checkedAlbum = musicCollection.get(i);
            if (checkedAlbum.getName().equals(name)) {
                return checkedAlbum;
            }
        }
        return null;
    }


}
