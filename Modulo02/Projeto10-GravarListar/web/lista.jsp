<%-- 
    Document : index
    Created on : 8 de set. de 2021, 11:16:57
    Author : Rogerio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%@ include file="_conex.jsp" %>
<%@ include file="_header.jsp" %>
	                                  
<div id="content">
    <h1>Lista dos Cursos Disponíveis</h1>    
    
    <%-- Usar JSTL para exibir os cursos --%>
    <c:catch var="ex">      
        
        <%-- tag que executa uma instrução sql e obtém o resultado --%>
        <sql:query var="res" dataSource="${con}">
            select * from curso
        </sql:query>

        <%-- tags para listar o resultado obtido na consulta --%>
        <c:forEach items="${res.rows}" var="linha">
            <strong>${linha.nome}</strong> - ${linha.valor}
            <br /><br />
        </c:forEach>	
            
    </c:catch>

    <c:if test="${ex != null}">
        Houve algum bug na execução da lista de produtos <br />           
    </c:if>        
</div>

<%@include file="_footer.jsp"%>
	
               