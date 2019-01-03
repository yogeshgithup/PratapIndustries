<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
        <%@include file="headerfiles.jsp" %>
    </head>
    <body>
        <!-- Left Panel -->

        <!-- /#left-panel -->
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
                                    <strong>Uniform size</strong> Form
                                </div>
                                <div class="card-body card-block">
                                    <form action="${pageContext.request.contextPath}/Insert" method="post" class="form-horizontal">
                                        <div class="row form-group">
                                            <div class="col col-md-3"><label for="hf-email" class=" form-control-label">Usid</label></div>
                                            <div class="col-12 col-md-9"><input type="text" id="text-input" name="uid" placeholder="Text" class="form-control"><small class="form-text text-muted">This is a help text</small></div>
                                        </div>
                                        <div class="row form-group">
                                            <div class="col col-md-3"><label for="hf-password" class=" form-control-label">Size</label></div>
                                            <div class="col-12 col-md-9"><input type="text" id="text-input" name="usize" placeholder="Text" class="form-control"><small class="form-text text-muted">This is a help text</small></div>
                                        </div>
                                        
                                        
                                        <div class="row form-group">
                                            <div class="col col-md-3"><label for="hf-password" class=" form-control-label">Detail</label></div>
                                           <div class="col-12 col-md-9"><input type="text" id="text-input" name="udetail" placeholder="Text" class="form-control"><small class="form-text text-muted">This is a help text</small></div>
                                        </div>
                                        <div class="card-footer">
                                    <button type="submit" class="btn btn-primary btn-sm" name="usize">
                                        <i class="fa fa-dot-circle-o"></i> Submit
                                    </button>
                                    </form>
                                </div>
                                

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
