package core.com.udemy.timbuchalka.section11_generic;

/**
 * Created by Khoi.NguyenVan@nttdata.com on 12/20/20171:14 PM.
 */
public class FootballPlayer extends Player implements Comparable{

    public FootballPlayer(String name) {
        super(name);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
