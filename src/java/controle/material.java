/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Entitiy.Material;
import Entitiy.Student;
import Entitiy.Weekly;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.WeeklyData;

/**
 *
 * @author m7md
 */
public class material extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(false);
        String material = request.getParameter("material_name");
        Student student = (Student) session.getAttribute("student");
//        System.out.println(student.getName());
                

        WeeklyData data = new WeeklyData();
        boolean wd=data.get_s(material,student.getYear(),student.getSpecialization());
            //    System.out.println(wd.getName_material()+"**");

        Weekly weekly = data.get_date(material, student.getYear(), student.getSpecialization());
        
       // System.out.println(wd.getName_material()+"**");
        System.out.println(student.getName());
        System.out.println(weekly.getName_material());
        System.out.println(student.getYear());
        System.out.println(student.getSpecialization());
        System.out.println(material);
        String materail1 = weekly.getName_material();
        System.out.println(materail1);
        System.out.println("*****************");

        System.out.println(weekly.getTask_project());
        System.out.println(student.getYear());
        System.out.println(student.getSpecialization());
       String  message_materail="";
         if(!wd){
            session.setAttribute("material",material);
            message_materail="هذه المادة لا توجد داخل الجدول الخاص بك ";
        }
       else if (!material.equals(materail1)) {
             session.setAttribute("material", material);
            message_materail="لايوجد تاسك هذا الاسبوع";
        } else {
            session.setAttribute("material", weekly.getName_material());
            message_materail="التاسك المطلوب من المحاضرة : <br>"+weekly.getTask_lecture()+"<br>"
                    +"التاسك المطلوب من السكشن : <br>"+weekly.getTask_sec() +"<br>";
            
        }
         session.setAttribute("message_materail", message_materail);
            System.out.println(weekly.getTask_lecture()+"****");
         response.sendRedirect("material1.jsp");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
