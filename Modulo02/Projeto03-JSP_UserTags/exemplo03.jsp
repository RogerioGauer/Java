<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>Exemplo03 - JSP</title>
</head>
<body>

	<h1> Exemplo03 - User TAGs. </h1>

	1) Declaração da "biblioteca de Tags" que será usada. Geralmente colocamos as Tags dentro de "/WEB-INF/tags" para não permitir acesso pelo navegador,
	somente pela programação.
	<br /><br />
	
	<%@ taglib tagdir="/WEB-INF/tags" prefix="ex" %>

	2) Depois é só usar. Funciona como um include...
	<br /><br />

    <ex:teste3 />

</body>
</html>