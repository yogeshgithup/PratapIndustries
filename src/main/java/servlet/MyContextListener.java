package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 *
 * @author Chandni
 */
public class MyContextListener implements  ServletContextListener {
     String driver,url,usr,pass;
    ServletContext ctx;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    ctx=sce.getServletContext();
    driver=ctx.getInitParameter("Driver");
    url=ctx.getInitParameter("url");
    usr=ctx.getInitParameter("user");
    pass=ctx.getInitParameter("pass");
        System.out.println("------------IN LISTENER-----------");
    try{
        Class.forName(driver);
        Connection c = DriverManager.getConnection(url,usr,pass);
        System.out.println("-----------------Connected");
        ctx.setAttribute("con", c);
    }
    catch(Exception e)
    {
        System.out.println("Context "+e.getMessage());
    }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ctx=sce.getServletContext();
        Connection c = (Connection)ctx.getAttribute("con");
        try {
            c.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
}
