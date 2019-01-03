/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import data.MainCategory;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import operation.Operation;

/**
 *
 * @author Chandni
 */
public class DeleteMainCategory extends HttpServlet {

     ServletContext ctx ;
    
     Connection c;
     public void init(ServletConfig sc)throws ServletException
      {
        super.init(sc);
        ctx=this.getServletContext();
      }
  
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       doPost(request,response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg=null;
     
        try{
                    c = (Connection)ctx.getAttribute("con");
                    if(c!=null)
                    {
                        Operation op = new Operation(c);
                       
                        
                       
                      
                        msg=op.deleteMainCategory(Integer.parseInt(request.getParameter("id")));
                        
                         
                        System.out.println(msg);
                        
                        response.sendRedirect(this.getServletContext().getContextPath()+"/viewMainServlet?msg="+msg);
                        //msg="Deleted Succesfully";
                        
                       
                        
                    }
                    else
                    {
                        System.out.println("Not Deleted"); 
                        msg="Not Deleted";
                    }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        
        
        
        
        
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
