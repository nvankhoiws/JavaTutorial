package core.com.udemy.timbuchalka.section20_databases.creating_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\STUDY\\Java\\JavaTutorial\\" +
                    "src\\core\\com\\udemy\\timbuchalka\\section20_databases\\creating_db\\data.db");

            Statement statement = connection.createStatement();
            statement.execute("create table if not EXISTS students(name text, phone text, email text)");

            statement.execute("insert into students (name, phone, email) " +
                    "values ('khoi','097469594','nvankhoiws@gmail.com')");

            statement.execute("insert into students (name, phone, email) " +
                    "values ('dung','0979263358','nguyenphuongdung2205@gmail.com')");

            statement.execute("update students set name ='Nguyen Van Khoi' " +
                    "where name = 'khoi'");

            statement.execute("delete from students where name = 'dung'");

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
