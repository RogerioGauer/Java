<html>
 <head>
     <meta charset="UTF-8">
     <title>Exemplo04 - (exec)</title>
 </head>

 <body>     
     <h1>Exemplo04 - Recebe o código e processa-o</h1>     

     <%
     //Declaração das variáveis.
     String scod = request.getParameter("codigo");
     boolean deucerto = false;

     //Processamento.
     try
     {
        int icod = Integer.parseInt(scod);

        if(icod == 123)
        {
            deucerto = true;
        }
     }
     catch(Exception e)
     {
        out.print("Problemas de acesso " + e.getMessage());
     }

     //Exibição de conteúdo.
     if(deucerto)
     {
        out.print("Seja bem-vindo");       

     }
     else
     {
        String voltar = "<a href='exemplo04Link.jsp?bug=true'> Voltar <a/>";
        out.print(voltar);
     }
     %>
 </body>
</html>
