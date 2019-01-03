<!DOCTYPE html>
<html>
    <head>
        <%@include file="homeHeaderfiles.jsp"%>
    </head>

    <body>
        <%@include file="homeHeaderContents.jsp"%>


<!-- breadcrumbs -->
	<div class="breadcrumbs">
		<div class="container">
			<ol class="breadcrumb breadcrumb1 animated wow slideInLeft" data-wow-delay=".5s">
				<li><a href="index.html"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
				<li class="active">Singlepage</li>
			</ol>
		</div>
	</div>
<!-- breadcrumbs -->
	<div class="products">
		<div class="container">
			<div class="agileinfo_single">
				
				<div class="col-md-4 agileinfo_single_left">
					<img id="example" src="images/hosp.jpg" alt=" " class="img-responsive">
				</div>
				<div class="col-md-8 agileinfo_single_right">
				<h2>HOSPITAL UNIFORM</h2>
					
					<div class="w3agile_description">
						<h4>Description :</h4>
						<p>Hospital Uniform for staff. You need to Order minimum 20 uniforms.</p>
					</div>
					<div class="snipcart-item block">
						<div class="snipcart-thumb agileinfo_single_right_snipcart">
							<h4 class="m-sing">Rs. 650 /piece </h4>
						</div>
						<div class="snipcart-details agileinfo_single_right_details">
							<form action="#" method="post">
								<fieldset>
									
									<input type="button" name="submit" onclick="alert('Added To Cart')" value="Add to cart" class="button">
								</fieldset>
							</form>
						</div>
					</div>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>

     <%@include  file="homeFooter.jsp"%>

    </body>
</html>