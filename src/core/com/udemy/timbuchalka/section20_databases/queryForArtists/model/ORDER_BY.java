package core.com.udemy.timbuchalka.section20_databases.queryForArtists.model;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 2/12/20182:59 PM.
 */
public enum ORDER_BY {
    ASC("asc", "ascending"),
    DESC("desc","descending"),
    NONE("", "not apply order by");

    public String value;
    public String describe;

    ORDER_BY(String value, String describe) {
        this.value = value;
        this.describe = describe;
    }

    public String getValue(){
        return this.value;
    }

    public String getDescribe(){
        return this.describe;
    }
}
