<html>
 <head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
     <title>Exemplo05 - JSP</title>
 </head>

 <body>     
     <h1>Exemplo05 - Formulário</h1>

     <form action="exemplo05-exec.jsp" method="POST">
     	Informe um número inteiro:
        <br>
     	<input type="number" name="num1">
        <br><br>
        
        Informe outro número inteiro: 
        <br> 
        <input type="number" name="num2">
        <br><br>

        <button name="env">Calcular</button>
     </form>    

     <%
     String bug = request.getParameter("bug");

     if(bug != null)
     {
        if(bug.equals("true"))
        {
            out.print("Informe os números pelo formulário");
        }                    
     }
     %>   
 </body>
</html>
