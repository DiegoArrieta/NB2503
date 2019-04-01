/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

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
public class Ejercicio3 extends HttpServlet {

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
        int num1, num2, i;
        MetodoEjercicio3 x=new MetodoEjercicio3();
        try{
            num1 = Integer.parseInt(request.getParameter("txtNum1"));
            num2 = Integer.parseInt(request.getParameter("txtNum2"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultados Solicitados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Calculos para N1="+num1+" y N2="+num2+"</h1>");
            out.println("<table border=1>"
                    + "<tr>"
                    + "<td>N1</td><td>N2</td><td>OPERACION</td><td>RESULTADO</td>"
                    + "</tr>");
            out.println("<tr>"                   
                    + "<td>"+num1+"</td><td>"+num2+"</td><td>SUMA</td><td>"+x.calculo(num1, num2, "suma")+"</td>"
                    + "</tr>");
            out.println("<tr>"                   
                    + "<td>"+num1+"</td><td>"+num2+"</td><td>RESTA</td><td>"+x.calculo(num1, num2, "resta")+"</td>"
                    + "</tr>");
            out.println("<tr>"                   
                    + "<td>"+num1+"</td><td>"+num2+"</td><td>MULTIPLICACIÓN</td><td>"+x.calculo(num1, num2, "multiplicacion")+"</td>"
                    + "</tr>");
            out.println("<tr>"                   
                    + "<td>"+num1+"</td><td>"+num2+"</td><td>DIVISIÓN</td><td>"+x.calculo(num1, num2, "división")+"</td>"
                    + "</tr>");
            out.println("</table>");
            out.println("<br><br>");
            out.println(num1+" elevado a "+num2+" es: "+x.elevado(num1, num2));
            out.println("<br><br>");
            out.println("Mayor: "+x.numMayor(num1, num2));
            out.println("<br><br>");
            out.println("Suma Sucesiva: ");
            for(i=1;i<=num2;i++){
                out.println(num1);
                if(i!=num2){
                    out.println(" + ");
                }
                
                x.SumaSucesiva(num1);
            }
            out.println("="+x.ObtieneSuma());
            out.println("</html>");
        }
        catch(NumberFormatException ex){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultados Solicitados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error de Formato "+ex+"</h1>");
            out.println("<a href=/WebApplication1>Volver a intentarlo.</a>");
            out.println("</body>");
            out.println("</html>");
        }
        catch(ArithmeticException ex){
            out.println(" ");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Trabajador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error de Logica de Aritmetica</h1>");
            out.println("<a href=/WebApplication1>Volver</a>");
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
