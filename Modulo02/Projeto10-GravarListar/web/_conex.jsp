<%-- 
    Document : conex
    Created on : 9 de set. de 2021, 11:56:14
    Author : Rogerio
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<%-- tag que faz a conexão com o BD e deixa uma variável com a referência --%>
<sql:setDataSource driver="com.mysql.jdbc.Driver"
                                 user="root"
                                 password=""
                                 url="jdbc:mysql://localhost/alfajava"
                                 var="con" />