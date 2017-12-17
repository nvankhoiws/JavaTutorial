package core.com.udemy.timbuchalka.section09.list.linkedlist.challenge;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String title;
    private Double duration;
    private List album;

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
        this.album = new ArrayList();
    }

    public Song(String title, Double duration, Album aAlbum) {
        this.title = title;
        this.duration = duration;
        if (this.album != null) {
            this.album = new ArrayList();
        }
        this.album.add(aAlbum);
    }

    public String getTitle() {
        return title;
    }

    public Double getDuration() {
        return duration;
    }

    public List getAlbum() {
        return album;
    }
}
