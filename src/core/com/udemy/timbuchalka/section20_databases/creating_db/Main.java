package core.com.udemy.timbuchalka.section20_databases.creating_db;

import java.sql.*;

public class Main {
    public static final String DATABASE_NAME = "data.db";
    public static final String PATH = "jdbc:sqlite:D:\\STUDY\\Java\\JavaTutorial\\" +
            "src\\core\\com\\udemy\\timbuchalka\\section20_databases\\creating_db\\" + DATABASE_NAME;
    public static final String TABLE_NAME = "students";
    public static final String NAME_FIELD = "name";
    public static final String PHONE_FIELD = "phone";
    public static final String EMAIL_FIELD = "email";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(PATH);

            Statement statement = connection.createStatement();

            statement.execute("create table if not EXISTS " + TABLE_NAME + "("
                    + NAME_FIELD + " text, "
                    + PHONE_FIELD + " text, "
                    + EMAIL_FIELD + " text)");

            insert(statement, "khoi","097469594","nvankhoiws@gmail.com");

            insert(statement, "dung","0979263358","nguyenphuongdung2205@gmail.com");

//            statement.execute("delete from students where name = 'dung'");

//            statement.execute("select * from students");

//            ResultSet resultSet = statement.getResultSet();
            ResultSet resultSet = statement.executeQuery("select * from students");

            while (resultSet.next()) {
                System.out.println("Name " + resultSet.getString("name") + "\t"
                        + "Phone " + resultSet.getString("phone") + "\t"
                        + "Email " + resultSet.getString("email"));
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean insert (Statement statement, String name, String phone, String email) throws SQLException{
        return statement.execute("insert into " + TABLE_NAME
                + " (" + NAME_FIELD
                + "," + PHONE_FIELD
                + "," + EMAIL_FIELD
                + ") values('"
                + name + "','"
                + phone + "','"
                + email + "')");
    }
}
