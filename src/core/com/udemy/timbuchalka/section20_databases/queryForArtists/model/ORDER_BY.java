package core.com.udemy.timbuchalka.section20_databases.queryForArtists.model;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 2/12/20182:59 PM.
 */
public enum ORDER_BY {
    ASC("asc"),
    DESC("desc"),
    NONE("");

    public String value;

    ORDER_BY(String desc) {
        this.value = desc;
    }

    public String getValue(){
        return value;
    };
}
