package ru.geekbrains.level_3.hw_6;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBase {

    static Connection conn;
    static Statement st;

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        createTable();
        Repository r = new Repository();
        Student student = new Student(1,"Ivanov",52);
        r.insert(student);


    }

    static void createTable(){

        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:studentdb");
            String sql =  "CREATE TABLE IF NOT EXISTS STUDENT(\n" +
                    "   ID INT PRIMARY KEY   NOT NULL,\n" +
                    "   SURNAME          TEXT    NOT NULL,\n" +
                    "   BALL            INT     NOT NULL)";
            st = conn.createStatement();
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


}
