/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import Entitiy.Student;
import Entitiy.doctor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author m7md
 */
public class Doctor_date {
    
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
    add doctor in date base
    id, name_doctor, specialization, connected, qualification
    */
    public boolean AddDoctor(String name,  String specialization, String connected ,String qualification) {
        try {
            connection();

            pStat = con.prepareStatement("insert into doctor(name_doctor, specialization, connected, qualification)values (?,?,?,?)");
            pStat.setString(1, name);
            pStat.setString(2,specialization);
            pStat.setString(3,qualification);
            pStat.setString(4,connected);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
    }
    
    
    /*
    مثود تعمل ارجاع ال بيانات الدكتور من الجداول 
    */
    public ArrayList select_doctor(String sp) {
        ArrayList<doctor> list = new ArrayList<>();
        try {
            connection();
//id, name_doctor, specialization, connected, qualification
            pStat = con.prepareStatement("select * from  doctor where   specialization=? ");
           
            pStat.setString(1, sp);
            set = pStat.executeQuery();
            while (set.next()) {
                doctor d=new doctor();
               d.setId(set.getInt("id"));
               d.setDoctor_name(set.getString("name_doctor"));
               d.setSpecialization(set.getString("specialization"));
               d.setQualification(set.getString("qualification"));
               d.setConnected(set.getString("connected"));
                list.add(d);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return list;
    }
    
    
    
    public static void main(String[] args) {
        Doctor_date d=new Doctor_date();
        doctor dd=d.search_by_id(5);
        System.out.println(dd.getDoctor_name());
    }

    public doctor search_by_id(int id) {
        doctor d = new doctor();

        try {
            connection();

            pStat = con.prepareStatement("select * from  doctor where  id=?");
            pStat.setInt(1, id);
            set = pStat.executeQuery();
            while (set.next()) {
              d.setId(set.getInt("id"));
               d.setDoctor_name(set.getString("name_doctor"));
               d.setSpecialization(set.getString("specialization"));
               d.setQualification(set.getString("qualification"));
               d.setConnected(set.getString("connected"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return d;
    }
    

    public String updata_doctor(int id,String name,String sp,String qu,String cont) {
//    id, name_doctor, specialization, connected, qualification
            try {
            connection();
            pStat = con.prepareStatement("update doctor set name_doctor=? , specialization=? , "
                    + " connected=? ,    qualification=? where id=?");
            pStat.setString(1, name);
            pStat.setString(2, sp);
            pStat.setString(3, cont);
            pStat.setString(4, qu);
            

            pStat.setInt(5, id);
            pStat.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return "تم التعديل ";

    }

    public String delete(int id) {
    
        try {
            connection();

            pStat = con.prepareStatement("delete doctor from doctor where id=?");
            pStat.setInt(1, id);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "تم حذف الدكتور";
    }
    }

