/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import Entitiy.Material;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Database_material;
import model.WeeklyData;

/**
 *
 * @author m7md
 */
public class add_task extends HttpServlet {

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
        //id, name_material, task_lecture, task_sec, task_project, week_number, month_number
        response.setContentType("text/html;charset=UTF-8");
         HttpSession session=request.getSession(false);
       String name=request.getParameter("name");
       String lec=request.getParameter("lec");
        String sec=request.getParameter("sec");
         String task=request.getParameter("task");
          int week=Integer.parseInt(request.getParameter("week"));
           int month=Integer.parseInt(request.getParameter("month"));
           Database_material d=new Database_material();
           Material m=d.search_material(name);
           if(m.getName_material()!=null){
               WeeklyData dd=new WeeklyData();
       if(dd.insert_tasks(name,lec , sec,task,week,month)){
       session.setAttribute("message","تم اضافة التاسك بنجاح");
       
               
           }
      
       
       else{
           session.setAttribute("message","لم يتم اضافة التاسك حاول مرة اخري ");
       }
      
    
    }else{
                    session.setAttribute("message","لا يوجد ماده بهذا الاسم ");
      
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
