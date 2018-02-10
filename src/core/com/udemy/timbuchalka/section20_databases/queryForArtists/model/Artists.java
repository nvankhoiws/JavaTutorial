package core.com.udemy.timbuchalka.section20_databases.queryForArtists.model;

public class Artists {
	private Integer _id;
	private String name;

	public Artists(Integer _id, String name) {
		this._id = _id;
		this.name = name;
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
}
