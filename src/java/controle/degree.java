/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import Entitiy.Student;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Database_material;
import model.Database_student;

/**
 *
 * @author m7md
 */
public class degree extends HttpServlet {

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
         HttpSession session=request.getSession();
//   id, student_id, material_name, applied, final, year
      int student_id=Integer.parseInt(request.getParameter("student_id"));
    String material_name=request.getParameter("material_name");
    int applied=Integer.parseInt(request.getParameter("applied"));
    int finall=Integer.parseInt(request.getParameter("final"));
    int year=Integer.parseInt(request.getParameter("year"));
    Student student=new Student();
    Database_student d=new Database_student();
    Database_material d1=new Database_material();
        System.out.println(material_name);
    if(d.search_by_id(student_id).getName()==""||d.search_by_id(student_id).getName()==null){
         session.setAttribute("message","لا يوجد طالب بهذا الكود ");
        
    }else if(!d1.check(material_name)){
        session.setAttribute("message","لا يوجد ماده بهذا الاسم  ");
   
    }else if((applied+finall)>100){
         session.setAttribute("message","هذه الدرجة غير منطقية  ");
    }else if(d1.insert_result(student_id, material_name, applied,finall, year)) {
        
        session.setAttribute("message","تم اضافة الدرجات هذه المادة   ");
    }
             response.sendRedirect("Message_admin.jsp");

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
