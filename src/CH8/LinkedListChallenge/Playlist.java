package CH8.LinkedListChallenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private String name;
    private MusicCollection musicCollection;
    private LinkedList<Song> songs;

    public Playlist(String name, MusicCollection musicCollection) {
        this.name = name;
        this.musicCollection = musicCollection;
        this.songs = new LinkedList<Song>();
    }

    public boolean addSong(String albumName, String songName) {
        if (findSongInPlaylist(songName) == null) {
            Song song = musicCollection.getSong(albumName, songName);
            songs.add(song);
            return true;
        }
        return false;
    }

    public void playMusic() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = songs.listIterator();

        if (songs.isEmpty()) {
            System.out.println("No songs in the playlist");
        } else {
            System.out.println("\nNow playing " + listIterator.next().getName() + "\n");
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Player turned off.");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getName());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getName());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().getName());
                            listIterator.next();
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().getName());
                            listIterator.previous();
                        }
                    }
                    break;
                case 4:
                    listIterator.remove();
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }

    private Song findSongInPlaylist(String songName) {
        for (int i = 0; i < songs.size(); i++) {
            Song checkedSong = songs.get(i);
            if (checkedSong.getName().equals(songName)) {
                return checkedSong;
            }
        }
        return null;
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("\t0 - end");
        System.out.println("\t1 - go to next");
        System.out.println("\t2 - go to previous");
        System.out.println("\t3 - repeat");
        System.out.println("\t4 - remove current played song");
        System.out.println("\t5 - print menu");
    }
}
