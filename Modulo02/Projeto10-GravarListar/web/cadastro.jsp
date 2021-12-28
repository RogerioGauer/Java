<%-- 
    Document : cadastro
    Created on : 8 de set. de 2021, 19:08:09
    Author : Rogerio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ include file="_header.jsp" %>

<div id="content">
    <h1>Formulário para Gravar um Novo Curso</h1>

    <form action="exec" method="post">
        Nome do Curso: <br>
        <input type="text" name="nom" />
        <br><br>

        Descrição do Curso: <br>
        <textarea name="des" rows="5" cols="30"></textarea>
        <br><br>

        Valor de Venda: <br>
        <input type="number" name="val" />
        <br><br>

        <input type="submit" name="sub" value="Cadastrar" />
    </form>
</div>

<%@ include file="_footer.jsp" %>   

