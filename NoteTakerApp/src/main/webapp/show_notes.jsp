<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">

<jsp:include page="all_js_css.jsp"></jsp:include>
</head>
<body>
	<div class="container lightpurple p-2">
		<jsp:include page="navbar.jsp"></jsp:include>

		<br>
		<h2>Please fill your note detail</h2>
		<br>

		<div class="container">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">Id</th>
						<th scope="col">Title</th>
						<th scope="col">Content</th>
						<th scope="col">Added Date</th>
						<th scope="col">Edit</th>
						<th scope="col">Delete</th>
					</tr>
				</thead>
				<tbody>

					<c:forEach var="i" items="${sessionScope.allNotes}">
						<tr>
							<th scope="row"><c:out value="${i.id}" /></th>
							<td><c:out value="${i.title}" /></td>
							<td><c:out value="${i.content}" /></td>
							<td><c:out value="${i.addedDate}" /></td>
							<td><a href="EditNoteServlet?id=<c:out value="${i.id}" />"
								type="button" class="btn"> <i
									class="fa-regular fa-pen-to-square"></i>
							</a></td>
							<td><a href="DeleteNoteServlet?id=<c:out value="${i.id}" />"
								type="button" class="btn"> <i class="fa-solid fa-trash"></i>
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>