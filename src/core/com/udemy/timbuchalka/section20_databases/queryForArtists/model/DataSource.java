package core.com.udemy.timbuchalka.section20_databases.queryForArtists.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private static final String DATABASE_NAME = "music.db";
    private static final String CONNECTION_PATH = "jdbc:sqlite:D:\\STUDY\\Java\\JavaTutorial\\" +
            "src\\core\\com\\udemy\\timbuchalka\\section20_databases\\queryForArtists\\model\\" + DATABASE_NAME;

    private Connection connection;
    private Statement statement;

    private static String TABLE_ARTISTS = "artists";
    private static String ARTISTS_COLUMN_ID = "_id";
    private static String ARTISTS_COLUMN_NAME = "name";

    public DataSource() {

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
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public List<Artists> queryArtists(){
        ResultSet resultSet = null;
        List<Artists> list = new ArrayList<>();
        try {
            resultSet = statement.executeQuery("select * from " + TABLE_ARTISTS);
            while (resultSet.next()) {
                Integer id = Integer.valueOf(resultSet.getInt(ARTISTS_COLUMN_ID));
                String name = String.valueOf(resultSet.getString(ARTISTS_COLUMN_NAME));
                Artists one = new Artists(id,name);
                list.add(one);
                System.out.println("id : " + id + "\t"
                                    +" name : " + name);
            }
            return list;
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



}
