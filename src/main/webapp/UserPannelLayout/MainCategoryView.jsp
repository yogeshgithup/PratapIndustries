 <%@page import="java.util.ArrayList"%>
<%@page import="operation.Operation"%>
<%@page import="java.sql.Connection"%>
<%@page import="data.MainCategory"%>
<head>
        <%@include file="headerfiles.jsp" %>
         <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
         <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
         
         <link href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" rel="stylesheet">
         <script>
                   
         
           $(document).ready(function(){
   $('#myTable').dataTable( {
   
  "scrollY": 300,
        "scrollX": true
    
} );



});
                   
    
    </script>
     <style type="text/css">
  div.dataTables_wrapper {
        width: 1100px;
       
    }
         
         
  </style>
    </head>
    <body>
        
        <%@include file="leftpanel.jsp" %>
        <!-- Left Panel -->

        <!-- Right Panel -->

        <div id="right-panel" class="right-panel">

            <!-- Header-->
            <%@include file="header.jsp" %>
            <!-- Header-->

            <div class="content mt-3">
                <div class="animated fadeIn">
                       <div class="row">
                           <div class="col-lg-12">
                          
                                <div style="padding-bottom: 32px;">
                                    <p style="font-size: 22px; color: black; font-weight: 600;">View Main Category</p> 
                                </div>
                               


                       
                    
                    <div>
                    <table id="myTable" class="display" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Mid</th>
                <th>Category</th>
                <th>Action</th>
                </tr>
                 </thead>
        <tbody>
            <%
                ArrayList<MainCategory> as = (ArrayList<MainCategory>)session.getAttribute("record");
                if(as==null)
            { 
                Operation op = new Operation((Connection)application.getAttribute("con"));
               as=op.viewAllmainCategory();
            }
                for(int i=0;i<as.size();i++)
                {
                    MainCategory c=(MainCategory)as.get(i);    
                    int id=c.getMid();
                    String name = c.getMname();
                
                %>
                                
                                    
                                    <tr>
                                        <td><%=id%></td>
                                        <td><%=name%></td>
                                        <td> <a class="remove" id="<%= id%>" href="<%= application.getContextPath() %>/DeleteMainCategory?id=<%= id%>" >Remove</a>
                                      
                                        
                                    </tr>
                                    
                                    
                                      
                                
                                
            <% }
                session.removeAttribute("record");
            %>
           </tbody>                 
    </table>
        
                </div><!-- .animated -->
            </div><!-- .content -->
            </div>
                          
            </div> </div>


        </div><!-- /#right-panel -->

        <!-- Right Panel -->


        <%@include file="footerfiles.jsp" %>


    </body>
</html>
