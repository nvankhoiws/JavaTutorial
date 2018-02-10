package core.com.udemy.timbuchalka.section20_databases.queryForArtists;

import core.com.udemy.timbuchalka.section20_databases.queryForArtists.model.DataSource;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (dataSource.connect()) {
            dataSource.queryArtists();
        }
    }
}
