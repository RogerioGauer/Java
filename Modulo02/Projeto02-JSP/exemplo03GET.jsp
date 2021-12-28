<html>
 <head>
     <meta charset="UTF-8">
     <title>Exemplo03 - JSP</title>
 </head>

 <body>     
     <h1>Exemplo03 - GET</h1>   

     - Testes enviando parâmetros para o servidor (GET).
     <br><br>

     <%
     String msg = "";

     try
     {
        //Recebe o parâmetro enviado pela URL.
        String sida = request.getParameter("idade");

        //O usuário digita idade=21, mas o JSP recebe idade="21", por isso a necessidade da conversão da String para um número inteiro.
        int iida = Integer.parseInt(sida); 
       

        //Processamento.
        if(iida >= 18)
        {
           msg = "Acesso Concedido";
        }
        else
        {
           msg = "Acesso Proibido";
        }
     }
     catch(NumberFormatException ne)
     {
        msg = "Bug ao tentar converter a idade " + ne.getMessage();
     }
     catch(Exception e)
     {
        msg = "Bug geral " + e.getMessage();
     }

     //Mostra no navegador.
     out.print(msg);
     %>
 </body>
</html>
