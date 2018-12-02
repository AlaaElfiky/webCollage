/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entitiy.Material;
import Entitiy.Weekly;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;


/**
 *
 * @author m7md
 */
public class WeeklyData {

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
    Weekly weekly;

    //id, name_material, task_lecture, task_sec, task_project, day_date
    public Weekly get_date(String name_material, int year, String sp ) {
    
    Calendar cal=Calendar.getInstance();
        int week=cal.get(Calendar.WEEK_OF_MONTH);
                System.out.println(week);

        int month=cal.get(Calendar.MONTH)+1;
                System.out.println(month);

        weekly = new Weekly();
        
        //id, name_material, task_lecture, task_sec, task_project, week_number, month_number
        try {
            connection();
            
            pStat = con.prepareStatement("select w.name_material ,w.task_lecture ,"
                    + "w.task_sec from weekly w join material f on f.name_material =w.name_material"
                    + " where f.name_material=?"
                    + " and f.specialization =? and f.year =? and w.week_number=? and w.month_number=? ; ");
            pStat.setString(1, name_material);
            pStat.setString(2, sp);
            pStat.setInt(3, year);
            pStat.setInt(4,week);
            pStat.setInt(5,month);
            set = pStat.executeQuery();
            while (set.next()) {
                weekly.setName_material(set.getString("name_material"));
                weekly.setTask_lecture(set.getString("task_lecture"));

                weekly.setTask_sec(set.getString("task_sec"));
              
            }
            System.out.println(weekly.getName_material());

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return weekly;
    }
    public Weekly get_date_Project(String name_material, int year, String sp ) {
    
    Calendar cal=Calendar.getInstance();
        int week=cal.get(Calendar.WEEK_OF_MONTH);
        System.out.println(week);
        int month=cal.get(Calendar.MONTH)+1;
        weekly = new Weekly();
        
        //id, name_material, task_lecture, task_sec, task_project, week_number, month_number
        try {
            connection();
            
            pStat = con.prepareStatement("select w.task_project ,w.name_material "
                    + " from weekly w join material f on f.name_material =w.name_material"
                    + " where f.name_material=?"
                    + " and f.specialization =? and f.year =? and w.week_number=? and w.month_number=? ; ");
            pStat.setString(1, name_material);
            pStat.setString(2, sp);
            pStat.setInt(3, year);
            pStat.setInt(4,week);
            pStat.setInt(5,month);
            set = pStat.executeQuery();
            while (set.next()) {
                weekly.setTask_project(set.getString("task_project"));
                weekly.setName_material(set.getString("name_material"));
               
            }
            System.out.println(weekly.getName_material());

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return weekly;
    }

   public  Material get_source(String name_material, int year, String sp ) {
        Material material=new Material();
    Calendar cal=Calendar.getInstance();
        int week=cal.get(Calendar.WEEK_OF_MONTH);
        int month=cal.get(Calendar.MONTH)+1;
        weekly = new Weekly();
        
//       name_material, year, specialization, doctor_id, source_material
        try {
            connection();
            pStat = con.prepareStatement("select m.name_material , m.source_material  from  material m  where m.name_material=?"
                    + " and m.specialization =? and m.year =? ; ");
            pStat.setString(1, name_material);
            pStat.setString(2, sp);
            pStat.setInt(3, year);
           set = pStat.executeQuery();
            while (set.next()) {
                material.setName_material(set.getString("name_material"));
                material.setSource_material(set.getString("source_material"));
                
               
            }
            System.out.println(material.getName_material()+"**");
            System.out.println(material.getSource_material()+"**");

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return material;
    }
//   //////////////// insert tasks/////////////////
 //  id, name_material, task_lecture, task_sec, task_project, week_number, month_number
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
   //////////////////////////////////////////////
             //********** method delete from weekly ******************
//id, name_material, task_lecture, task_sec, task_project, week_number, month_number
    public String delete_material(int week_number ) {
        try {
            connection();

            pStat = con.prepareStatement("delete weekly from weekly where  week_number=?");
            pStat.setInt(1, week_number);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "تم حذف الماده";
    
    }
        
    ///////////////////delete tasks by id///
     public String delete_tasks(int id ) {
        try {
            connection();

            pStat = con.prepareStatement("delete weekly from weekly where  id=?");
            pStat.setInt(1, id);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "تم حذف الماده";
    
    }
////////////////////////////// update material

     //  id, name_material, task_lecture, task_sec, task_project, week_number, month_number
 public String updata_weekly(int id,String name_material,int  week_number,int month_number,String task_lecture ,String task_sec,String  task_project) {

            try {
            connection();
            pStat = con.prepareStatement("update weekly set  name_material=? , "
                    + "week_number=? ,    month_number=?  ,task_lecture=?,task_sec=?,task_project=? where id=?");
           
            pStat.setString(1,  name_material);
            pStat.setInt(2,  week_number);
            pStat.setInt(3, month_number);
            pStat.setString(4, task_lecture);
             pStat.setString(5,  task_sec);
             pStat.setString(6,  task_project);
           pStat.setInt(7, id);
           
            pStat.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return "تم التعديل ";

    }

    public  boolean get_s(String name_material, int year, String sp ) {
       
           String n = null; 
        try {
            connection();
            pStat = con.prepareStatement("select m.name_material  from  material m  where m.name_material=?"
                    + " and m.specialization =? and m.year =? ; ");
            pStat.setString(1, name_material);
            pStat.setString(2, sp);
            pStat.setInt(3, year);
            ////////////////////
           set = pStat.executeQuery();
           while (set.next()) {
                 n=set.getString("name_material");
               }
        System.out.println(n);
            System.out.println();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (name_material.equals(n)) {
            return true;
        }else
         return false;
    }
//    
        public ArrayList select_weekly(String name_materail) {
        ArrayList<Weekly> list = new ArrayList<>();
        try {
            connection();
//id, name_material, task_lecture, task_sec, task_project, week_number, month_number
            pStat = con.prepareStatement("select * from  weekly where   name_material=? ");
           
            pStat.setString(1, name_materail);
             set = pStat.executeQuery();
            while (set.next()) {
                Weekly weekly=new Weekly();
                 weekly.setId(set.getInt("id"));
                 weekly.setName_material(set.getString("name_material"));
                 weekly.setTask_lecture(set.getString("task_lecture"));
                 weekly.setTask_sec(set.getString("task_sec"));
                 weekly.setWeek_number(set.getInt("week_number"));
                 weekly.setMonth_number(set.getInt("month_number"));
                
               
                list.add(weekly);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return list;
    }

    
    public static void main(String[] args) {
        WeeklyData d = new WeeklyData();
        
    d.updata_weekly(1,"en",10,4,"khkggk" ,"yfgffggg","kjgjkgjgjgjj");
    
//    System.out.println(d.insert_tasks("en","jkgjkgsjkgfkjw","ugdjafegjkgjfk", "kjgjdfjhfdj", 3,2));
    }
    ////////////////////////////////search task
    /////////////////////////////////////////////////////////////////search task id
    public Weekly search_task_id(int id) {
      Weekly  week= new Weekly();

        try {
            connection();
//id, name_material, task_lecture, task_sec, task_project, week_number, month_number
            pStat = con.prepareStatement("select * from  weekly where id =?");
            pStat.setInt(1, id);
            set = pStat.executeQuery();
            while (set.next()) {
          week.setId(set.getInt("id"));
         week.setName_material(set.getString("name_material"));
               week.setTask_lecture(set.getString("task_lecture"));
                week.setTask_sec(set.getString("task_sec"));
                 week.setTask_project(set.getString("task_project"));
                 week.setWeek_number(set.getInt("week_number"));
                 week.setMonth_number(set.getInt("month_number"));
               
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return week;
    }
    
   
}
