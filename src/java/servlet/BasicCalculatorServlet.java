/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jetnipit Morakot
 */
public class BasicCalculatorServlet extends HttpServlet {

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
        String button = request.getParameter("button");
        String number1 = request.getParameter("num1");
        String number2 = request.getParameter("num2");
        double numb1 = Double.parseDouble(number1);
        double numb2 = Double.parseDouble(number2);
        String result = "";
        
        if(button != null && button.equals("Add") )
        { double add = numb1 + numb2;
            result = String.valueOf(add);
        }
        else if(button != null && button.equals("Sub") )
        { double sub = numb1 - numb2;
            result = String.valueOf(sub);
        }
        else if(button != null && button.equals("Mul") )
        { double mul = numb1 * numb2;
            result = String.valueOf(mul);
        }
        else if(button != null && button.equals("Div") )
        {
            if (numb2 == 0)
            {
                result = "Error devide by 0";
            }
            else
            { double div = numb1 / numb2;
                result = String.valueOf(div);
            }
        }

        
        request.setAttribute("result" ,result);
        request.getRequestDispatcher("result.jsp").forward(request, response);
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
