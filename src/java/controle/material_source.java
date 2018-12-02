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
public class material_source extends HttpServlet {

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
        String material=request.getParameter("material_name");
        Student student=(Student) session.getAttribute("student");
        System.out.println(student.getName());
        WeeklyData data=new WeeklyData();
        Material  material1=data.get_source(material,student.getYear(),student.getSpecialization());
        System.out.println("************");
        System.out.println(student.getName());
        System.out.println(student.getYear());
        System.out.println(student.getSpecialization());
        System.out.println(material);
        //System.out.println(source);
        System.out.println("*****************");
        if(!material.equals(material1.getName_material()))
        {
            session.setAttribute("message","هذه الماد ليست ضمن جدوالك  الدراسي لهذا الترم ");
            session.setAttribute("material",material);
            response.sendRedirect("Project.jsp");
        }
        else
                {
            session.setAttribute("source",material1.getSource_material());
            response.sendRedirect("Source_material.jsp");

                        }
    
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
