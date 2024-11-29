<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add notes page</title>
<jsp:include page="all_js_css.jsp"></jsp:include>
</head>
<body>
	<div class="container lightpurple p-2">
		<jsp:include page="navbar.jsp"></jsp:include>

		<br>
		<h2>Please fill your note detail</h2>
			<br>	
		<!-- 	This is a add form  -->
		<form action="SaveNotesServlet" method="post">
			<div class="mb-3">
				<label 
					for="title" 
					class="form-label"> 
						Title
					</label> 
				<input
					type="text" 
					class="form-control" 
					id="title"
					aria-describedby="emailHelp" 
					required="required"
					name="title">
			</div>
			<div class="mb-3">
				<label 
					for="content" 
					class="form-label">
						Content
					</label>
				<textarea 
					class="form-control" 
					rows="11" 
					id="content" 
					required="required"
					name="content"></textarea>
			</div>
			<div class="container text-center">
				<button type="submit" class="btn purple btn-dark">Add</button>
			</div>
		</form>
	</div>
</body>
</html>