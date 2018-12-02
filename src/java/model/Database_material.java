/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import Entitiy.Material;
import Entitiy.Weekly;
import Entitiy.doctor;
import Entitiy.result;
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
public class Database_material {
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
    
     //methed logIn      
    //id, name, year, user_name, password, specialization
    public boolean check(String name, String password) {
        boolean result = false;
        try {
            connection();
            pStat = con.prepareStatement("select user_name  from student  where password =? and user_name= ?");
            pStat.setString(1, password);
            pStat.setString(2, name);
            set = pStat.executeQuery();

            String user = "";

            while (set.next()) {
                user = set.getString("user_name");
                System.out.println(user);
            }
            if (user.equals(name)) {
                result = true;
            } else {
                result = false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
    ////////////////////////////////////////////////////
    //name_material, year, specialization, doctor_id, source_material
      public boolean insert_material(String name_material, int year, String specialization,int doctor_id, String source_material) {
        try {
            connection();

            pStat = con.prepareStatement("insert into material(name_material, year, specialization, doctor_id, source_material)values (?,?,?,?,?)");
            pStat.setString(1, name_material);
            pStat.setInt(2, year);
            pStat.setString(3, specialization);
            pStat.setInt(4, doctor_id);
            pStat.setString(5, source_material);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
      }
        //********** method delete from student ******************

    public String delete_material(String name) {
        try {
            connection();

            pStat = con.prepareStatement("delete material from material where name_material=?");
            pStat.setString(1,name);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "تم حذف الماده";
    
    }
    
    ////////////////////////////////////////////////////////
    
public Material search_material(String materail) {
        Material mater = new Material();

        try {
            connection();
//name_material, year, specialization, doctor_id, source_material
            pStat = con.prepareStatement("select * from  material where name_material =?");
            pStat.setString(1,materail);
            set = pStat.executeQuery();
            while (set.next()) {

          mater.setName_material(set.getString("name_material"));
                mater.setSpecialization(set.getString("specialization"));
                mater.setYear(set.getInt("year"));
                mater.setDoctor_id(set.getInt("doctor_id"));
                mater.setSource_material(set.getString("source_material"));
               
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return mater;
    }
////////////////////////////// update material
//name_material, year, specialization, doctor_id, source_material
 public String updata_material(String name_material,int year,String specialization,int doctor_id,String source_material) {
//    id, name_doctor, specialization, connected, qualification
            try {
            connection();
            pStat = con.prepareStatement("update material set  year=? , "
                    + "specialization=? ,   doctor_id=? ,source_material=? where name_material=?");
           
            pStat.setInt(1, year);
            pStat.setString(2,  specialization);
            pStat.setInt(3, doctor_id);
            pStat.setString(4, source_material);
            pStat.setString(5, name_material);
            pStat.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return "تم التعديل ";

    }
 /////////////////////////////////////////////////////select from material table by using dept 
//name_material, year, specialization, doctor_id, source_material
    public ArrayList select_material(int year,String specialization) {
        ArrayList<Material> list = new ArrayList<>();
        try {
            connection();

            pStat = con.prepareStatement("select * from  material where   specialization=? and year=?");
           
            pStat.setString(1, specialization);
            pStat.setInt(2, year);
            set = pStat.executeQuery();
            while (set.next()) {
                Material mater=new Material();
                  mater.setName_material(set.getString("name_material"));
                mater.setSpecialization(set.getString("specialization"));
                mater.setYear(set.getInt("year"));
                mater.setDoctor_id(set.getInt("doctor_id"));
                mater.setSource_material(set.getString("source_material"));
               
                list.add(mater);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return list;
    }
//    اضافة درجات الطالب 
    
     public boolean insert_result(int student_id, String material_name, int applied,int ff, int year) {
        try {
            connection();

            pStat = con.prepareStatement("insert into student_material(student_id, material_name, applied, final, year)values (?,?,?,?,?)");
            pStat.setInt(1, student_id);
           
            pStat.setString(2, material_name);
            pStat.setInt(3, applied);
            pStat.setInt(4, ff);
             pStat.setInt(5, year);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
      }
     ///// delete result
      //id, student_id, material_name, applied, final, year
      public String delete_result(int student_id, String material_name) {
        try {
            connection();

            pStat = con.prepareStatement("delete  student_material from  student_material where student_id=? and material_name=?");
            pStat.setInt(1,student_id);
             pStat.setString(2,material_name);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "تم حذف الماده";
    
    }
    
   
    public ArrayList select_degree(int id_student) {
        ArrayList<result> list = new ArrayList<>();
        try {
            connection();
//id, student_id, material_name, applied, final, year
            pStat = con.prepareStatement("select * from  student_material where  student_id=? order by id desc;");
           
            
            pStat.setInt(1, id_student);
            
            set = pStat.executeQuery();
            while (set.next()) {
                result r=new result();
                  r.setId(set.getInt("id"));
                  r.setId_student(set.getInt("student_id"));
                  r.setMaterial_name(set.getString("material_name"));
                  r.setMaterial_applied(set.getInt("applied"));
                  r.setMaterial_final(set.getInt("final"));
                   r.setYear(set.getInt("year"));

                list.add(r);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return list;
    }
    /*
    علشان اعرف المادة موجده ولا لا عن طريق اسمها 
    */
    public boolean check(String name_materail) {
        boolean result = false;
        try {
            connection();
            pStat = con.prepareStatement("select material_name  from student_material  where  material_name= ?");
            
            pStat.setString(1, name_materail);
            set = pStat.executeQuery();

            String user = "";

            while (set.next()) {
                user = set.getString("material_name");
                System.out.println(user);
            }
            if(user.equals(null)||user.equals("")){
                result = false;
            }
            else if (user.equals(name_materail)) {
                result = true;
            } else {
                result = false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        Database_material d=new Database_material();
        System.out.println(d.insert_result(3,"cd",30,70,2016));
    }
    /////// insert result///
   
    
}