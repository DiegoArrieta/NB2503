/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 15481567-8
 */
public class Trabajador extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String nombre;
        MetodoTrabajador x=new MetodoTrabajador();
        int sueldo, servicio;
        try {
            nombre=request.getParameter(("txtNombre"));
            sueldo=Integer.parseInt(request.getParameter(("txtSueldo")));
            servicio=Integer.parseInt(request.getParameter(("txtServicio")));      
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Trabajador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<table border=1>"
                    + "<tr>"
                    + "<td>Nombre:</td><td>"+ nombre +"</td></tr>"
                    + "<tr><td>Sueldo:</td><td>"+ sueldo +"</td></tr>"
                    + "<tr><td>Años de Servicio:</td><td>"+ servicio +"</td></tr>"
            );
            out.println("<tr><td>Bono:</td><td>" + x.calculoBono(sueldo, servicio) + "</td></tr></table>");
            out.println("<a href=/WebApplication1>Volver</a>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(Exception ex){}
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
