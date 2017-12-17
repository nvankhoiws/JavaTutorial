package core.com.udemy.timbuchalka.section09.list.linkedlist.challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayListApp {
    public static void main(String[] args) {
        Song song1 = new Song("Em là ai", 1.00);
        Song song2 = new Song("Không còn nước mắt để khóc", 5.23);
        Song song3 = new Song("Goodbye to you", 1.53);
        Song song4 = new Song("hills and trees ", 3.19);
        Song song5 = new Song("it's hard to die ", 2.03);
        Song song6 = new Song("singing in the sky ", 82.1);
        Song song7 = new Song("that the spring", 9.11);

        Song song8 = new Song("Extra", 8.74);

        List list1 = new ArrayList<>();

        list1.add(song1);
        list1.add(song3);
        list1.add(song5);
        list1.add(song7);
        Album album01 = new Album("Christmast Album", list1);

        List list2 = new ArrayList<>();
        list2.add(song2);
        list2.add(song4);
        list2.add(song6);
        Album album02 = new Album("West Life Album", list2);

        PlayList playList = new PlayList(new LinkedList<>());

        playList.add(song8);

        playList.add(song3);
        playList.add(song2);
        playList.add(song7);
        playList.add(song5);
        playList.add(song4);

        playList.listAllSongInPlayList();

        playList.viewPlayList();

        playList.remove(song5);

        playList.listAllSongInPlayList();

        playList.viewPlayList();
    }
}
