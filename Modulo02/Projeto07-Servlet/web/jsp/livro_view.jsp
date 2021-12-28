<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Livro de Visitas</title>
        <link href="../css/default.css" type="text/css" rel="stylesheet" />
    </head>

    <body>
        <div id="geral">

                <div id="header"> 
                </div>

                <div id="menu">
                    <a href="livro_view.jsp" title="Ver Recados">Ver Recados</a>
                    <a href="livro_form.jsp" title="Gravar Recado">Gravar Recado</a>
                </div>

                <div id="content">
                    <h1> Lista dos Recados Gravados </h1>

                    <jsp:useBean class="serv.FileData" id="arq" />

                    <c:forEach items="${arq.texto}" var="linha"> 

                            <c:set var="vet" value="${ fn: split(linha,'#')}"/>
                            ${vet [2]} <br>
                            ${vet [0]} | ${vet [1]}
                            <br><br> 

                    </c:forEach>                                    

                </div>

                <div id="footer">
                    by Alfamí­dia
                </div>                 
        </div>
    </body>
</html>