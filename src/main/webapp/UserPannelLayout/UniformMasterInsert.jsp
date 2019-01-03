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

<div class="col-lg-8">
                    <div class="card">
                      <div class="card-header">
                        <strong>Basic Form</strong> Elements
                      </div>
                      <div class="card-body card-block">
                        <form action="" method="post" enctype="multipart/form-data" class="form-horizontal">
                          
                          <div class="row form-group">
                            <div class="col col-md-3"><label for="text-input" class=" form-control-label">Uniform Code</label></div>
                            <div class="col-12 col-md-9"><input type="text" id="text-input" name="text-input" placeholder="Text" class="form-control"><small class="form-text text-muted">This is a help text</small></div>
                          </div>
                          
                           <div class="row form-group">
                            <div class="col col-md-3"><label for="text-input" class=" form-control-label">Uniform Name</label></div>
                            <div class="col-12 col-md-9"><input type="text" id="text-input" name="text-input" placeholder="Text" class="form-control"><small class="form-text text-muted">This is a help text</small></div>
                          </div> 
                          
                          
                          <div class="row form-group">
                            <div class="col col-md-3"><label for="select" class=" form-control-label">Select Category</label></div>
                            <div class="col-12 col-md-9">
                              <select name="select" id="select" class="form-control">
                                <option value="0">Please select</option>
                                <option value="1">Option #1</option>
                                <option value="2">Option #2</option>
                                <option value="3">Option #3</option>
                              </select>
                            </div>
                          </div>
                            
                            <div class="row form-group">
                            <div class="col col-md-3"><label for="select" class=" form-control-label">Select Setname</label></div>
                            <div class="col-12 col-md-9">
                              <select name="select" id="select" class="form-control">
                                <option value="0">Please select</option>
                                <option value="1">Option #1</option>
                                <option value="2">Option #2</option>
                                <option value="3">Option #3</option>
                              </select>
                            </div>
                          </div>
                            
                         
                          <div class="row form-group">
                            <div class="col col-md-3"><label class=" form-control-label">Gender</label></div>
                            <div class="col col-md-9">
                              <div class="form-check-inline form-check">
                                <label for="inline-radio1" class="form-check-label ">
                                  <input type="radio" id="inline-radio1" name="inline-radios" value="option1" class="form-check-input">Male
                                </label>
                                <label for="inline-radio2" class="form-check-label ">
                                  <input type="radio" id="inline-radio2" name="inline-radios" value="option2" class="form-check-input">Female
                                </label>
                                
                              </div>
                            </div>
                          </div>
                            
                             <div class="row form-group">
                            <div class="col col-md-3"><label for="text-input" class=" form-control-label">Design</label></div>
                            <div class="col-12 col-md-9"><input type="text" id="text-input" name="text-input" placeholder="Text" class="form-control"><small class="form-text text-muted">This is a help text</small></div>
                          </div>
                          
                           <div class="row form-group">
                            <div class="col col-md-3"><label for="text-input" class=" form-control-label">Price</label></div>
                            <div class="col-12 col-md-9"><input type="text" id="text-input" name="text-input" placeholder="Text" class="form-control"><small class="form-text text-muted">This is a help text</small></div>
                          </div> 
                          
                            <div class="row form-group">
                            <div class="col col-md-3"><label for="text-input" class=" form-control-label">Minimum Qty to order</label></div>
                            <div class="col-12 col-md-9"><input type="text" id="text-input" name="text-input" placeholder="Text" class="form-control"><small class="form-text text-muted">This is a help text</small></div>
                          </div> 
                            
                            
                          <div class="row form-group">
                            <div class="col col-md-3"><label class=" form-control-label">Available Size</label></div>
                            <div class="col col-md-9">
                              <div class="form-check">
                                  
                                  <div class="checkbox">
                                  <label for="checkbox3" class="form-check-label ">
                                    <input type="checkbox" id="checkbox3" name="checkbox3" value="option3" class="form-check-input"> S
                                  </label>
                                </div>
                                <div class="checkbox">
                                  <label for="checkbox1" class="form-check-label ">
                                    <input type="checkbox" id="checkbox1" name="checkbox1" value="option1" class="form-check-input">M
                                  </label>
                                </div>
                                <div class="checkbox">
                                  <label for="checkbox2" class="form-check-label ">
                                    <input type="checkbox" id="checkbox2" name="checkbox2" value="option2" class="form-check-input"> L
                                  </label>
                                </div>
                                <div class="checkbox">
                                  <label for="checkbox3" class="form-check-label ">
                                    <input type="checkbox" id="checkbox3" name="checkbox3" value="option3" class="form-check-input"> XL
                                  </label>
                                </div>                                                                    
                              </div>
                            </div>
                          </div>
                            
                            
                            <div class="row form-group">
                            <div class="col col-md-3"><label class=" form-control-label">Available colors</label></div>
                            <div class="col col-md-9">
                              <div class="form-check">
                                <div class="checkbox">
                                  <label for="checkbox1" class="form-check-label ">
                                    <input type="checkbox" id="checkbox1" name="checkbox1" value="option1" class="form-check-input">Red
                                  </label>
                                </div>
                                <div class="checkbox">
                                  <label for="checkbox2" class="form-check-label ">
                                    <input type="checkbox" id="checkbox2" name="checkbox2" value="option2" class="form-check-input"> Blue
                                  </label>
                                </div>
                                <div class="checkbox">
                                  <label for="checkbox3" class="form-check-label ">
                                    <input type="checkbox" id="checkbox3" name="checkbox3" value="option3" class="form-check-input"> White
                                  </label>
                                </div>
                                  
                                  <div class="checkbox">
                                  <label for="checkbox3" class="form-check-label ">
                                    <input type="checkbox" id="checkbox3" name="checkbox3" value="option3" class="form-check-input"> Black
                                  </label>
                                </div>
                              </div>
                            </div>
                          </div>
                            
                            
                            <div class="row form-group">
                            <div class="col col-md-3"><label for="select" class=" form-control-label">Select Fabric</label></div>
                            <div class="col-12 col-md-9">
                              <select name="select" id="select" class="form-control">
                                <option value="0">Please select</option>
                                <option value="1">Option #1</option>
                                <option value="2">Option #2</option>
                                <option value="3">Option #3</option>
                              </select>
                            </div>
                          </div>
                            
                          
                          
                          <div class="row form-group">
                            <div class="col col-md-3"><label for="file-multiple-input" class=" form-control-label">Upload images</label></div>
                            <div class="col-12 col-md-9"><input type="file" id="file-multiple-input" name="file-multiple-input" multiple="" class="form-control-file"></div>
                          </div>
                        </form>
                      </div>
                      <div class="card-footer">
                        <button type="submit" class="btn btn-primary btn-sm">
                          <i class="fa fa-dot-circle-o"></i> Submit
                        </button>
                        
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
