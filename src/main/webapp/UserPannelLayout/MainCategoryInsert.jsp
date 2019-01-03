<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*"%>

<% String msg = request.getParameter("msg");
    if(msg==null)
        msg="";
%> 

<head>
        <%@include file="headerfiles.jsp" %>
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


                        <div class="col-lg-6">
                            <div class="card">
                                <div class="card-header">
                                    <strong>Main Category</strong> Form
                                </div>
                                <div class="card-body card-block">
                                    <form action="${pageContext.request.contextPath}/Insert" method="post" role="form" class="form-horizontal">
                                       
                                        <div class="row form-group">
                                            <div class="col col-md-3"><label for="hf-password" class=" form-control-label">Category</label></div>
                                            <div class="col-12 col-md-9"><input type="text" id="text-input" name="addmaincategory" placeholder="Text" class="form-control"><small class="form-text text-muted">This is a help text</small></div>
                                        </div>
                                         <div class="card-footer">
                                  <button type="submit" class="btn btn-primary btn-sm" name="addmain">
                                        <i class="fa fa-dot-circle-o"></i> Submit ADD
                                    </button> 
                                  
                                              </div>
                                    </form>
                               
                               

                                </div>
                            </div>


                        </div>

                    </div>


                </div><!-- .animated -->
            </div><!-- .content -->


        </div><!-- /#right-panel -->

        <!-- Right Panel -->


        <%@include file="footerfiles.jsp" %>


    </body>
</html>
