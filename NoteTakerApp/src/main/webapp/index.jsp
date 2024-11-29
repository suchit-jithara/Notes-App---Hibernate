<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Home Page</title>
<jsp:include page="all_js_css.jsp"></jsp:include>
</head>
<body>
<!-- 	    <h1>Jay Bhagvan</h1> -->

	<div class="container lightpurple p-2">
		<jsp:include page="navbar.jsp"></jsp:include>
		<br>
		
		<div class="card py-5">
		<img class="img-fluid mx-auto" style="max-with: 400px;" alt="Note Image" src="Images/sticky-notes.png">
		<h1 class="text-primary text-upercase text-center mt-3">Start Taking Your Notes</h1>
		<div class="container text-center">
		<a href="add_notes.jsp" class="btn btn-outline-primary">Start Here</a>
		</div>
		</div>
	</div>
</body>
</html>