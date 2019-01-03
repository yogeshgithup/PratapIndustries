/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import data.MainCategory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import operation.Operation;

/**
 *
 * @author Chandni
 */
public class viewMainServlet extends HttpServlet {

    
      Connection c;
    ServletContext ctx;
public void init(ServletConfig sc)throws ServletException
      {
        super.init(sc);
        ctx=this.getServletContext();
      }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            doPost(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        c=(Connection)ctx.getAttribute("con");
            Operation op = new Operation(c);
            ArrayList<MainCategory> as = op.viewAllmainCategory();
             HttpSession hs = request.getSession(true);
            hs.setAttribute("record", as);
          String msg = null;
         // response.sendRedirect("MainCategoryView.jsp");
          response.sendRedirect(this.getServletContext().getContextPath()+"/UserPannelLayout/MainCategoryView.jsp?msg="+msg);
    
    }
      

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
