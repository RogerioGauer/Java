<html>
 <head>
     <meta charset="UTF-8">
     <title>Exemplo04 - JSP</title>
 </head>

 <body>     
     <h1>Exemplo04 - Links</h1>   

     Ao clicar no link, serás direcionado para a página de processamento.
     <br><br>

     <a href="exemplo04-exec.jsp?codigo=123">Clique para processar</a>    
     <br><br>
     
     <%
     String bug = request.getParameter("bug");

     if(bug != null)
     {
        if(bug.equals("true"))
        {
            out.print("Código inválido");
        }                    
     }
     %>
 </body>
</html>
