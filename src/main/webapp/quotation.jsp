
<!DOCTYPE html>
<html>
    <head>
        <%@include file="homeHeaderfiles.jsp"%>
    </head>

    <body>
        <%@include file="homeHeaderContents.jsp"%>
      
      
<!-- register -->
	<div class="register">
		<div class="container">
			<h2>Quotation</h2>
			<div class="login-form-grids">
				<h5>information</h5>
				<form action="#" method="post">
					<input type="text" placeholder="First Name..." required=" " >
					<input type="text" placeholder="Last Name..." required=" " >
                                        <input type="text" placeholder="Contact number..." required=" " >                                                                                 
				</form>
				<div class="register-check-box">
					<div class="check">
						<label class="checkbox"><input type="checkbox" name="checkbox"><i> </i>Subscribe to Newsletter</label>
					</div>
				</div>
				<h6>information</h6>
					<form action="#" method="post">
                                            
					<input type="email" placeholder="Email Address" required=" " >
					<input type="password" placeholder="Password" required=" " >
					<input type="password" placeholder="Password Confirmation" required=" " >
					<div class="register-check-box">
						<div class="check">
							<label class="checkbox"><input type="checkbox" name="checkbox"><i> </i>I accept the terms and conditions</label>
						</div>
					</div>
					<input type="submit" value="Register">
				</form>
			</div>
			<div class="register-home">
				<a href="index.jsp">Home</a>
			</div>
		</div>
	</div>
<!-- //register -->
        
        <%@include  file="homeFooter.jsp"%>
        
    </body>
</html>