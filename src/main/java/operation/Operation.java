/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;


import data.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletContext;

/**
 *
 * @author Chandni
 */
public class Operation {
    Connection c;
    public Operation()
        {
       c=null; 
        }
    public Operation(Connection c)
      {
        this.c=c;
      }
    public String insertMainCategory(MainCategory m)
         {
        PreparedStatement pstmt=null;
        String msg;
        String sql="insert into main_cat values(?,?)";
        
        
           
        try
        {
           
            c.setAutoCommit(false);
            pstmt=c.prepareStatement(sql);
            pstmt.setInt(1,m.getMid());
            pstmt.setString(2,m.getMname());
           
            int r=pstmt.executeUpdate();
      
            
            msg="inserted";

            c.commit();
            
        
        }
        catch(Exception e)
        {
            msg=e.getMessage();
            System.out.println("ERRORRRRRRRRRRRRRRRR"+msg);
          
        }
        System.out.println(msg);
        return msg;
    }
    public int getMID()
   { 
       PreparedStatement stmt;
       int  mid;
       int max=0;
       String sql="select substr(m_id,1,length(m_id)) data from main_cat";
        try
        {
            stmt=c.prepareStatement(sql);
            ResultSet rs=stmt.executeQuery(sql);
            
            while(rs.next())
            {
                mid = rs.getInt("data");
              if(max<mid)
              {
                  max=mid;
              }
             
            }
            max=max+1;
            stmt.close();
            rs.close();
        }
        catch(Exception e)
        { System.out.println(e.getMessage());
           
        }
      return max;
       
   
   }
     public ArrayList<MainCategory> viewAllmainCategory()
    {
        ArrayList<MainCategory> asj = new ArrayList<MainCategory>();
        PreparedStatement ps;
        String sql="select * from main_cat";
        try
        {
            ps=c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next())
            {
                MainCategory main = new MainCategory();
                main.setMid(rs.getInt("m_id"));
                main.setMname(rs.getString("m_name"));
           
           
                    asj.add(main);
                }
            ps.close();
            rs.close();
        }
        catch(SQLException ex)
        {
            
        
            }
        return asj;
    }
    
    public String insertSetName(SetName s)
            {
        PreparedStatement pstmt=null;
        String msg;
        String sql="insert into set_name values(?,?)";
        
        
           
        try
        {
            
            c.setAutoCommit(false);
            pstmt=c.prepareStatement(sql);
            pstmt.setInt(1,s.getSnid());
            pstmt.setString(2,s.getSnname());
           
            int r=pstmt.executeUpdate();            
            msg="inserted";

            c.commit();
            
        
        }
        catch(Exception e)
        {
            msg=e.getMessage();
            System.out.println("ERROR SETNAME INSERT"+msg);
          
        }
        System.out.println(msg);
        return msg;
           }
 public String insertSize(Size s)
            {
        PreparedStatement pstmt=null;
        String msg;
        String sql="insert into u_size values(?,?,?)";
        
        
           
        try
        {
            
            c.setAutoCommit(false);
            pstmt=c.prepareStatement(sql);
            pstmt.setInt(1,s.getUid());
            pstmt.setString(2,s.getUsize());
            pstmt.setString(3,s.getUdetail());
           
            int r=pstmt.executeUpdate();            
            msg="inserted";

            c.commit();
            
        
        }
        catch(Exception e)
        {
            msg=e.getMessage();
            System.out.println("ERROR SIZE INSERT"+msg);
          
        }
        System.out.println(msg);
        return msg;
    }
   public String insertFebric(Febric f)
              {
        PreparedStatement pstmt=null;
        String msg;
        String sql="insert into febric values(?,?,?)";
        
        
           
        try
        {
            
            c.setAutoCommit(false);
            pstmt=c.prepareStatement(sql);
            pstmt.setInt(1,f.getFid());
            pstmt.setString(2,f.getFsize());
            pstmt.setString(3,f.getFdetail());
           
            int r=pstmt.executeUpdate();            
            msg="inserted";

            c.commit();
            
        
        }
        catch(Exception e)
        {
            msg=e.getMessage();
            System.out.println("ERROR FEBRIC INSERT"+msg);
          
        }
        System.out.println(msg);
        return msg;
    }
           
           
     public String deleteSetName(int id)
            {
                ServletContext ctx = null;
                String msg=null;
                PreparedStatement ps;
                
             
                String sql = "delete from set_name where s_id=?";
                try
                {
                        ps=c.prepareStatement(sql);
                        ps.setInt(1, id);
                        int u=ps.executeUpdate();
                        
                        msg="Success";
                    
                }
                catch(SQLException ex)
                {
                    msg=ex.getMessage();
                }
                return msg;
            }
        
    public String deleteMainCategory(int id)
            {
                ServletContext ctx = null;
                String msg=null;
                PreparedStatement ps;
                
             
                String sql = "delete from main_cat where m_id=?";
                try
                {
                        ps=c.prepareStatement(sql);
                        ps.setInt(1, id);
                        int u=ps.executeUpdate();
                        
                        msg="Delete Success";
                    
                }
                catch(SQLException ex)
                {
                    msg=ex.getMessage();
                }
                return msg;
            }
    public String deleteFebric(int id)
            {
                ServletContext ctx = null;
                String msg=null;
                PreparedStatement ps;
                
             
                String sql = "delete from febric where f_id=?";
                try
                {
                        ps=c.prepareStatement(sql);
                        ps.setInt(1, id);
                        int u=ps.executeUpdate();
                        
                        msg="Success";
                    
                }
                catch(SQLException ex)
                {
                    msg=ex.getMessage();
                }
                return msg;
            }
     public String deleteSize(int id)
            {
                ServletContext ctx = null;
                String msg=null;
                PreparedStatement ps;
                
             
                String sql = "delete from u_size where us_id=?";
                try
                {
                        ps=c.prepareStatement(sql);
                        ps.setInt(1, id);
                        int u=ps.executeUpdate();
                        
                        msg="Success";
                    
                }
                catch(SQLException ex)
                {
                    msg=ex.getMessage();
                }
                return msg;
            }
    
  
    
}
