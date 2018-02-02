<div class="container">

	<div class="row">


		<!--  To display sidebar 3 column size -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>

		<!--  To display the result -->
		<div class="col-md-9">
		
			<div class="row">
		<div class="col-md-12">
			
			  <c:if test = "${userClickedAllproducts == true}">
			  <ol class = "breadcrumb">
			 <li> <a href="${contextRoot}/home"> Home</a> </li>
			 <li class="active">All products </li>
			</ol>
			</c:if>
			
			<c:if test = "${userClickedCategoryProducts == true}">
			 <ol class = "breadcrumb">
			 <li> <a href="${contextRoot}/home"> Home </a></li>
			 <li class="active"> Category</li>
			 <li class="active">${category.name}</li>
			 </ol>
			</c:if>
			
		
		</div>
	</div>
		
		
		</div>
			

	</div>
	

</div>
	