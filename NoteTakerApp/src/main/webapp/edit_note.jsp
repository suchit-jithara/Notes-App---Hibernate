<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Note Page</title>
<jsp:include page="all_js_css.jsp"></jsp:include>
</head>
<body>
<div class="container lightpurple p-2">
		<jsp:include page="navbar.jsp"></jsp:include>

		<br>
		<h2>Edit your note detail</h2>
		<br>
		
		<form action="UpdateNotesServlet" method="post">
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
					name="title"
					value="<c:out value="${sessionScope.editNote.title}" />">
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
					name="content"
					><c:out value="${sessionScope.editNote.content}" /></textarea>
			</div>
			<input type="hidden" name="id" value="<c:out value="${sessionScope.editNote.id}" />">
			<div class="container text-center">
				<button type="submit" class="btn purple btn-dark">Add</button>
			</div>
		</form>
</div>
</body>
</html>