<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Yaka</title>
</head>
<body>

<h1>YAKA</h1>

<fieldset>
	<legend>Choisir une categorie</legend>
		<c:set var="categorie" value="${requestScope['categories']}"></c:set>
		<ul>
			<c:forEach var="c" items="${categorie}">
				<li>
					<a href="${pageContext.request.contextPath}/spring/sousCategorie?categ=${c.id}">
						<c:out value="${c.nom}" />					
					</a>
				</li>			
			</c:forEach>
		</ul>
</fieldset>


</body>
</html>