<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produits YAKA</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/spring/categories"><h1>YAKA</h1></a>

<fieldset>
	<legend>Nos Produits</legend>
		<c:set var="produits" value="${requestScope['produits']}"></c:set>
		<ul>
			<c:forEach var="p" items="${produits}">
				<li>
					<c:out value="${p.nom}" /><br/>
					<img src="${pageContext.request.contextPath}/images/${p.vignette}">	<br/>
					<c:out value="${p.desc_courte }"/>	<br/>
					<a href="${pageContext.request.contextPath}/spring/infosProduit?produit=${p.id}">Plus d'informations sur ce produit</a>	
					<hr/>	
				</li>			
			</c:forEach>
		</ul>
</fieldset>

</body>
</html>