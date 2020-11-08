package CH8.LinkedListChallenge;

public class Main {

    public static void main(String[] args) {

        MusicCollection myCollection = new MusicCollection();
        myCollection.addSong("Rock", "Nothing Else Matters", 3.5);
        myCollection.addSong("Rock", "Vertigo", 3.2);
        myCollection.addSong("Rock", "Bring me to life", 2.7);
        myCollection.addSong("Rock", "Stairway to heaven", 2.8);
        myCollection.addSong("Rock", "Highway to hell", 3.0);
        myCollection.addSong("Pop", "Thousand Miles", 3.5);
        myCollection.addSong("Pop", "Million Bicycles in Beijing", 3.2);
        myCollection.addSong("Pop", "Like a virgin", 2.7);
        myCollection.addSong("Pop", "Mirrors", 2.8);
        myCollection.addSong("Pop", "Thriller", 3.0);


        Playlist myPlaylist = new Playlist("Vacation Playlist", myCollection);
        myPlaylist.addSong("Pop", "Mirrors");
        myPlaylist.addSong("Rock", "Bring me to life");
        myPlaylist.addSong("Pop", "Thousand Miles");
        myPlaylist.addSong("Pop", "Thriller");
        myPlaylist.addSong("Rock", "Stairway to heaven");

        myPlaylist.playMusic();
    }
}
