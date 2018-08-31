package ru.geekbrains.level_3.hw_6;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Repository {

    Connection conn;
    PreparedStatement st;

    enum field {ID, Surname, BAll}


    public void insert(Student student) {
        String sql = "INSERT INTO Student (ID, SURNAME, BALL) VALUES(?,?,?)";
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:studentdb");
            st = conn.prepareStatement(sql);
            st.setInt(1, student.getId());
            st.setString(2, student.getSurname());
            st.setInt(3, student.getBall());
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

    public void updateBall(int ID,int ball) {
        String sql = "UPDATE STUDENT SET BALL = ? WHERE ID = ?";
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:studentdb");
            st = conn.prepareStatement(sql);
            st.setInt(1,ball);
            st.setInt(2, ID);
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

    public void updateSurname(int ID,String surname) {
        String sql = "UPDATE STUDENT SET SURNAME = ? WHERE ID = ?";
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:studentdb");
            st = conn.prepareStatement(sql);
            st.setString(1,surname);
            st.setInt(2, ID);
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







