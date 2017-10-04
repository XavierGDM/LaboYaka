<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Infos Produit</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/spring/categories"><h1>YAKA</h1></a>

		<c:set var="i" value="${requestScope['infosProduit']}"></c:set>
<fieldset>
	<legend>Infos Produit</legend>
			<c:out value="${i.nom}" /><br/>
			<img src="${pageContext.request.contextPath}/images/${i.image}"><br/>
			<c:out escapeXml="false" value="${i.desc_longue }"/><br/>
			<hr/>
</fieldset>

<fieldset>
	<legend>Sous produits</legend>
		<ul>
			<c:forEach var="p" items="${i.sousProduit}">
				<li>
					<c:out value="${p.nom}" /><br/>
					<img src="${pageContext.request.contextPath}/images/${p.vignette}">	<br/>
					<c:out value="${p.desc_courte }"/>	<br/>	
					<hr/>	
				</li>			
			</c:forEach>
		</ul>
</fieldset>

</body>
</html>