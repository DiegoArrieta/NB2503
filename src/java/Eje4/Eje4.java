/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje4;

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
public class Eje4 extends HttpServlet {

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
        MetodosEje4 x=new MetodosEje4();
        int num1, num2, num3;
        try {
            num1 = Integer.parseInt(request.getParameter(("txtNum1")));
            num2 = Integer.parseInt(request.getParameter(("txtNum2")));
            num3 = Integer.parseInt(request.getParameter(("txtNum3")));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Eje4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Eje4 at " + x.Ordenamiento(num1, num2, num3) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(NumberFormatException ex){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Eje4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ERROR</h1>");
            out.println("<img src=data:image/jpeg;base64,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>");
            out.println("</body>");
            out.println("</html>");
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
