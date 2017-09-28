<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sous-Categories Yaka</title>
</head>
<body>

<h1>YAKA</h1>

<fieldset>
	<legend>Choisir une sous-categorie</legend>
		<c:set var="sousCategorie" value="${requestScope['sousCategories']}"></c:set>
		<ul>
			<c:forEach var="s" items="${sousCategories}">
				<li>
					<a href="${pageContext.request.contextPath}/spring/Produits">
						<c:out value="${s.nom}" />					
					</a>
				</li>			
			</c:forEach>
		</ul>
</fieldset>


</body>
</html>