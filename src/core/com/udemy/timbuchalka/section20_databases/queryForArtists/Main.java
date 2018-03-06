package core.com.udemy.timbuchalka.section20_databases.queryForArtists;

import core.com.udemy.timbuchalka.section20_databases.queryForArtists.model.DataSource;
import core.com.udemy.timbuchalka.section20_databases.queryForArtists.model.DataSource2;
import core.com.udemy.timbuchalka.section20_databases.queryForArtists.model.ORDER_BY;

public class Main {
    public static void main(String[] args) {
//        DataSource dataSource = new DataSource();
        DataSource2 dataSource = new DataSource2();
        if (dataSource.connect()) {
            dataSource.queryArtists(ORDER_BY.NONE);
            System.out.println("===================");
            dataSource.queryArtists_useTryWithResource(ORDER_BY.NONE);
        }
        dataSource.close();
        System.out.println("Observing man");
    }
}
