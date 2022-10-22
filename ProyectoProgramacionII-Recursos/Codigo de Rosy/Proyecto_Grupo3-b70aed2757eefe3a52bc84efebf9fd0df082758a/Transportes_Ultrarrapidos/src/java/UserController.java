/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import Class.Entry;
import Class.EntryArray;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ramir
 */
@WebServlet(urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {
Entry entry;
EntryArray registerEntry;
StringBuffer objectResponse = new StringBuffer();
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
        try ( PrintWriter out = response.getWriter()) {
         /* TODO output your page here. You may use following sample code. */
           registerEntry= new EntryArray();
                           String control = request.getParameter("control");

                           if(control.toUpperCase().equals("SAVE")){
                                    entry = new Entry(
                                             request.getParameter("time"),
                                             Integer.parseInt(request.getParameter("day")),
                                            request.getParameter("monthYear"),
                                            request.getParameter("origin"),
                                            request.getParameter("cargoType"),
                                            request.getParameter("depot") 
                                    );
                                             registerEntry.registerEntry(entry);
                           }
                           else if(control.toUpperCase().equals("DELETE")){
                                    int codeDelete = Integer.parseInt(request.getParameter("id_Registro_Ingreso"));
                                    registerEntry.deleteEntry(codeDelete);
                           }
                           registerEntry.getEntry(objectResponse);
                        out.write(objectResponse.toString());

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
