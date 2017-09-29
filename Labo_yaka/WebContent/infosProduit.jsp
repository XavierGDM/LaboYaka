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

<fieldset>
	<legend>Infos Produit</legend>
		<c:set var="i" value="${requestScope['infosProduit']}"></c:set>
			<c:out value="${i.nom}" /><br/>
			<img src="${pageContext.request.contextPath}/images/${i.image}"><br/>
			<c:out escapeXml="false" value="${i.desc_longue }"/><br/>
			<hr/>
</fieldset>

</body>
</html>