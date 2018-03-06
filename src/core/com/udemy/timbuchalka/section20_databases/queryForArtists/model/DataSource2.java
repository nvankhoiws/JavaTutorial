package core.com.udemy.timbuchalka.section20_databases.queryForArtists.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource2 {
    private static final String DATABASE_NAME = "music.db";
    private static final String CONNECTION_PATH = "jdbc:sqlite:E:\\IFITemp\\SelfStudy\\Java\\" + // company path
    // private static final String CONNECTION_PATH = "jdbc:sqlite:D:\\STUDY\\Java\\" + // home path
            "JavaTutorial\\src\\core\\com\\udemy\\timbuchalka\\section20_databases\\queryForArtists\\model\\" + DATABASE_NAME;

    private Connection connection;
    private Statement statement;

    private static String TABLE_ARTISTS = "artists";
    private static String ARTISTS_COLUMN_ID = "_id";
    private static String ARTISTS_COLUMN_NAME = "name";

    private static String QUERY_ARTIST_STATEMENT = "SELECT * FROM " + TABLE_ARTISTS;

    public DataSource2() {

    }

    public boolean connect(){
        try {
            this.connection = DriverManager.getConnection(CONNECTION_PATH);
            this.statement = connection.createStatement();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean close(){
        try {
            statement.close();
            System.out.println("Observing man");
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        try {
            connection.close();
            System.out.println("Observing man");
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Artists> queryArtists(ORDER_BY order_by){
        StringBuilder sb = new StringBuilder();
        sb.append(QUERY_ARTIST_STATEMENT).append(" order by ").append(ARTISTS_COLUMN_NAME + " ").append(order_by.getValue());
        System.out.println("Order by noting: " + order_by.getDescribe());
        ResultSet resultSet = null;
        List<Artists> list = new ArrayList<>();
        try {
//            resultSet = statement.executeQuery("select * from " + TABLE_ARTISTS);
            resultSet = statement.executeQuery(sb.toString());
            while (resultSet.next()) {
                Integer id = Integer.valueOf(resultSet.getString(ARTISTS_COLUMN_ID));
                String name = String.valueOf(resultSet.getString(ARTISTS_COLUMN_NAME));
                Artists one = new Artists(id,name);
                list.add(one);
                System.out.println("id : " + id + "\t"
                                    +" name : " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<Artists> queryArtists_useTryWithResource(ORDER_BY order_by){
        StringBuilder sb = new StringBuilder();
        sb.append(QUERY_ARTIST_STATEMENT).append(" order by ").append(ARTISTS_COLUMN_NAME + " ").append(order_by.getValue());
        System.out.println("Order by noting: " + order_by.getDescribe());
//        ResultSet resultSet = null;
        List<Artists> list = new ArrayList<>();
        try (ResultSet resultSet = statement.executeQuery(sb.toString())) {
            while (resultSet.next()) {
                Integer id = Integer.valueOf(resultSet.getString(ARTISTS_COLUMN_ID));
                String name = String.valueOf(resultSet.getString(ARTISTS_COLUMN_NAME));
                Artists one = new Artists(id,name);
                list.add(one);
                System.out.println("id : " + id + "\t"
                        +" name : " + name);
            }

            System.out.println();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
