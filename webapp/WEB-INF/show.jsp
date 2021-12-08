<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container" style="margin-top: 20px">
	
	<h1><c:out value="${book.title }"/></h1>
		<h2>Description: <c:out value="${book.description }"/></h2>
		<h2>Language: <c:out value="${book.language }"/></h2>
		<h2>Number of Pages: <c:out value="${book.numberOfPages }"/></h2>
	</div>
	

</body>
</html>