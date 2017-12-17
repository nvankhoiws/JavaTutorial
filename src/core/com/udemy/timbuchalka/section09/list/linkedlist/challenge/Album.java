package core.com.udemy.timbuchalka.section09.list.linkedlist.challenge;

import java.util.List;

public class Album {
    private String name;

    List<Song> songs;

    public Album(String name, List<Song> songs) {
        for (int i = 0, length = songs.size(); i < length; i++) {
            Song s = songs.get(i);
            if (s.getAlbum().indexOf(this) < 0) {
                s.getAlbum().add(this);
            }
        }
        this.songs = songs;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }
}
