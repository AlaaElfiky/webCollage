package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/faculty";
    private static Connection con = null;
    private static Statement state = null;
    private static PreparedStatement pStat = null;
    private static ResultSet set = null;

    public void connection() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, "root", "root");
            state = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       


        
    }
    /*
     public boolean insert_tasks(String name_material, String task_lecture, String task_sec, String task_project, int  week_number,int  month_number ) {
        try {
            connection();

            pStat = con.prepareStatement("insert into faculty.weekly(name_material, task_lecture, task_sec, task_project, week_number, month_number)values (?,?,?,?,?,?)");
            pStat.setString(1, name_material);
            pStat.setString(2, task_lecture);
            pStat.setString(3,task_sec);
            pStat.setString(4, task_project);
            pStat.setInt(5,week_number);
             pStat.setInt(6, month_number);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
    }
    */
      //id, email, name, subject, message, tooo, message_date
         public boolean insert_into_Contact(String email,String name,  String subject, String message, String tooo,String message_date) {
        try {
            connection();

            pStat = con.prepareStatement("insert into contact(email, name, subject, message, tooo, message_date)values (?,?,?,?,?,?)");
            pStat.setString(1, email);
            pStat.setString(2,name);
            pStat.setString(3, subject);
            pStat.setString(4, message);
            pStat.setString(5, tooo);
             pStat.setString(6,message_date);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
    }
         public static void main(String[] args) {
        
    }

}
