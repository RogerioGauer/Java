<%@page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projeto04 - SpringData</title>
</head>
<body>

<h1>Lista dos Produtos:</h1>

<a href="inserir.html">Cadastar Produto</a>
<br><br>

<c:forEach items="${produtos}" var="pro">
    ${pro.codigo} - ${pro.nome} <br>
</c:forEach>

</body>
</html>