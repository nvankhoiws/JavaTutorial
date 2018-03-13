package core.com.udemy.timbuchalka.section20_databases.queryForArtists.model;

public class Songs {
    private Integer _id;
    private Integer track;
    private String title;
    private Integer album;

    public Songs(Integer _id, Integer track, String title, Integer album) {
        this._id = _id;
        this.track = track;
        this.title = title;
        this.album = album;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public Integer getTrack() {
        return track;
    }

    public void setTrack(Integer track) {
        this.track = track;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAlbum() {
        return album;
    }

    public void setAlbum(Integer album) {
        this.album = album;
    }
}
