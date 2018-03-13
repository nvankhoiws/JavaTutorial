package core.com.udemy.timbuchalka.section20_databases.queryForArtists.model;

public class Albums {
    private Integer _id;
    private String name;
    private Integer artist;

    public Albums(Integer _id, String name, Integer artist) {
        this._id = _id;
        this.name = name;
        this.artist = artist;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArtist() {
        return artist;
    }

    public void setArtist(Integer artist) {
        this.artist = artist;
    }
}
