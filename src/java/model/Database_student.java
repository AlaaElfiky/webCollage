package model;

import Entitiy.Message;
import Entitiy.Student;
import Entitiy.result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database_student {

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

    //mthed logIn      
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
//*********** mothed insert into student **********************
//      id, name, year, user_name, password, specialization

    public boolean insert_student(String name, int year, String user_name, String password, String specialization) {
        try {
            connection();

            pStat = con.prepareStatement("insert into faculty.student(name,year, user_name,password,specialization)values (?,?,?,?,?)");
            pStat.setString(1, name);
            pStat.setInt(2, year);
            pStat.setString(3, user_name);
            pStat.setString(4, password);
            pStat.setString(5, specialization);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
    }
//********** method delete from student ******************

    public String delete(int id) {
        try {
            connection();

            pStat = con.prepareStatement("delete student from student where id=?");
            pStat.setInt(1, id);
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return "تم حذف الطالب";
    }
    /*
     
    
     */

    public Student search(String user_name) {
        Student student = new Student();

        try {
            connection();

            pStat = con.prepareStatement("select * from  student where user_name =?");
            pStat.setString(1, user_name);
            set = pStat.executeQuery();
            while (set.next()) {
//id, name, year, user_name, password, specialization
                student.setId(set.getInt("id"));
                student.setName(set.getString("name"));
                student.setUser_name(set.getString("user_name"));
                student.setYear(set.getInt("year"));
                student.setSpecialization(set.getString("Specialization"));
                student.setPassword(set.getString("password"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return student;
    }
    /*
     بستخدمها علشان ابحث عن الطالب 
     وارجع بكل بياناته
    
     */

    public Student search_by_id(int id) {
        Student student = new Student();

        try {
            connection();

            pStat = con.prepareStatement("select * from  student where  id=?");
            pStat.setInt(1, id);
            set = pStat.executeQuery();
            while (set.next()) {

                student.setId(set.getInt("id"));
                student.setName(set.getString("name"));
                student.setUser_name(set.getString("user_name"));
                student.setYear(set.getInt("year"));
                student.setSpecialization(set.getString("Specialization"));
                student.setPassword(set.getString("password"));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return student;
    }

    //*******************   admin update in student  table  **********************   
    public boolean studentUpdata(String user_name, String specialization) {
        try {
            connection();
            pStat = con.prepareStatement("update student set  year = year+1  where user_name=?");
            pStat.setString(1, user_name);
            pStat.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return true;
    }
    /*
     من الاسم كدا خلاص اتفهمت 
     */

    public String updata_sudentPassword(String user_name, String password, String new_password) {
        if (check(user_name, password)) {
            try {
                connection();
                pStat = con.prepareStatement("update student set   password=?  where user_name=?");
                pStat.setString(1, new_password);
                pStat.setString(2, user_name);
                pStat.executeUpdate();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            return "تم التعديل ";
        } else {
            return "كلمة السر خطأ ";
        }

    }

    /*
     المثود لترجع نتيجة الطالب 
     */
    public ArrayList reuslt(int id) {
        ArrayList<result> r2 = new ArrayList();
        try {
            connection();

            pStat = con.prepareStatement("SELECT sm.material_name, sm.applied , sm.final ,sm.applied+sm.final total"
                    + " FROM student_material sm where sm.student_id=? "
                    + "order by  year;");
            pStat.setInt(1, id);
            set = pStat.executeQuery();
            int i = 0;
            while (set.next()) {
                result r = new result();
                r.setMaterial_name(set.getString("material_name"));
                r.setMaterial_applied(set.getInt("applied"));
                r.setMaterial_final(set.getInt("final"));
                r.setMaterial_total(set.getInt("total"));

                r2.add(r);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return r2;
    }
    /*
     اكيد من الاسم هتعرف بتعمل  ا
    id, email, name, subject, message, tooo, message_date
          */

    public boolean insert_contect(String email, String name, String subject, String message, String to) {
        try {
            connection();

            pStat = con.prepareStatement("insert into contact(email,name,subject,message,tooo,message_date)values (?,?,?,?,?,?)");
            pStat.setString(1, email);
            pStat.setString(2, name);
            pStat.setString(3, subject);
            pStat.setString(4, message);
            pStat.setString(5, to);
            Calendar cal=Calendar.getInstance();
            int day=cal.get(Calendar.DAY_OF_MONTH);
            int year=cal.get(Calendar.YEAR);
            int month=cal.get(Calendar.MONTH)+1;
            
            pStat.setString(6,day+"/"+month+"/"+year );
            pStat.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return true;
    }
    /*
     to get message from database to student 
     
     id, email, name, subject, message, tooo
     */

    public ArrayList getMessage(String user_name) {
        ArrayList<Message> r2 = new ArrayList();
        try {
            connection();

            pStat = con.prepareStatement("SELECT * FROM contact sm where  sm.tooo=? ;");
            pStat.setString(1, user_name);
            set = pStat.executeQuery();
            while (set.next()) {
                Message message = new Message();
                message.setId(set.getInt("id"));
                message.setName(set.getString("name"));
                message.setEmail(set.getString("email"));
                message.setMessage(set.getString("message"));
                message.setSubject(set.getString("subject"));
                message.setMessage_date(set.getString("message_date"));
                r2.add(message);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return r2;
    }
    /*
     تعمل هذه المثود علي عرض الطلاب
     علي حسب القسم والسنة
     */

    public ArrayList select(int year, String sp) {
        ArrayList<Student> list = new ArrayList<>();
        try {
            connection();

            pStat = con.prepareStatement("select * from  student where year=? and specialization=? ");
            pStat.setInt(1, year);
            pStat.setString(2, sp);
            set = pStat.executeQuery();
            while (set.next()) {
                Student student = new Student();
                student.setId(set.getInt("id"));
                student.setName(set.getString("name"));
                student.setUser_name(set.getString("user_name"));
                student.setYear(set.getInt("year"));
                student.setSpecialization(set.getString("Specialization"));
                student.setPassword(set.getString("password"));
                list.add(student);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return list;
    }
    /*
     هذه المثود تعمل علي تعديل 
     بيانات الطالب 
    
     */

    public String updata_sudent(int id, String name, String user_name, int year, String sp, String password) {

        try {
            connection();
            pStat = con.prepareStatement("update student set name=? , year=? , "
                    + "user_name=? ,    password=? ,  specialization=? where id=?");
            pStat.setString(1, name);
            pStat.setInt(2, year);
            pStat.setString(3, user_name);
            pStat.setString(4, password);
            pStat.setString(5, sp);

            pStat.setInt(6, id);
            pStat.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return "تم التعديل ";

    }

    public static void main(String[] args) {
        Database_student d = new Database_student();
        System.out.println(d.insert_contect("mahed@yahoo", "علي احمد غنيم", "ali@yahoo", "jkfkbvjbf", "admin"));
        

    }

////        Student student = new Student();
//        d.check("ghonem","1234");
////        student = d.search("ghonem");
////        System.out.println(student.getName() + " " + student.getPassword() + " " + student.getSpecialization() + " " + student.getYear());
//
//    d.insert_student("mohamed", 2, "ghonem","123", "cv");
//        //d.delete("ghonem");
//    }
    /*
    انا بستعملها علشان اما ابعت الرساله اشيك علي الطالب الي هبعتله الرسالة موجد ولا لا
    */
public boolean check(String name) {
        boolean result = false;
        try {
            connection();
            pStat = con.prepareStatement("select user_name  from student  where  user_name= ?");
            
            pStat.setString(1, name);
            set = pStat.executeQuery();

            String user = "";

            while (set.next()) {
                user = set.getString("user_name");
                System.out.println(user);
            }
            if(user.equals(null)||user.equals("")){
                result = false;
            }
            else if (user.equals(name)) {
                result = true;
            } else {
                result = false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
