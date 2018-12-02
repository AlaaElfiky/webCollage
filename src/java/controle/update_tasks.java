/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import Entitiy.Weekly;
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
public class update_tasks extends HttpServlet {

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
       HttpSession session=request.getSession(false);
            Weekly w=(Weekly)session.getAttribute("weekly");
   
        String name_material = request.getParameter("name_material");
        String task_lecture = request.getParameter("task_lecture");
        String task_sec=request.getParameter("task_sec");
        String task_project=request.getParameter("task_project");
        int week_number=Integer.parseInt(request.getParameter("week_number"));
        int month_number=Integer.parseInt(request.getParameter("month_number"));
       WeeklyData w1=new WeeklyData();
        System.out.println("********************");
        System.out.println(w.getId());
        System.out.println(name_material);
        System.out.println(week_number);
        System.out.println(month_number);
        System.out.println(task_lecture);
        System.out.println(task_sec);
        System.out.println("********************");
       String message=w1.updata_weekly(w.getId(), name_material, week_number, month_number, task_lecture, task_sec, task_project);
      //w1.updata_weekly(w.getId(),name_material,  week_number, month_number, task_lecture , task_sec,task_project);
        session.setAttribute("message",message);
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
