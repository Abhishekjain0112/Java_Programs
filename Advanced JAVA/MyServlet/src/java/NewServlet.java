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
 * @author Abhishek
 */
public class NewServlet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
       PrintWriter out;
       out=response.getWriter();
       out.println("welcome to my First Servlet Do Get");
        
        
        
        
        
      //  processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
       PrintWriter out;
       String uname,upass;
       out=response.getWriter();
       out.println("<html>");
       out.println("<head><title>My First Servlet</title></head>");
       out.println("<body>");
       out.println("<center>");
       uname=request.getParameter("txtname");
       upass=request.getParameter("txtpass");

       if(uname.equals("online") && upass.equals("12345"))
       out.println("<font color=green size=10>You are Valid User</font>");
      
       else
           out.println("<font color=red size=10>You are Invalid User</font>");
     
       out.println("</center>");
       out.println("</body>");
       out.println("</html>");
        
        
        
        
        //processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
