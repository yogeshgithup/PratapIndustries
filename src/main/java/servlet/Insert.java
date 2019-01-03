
package servlet;

import data.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
public class Insert extends HttpServlet {
     ServletContext ctx;
     Statement pstmt=null;
     Connection c=null;

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
       
      
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String msg=null;
   
        c=(Connection)ctx.getAttribute("con");
        System.out.println("POSTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        
        if(request.getParameter("addmain")!=null)
                {
                    try {
                        MainCategory mn = new MainCategory();
                        Operation op = new Operation(c);
                      
                    
                      
                        mn.setMid(op.getMID());
                        mn.setMname(request.getParameter("addmaincategory"));
                        
                     
                        if(c!=null)
                        {
                        

                       
                        
                                op.insertMainCategory(mn);
                                msg="Maincategory Inserted Succesfully";
                        }
                        else
                        {
                            msg="Not Inserted";
                        }
                                
                    } catch (Exception ex) {
                            msg="Not Inserted";
                    }
                    request.setAttribute("msg", msg);
                        
                        response.sendRedirect(this.getServletContext().getContextPath()+"/UserPannelLayout/MainCategoryInsert.jsp?msg="+msg);
                        //request.getRequestDispatcher("MainCategory.jsp?add="+null).forward(request, response);
                }
        if(request.getParameter("addset")!=null)
                {
                    try {
                        SetName mn = new SetName();
                      
                    
                      
                        mn.setSnid(Integer.parseInt(request.getParameter("addsetid")));
                        mn.setSnname(request.getParameter("addsetname"));
                        
                     
                        if(c!=null)
                        {
                        Operation op = new Operation(c);

                       
                        
                                op.insertSetName(mn);
                                msg="SetName Inserted Succesfully";
                        }
                        else
                        {
                            msg="Not Inserted";
                        }
                                
                    } catch (Exception ex) {
                            msg="Not Inserted";
                    }
                    request.setAttribute("msg", msg);
                      response.sendRedirect(this.getServletContext().getContextPath()+"/UserPannelLayout/SetnameInsert.jsp?msg="+msg);
                        
                     
                        
                }
                if(request.getParameter("usize")!=null)
                {
                    try {
                        Size mn = new Size();
                      
                    
                      
                        mn.setUid(Integer.parseInt(request.getParameter("uid")));
                        mn.setUsize(request.getParameter("usize"));
                         mn.setUdetail(request.getParameter("udetail"));
                        
                     
                        if(c!=null)
                        {
                        Operation op = new Operation(c);

                       
                        
                                op.insertSize(mn);
                                msg="Size Inserted Succesfully";
                        }
                        else
                        {
                            msg="Not Inserted";
                        }
                                
                    } catch (Exception ex) {
                            msg="Not Inserted";
                    }
                    request.setAttribute("msg", msg);
                      response.sendRedirect(this.getServletContext().getContextPath()+"/UserPannelLayout/UniformSizeInsert.jsp?msg="+msg);
                        
                     
                        
                }
                 if(request.getParameter("addset")!=null)
                {
                    try {
                        SetName mn = new SetName();
                      
                    
                      
                        mn.setSnid(Integer.parseInt(request.getParameter("addsetid")));
                        mn.setSnname(request.getParameter("addsetname"));
                        
                     
                        if(c!=null)
                        {
                        Operation op = new Operation(c);

                       
                        
                                op.insertSetName(mn);
                                msg="SetName Inserted Succesfully";
                        }
                        else
                        {
                            msg="Not Inserted";
                        }
                                
                    } catch (Exception ex) {
                            msg="Not Inserted";
                    }
                    request.setAttribute("msg", msg);
                      response.sendRedirect(this.getServletContext().getContextPath()+"/UserPannelLayout/SetnameInsert.jsp?msg="+msg);
                        
                     
                        
                }
                if(request.getParameter("febric")!=null)
                {
                    try {
                        Febric mn = new Febric();
                      
                    
                      
                        mn.setFid(Integer.parseInt(request.getParameter("fid")));
                        mn.setFsize(request.getParameter("fsize"));
                        mn.setFdetail(request.getParameter("fdetail"));
                        
                     
                        if(c!=null)
                        {
                        Operation op = new Operation(c);

                       
                        
                                op.insertFebric(mn);
                                msg="Febric Inserted Succesfully";
                        }
                        else
                        {
                            msg="Not Inserted";
                        }
                                
                    } catch (Exception ex) {
                            msg="Not Inserted";
                    }
                    request.setAttribute("msg", msg);
                      response.sendRedirect(this.getServletContext().getContextPath()+"/UserPannelLayout/UniformFebricInsert.jsp?msg="+msg);
                        
                     
                        
                }
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    public void init(ServletConfig sc)throws ServletException
      {
       
            super.init(sc);
       
            ctx=this.getServletContext();
        
    
    
  }

}
