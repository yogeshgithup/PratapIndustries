/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import data.MainCategory;
import data.SetName;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Statement;
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
public class DeleteSetName extends HttpServlet {
     ServletContext ctx;
     Statement pstmt=null;
     Connection c=null;




    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               doPost(request,response);

       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String msg=null;
   
      
   
        c=(Connection)ctx.getAttribute("con");
        System.out.println("POSTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        
        if(request.getParameter("deletemain")!=null)
                {
                    try {
                       SetName mn = new SetName();
            
                     
                        if(c!=null)
                        {
                        Operation op = new Operation(c);

                       
                        op.deleteSetName(Integer.parseInt(request.getParameter("addmainid")));
                               
                                msg="Deleted Succesfully";
                        }
                        else
                        {
                            msg="Not Deleted";
                        }
                                
                    } catch (Exception ex) {
                            msg="Not deleted";
                    }
                    request.setAttribute("msg", msg);
                        
                        response.sendRedirect(this.getServletContext().getContextPath()+"/UserPannelLayout/SetnameInsert.jsp?msg="+msg);
                                     }
      
    }

    
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
