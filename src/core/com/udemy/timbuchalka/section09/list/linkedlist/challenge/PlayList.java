package core.com.udemy.timbuchalka.section09.list.linkedlist.challenge;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class PlayList {
    private LinkedList<Song> playList;

    private Song currentSong;

    public PlayList(LinkedList<Song> playList) {
        this.playList = playList;
        if(this.playList.size() > 0){
            this.currentSong = playList.getFirst();
        }
    }

    public void add(Song song){
        if (song.getAlbum().size() > 0) {
            this.playList.add(song);
            if (playList.size() == 1) {
                this.currentSong = song;
            }
        } else {
            System.out.println("The song " + song.getTitle() + " does not exist in any album\n"
                    +"Please add this song to an album");
            System.out.println("==================================");
        }
    }

    public void viewPlayList(){
        System.out.println("Audit the playlist....................");

        Scanner scanner = new Scanner(System.in);

        printOptions();

        boolean quit = false;

        while (!quit) {
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 0:
                    quit = true;
                    System.out.println("You have quit the view the play list.");
                    break;
                case 1:
                    if (this.currentSong.equals(this.playList.getLast())) {
                        System.out.println("You have reached the end of the list");
                    } else {
                        skipForward();
                        System.out.println("The current song is " + this.currentSong.getTitle());
                    }
                    break;
                case 2:
                    if (this.currentSong.equals(this.playList.getFirst())) {
                        System.out.println("You have reached the beginning of the list");
                    } else {
                        skipBackward();
                        System.out.println("The current song is " + this.currentSong.getTitle());
                    }
                    break;
                case 3:
                    replayCurrentSong();
                    break;
                case 4:
                    listAllSongInPlayList();
                    break;
                case 5:
                    printOptions();
                    break;
            }
        }
    }

    private void printOptions() {
        System.out.println("Please choose the following option.........................");

        System.out.println("0 - Quit viewing\n"
                        +"1 - Skip forward\n"
                        +"2 - Skip backward\n"
                        +"3 - Replay current song\n"
                        +"4 - List the song in the play list\n"
                        +"5 - Print the options");
        System.out.println("==================================");
    }

    public void skipForward(){
        ListIterator listIterator = playList.listIterator();
        boolean stop = false;
        while(!stop && listIterator.hasNext()) {
            Song s = (Song) listIterator.next();
            if (s.getTitle().equalsIgnoreCase(getCurrentSong().getTitle())) {
                currentSong = (Song) listIterator.next();
                stop = true;
            }
        }
    }

    public void skipBackward(){
        ListIterator listIterator = playList.listIterator();
        boolean stop = false;
        while(!stop && listIterator.hasNext()) {
            Song s = (Song) listIterator.next();
            if (s.getTitle().equalsIgnoreCase(getCurrentSong().getTitle())) {
                listIterator.previous();
                if (listIterator.hasPrevious()){
                    currentSong = (Song) listIterator.previous();
                    stop = true;
                }
            }
        }
    }

    public void replayCurrentSong(){
        System.out.println("Playing the song named " + currentSong.getTitle());
        System.out.println("==================================");
    }

    public void listAllSongInPlayList(){
        System.out.println("List all the song in the album");
        for (int i = 0, length = getPlayList().size(); i < length; i++) {
            System.out.println(i+ 1 + " - " + getPlayList().get(i).getTitle());
        }
        System.out.println("==================================");
    }

    public void remove(Song song){
        playList.remove(song);
    }

    public LinkedList<Song> getPlayList() {
        return playList;
    }

    public Song getCurrentSong() {
        return currentSong;
    }
}
