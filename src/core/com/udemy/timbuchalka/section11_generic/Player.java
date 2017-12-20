package core.com.udemy.timbuchalka.section11_generic;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/20/20171:12 PM.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
