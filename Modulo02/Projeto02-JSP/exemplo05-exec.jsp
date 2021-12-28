<html>
 <head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
     <title>Exemplo05 - (exec)</title>
 </head>

 <body>     
     <h1>Exemplo05 - Processamento</h1>   

     <%
     String env = request.getParameter("env");
     
     if(env != null)//Se o botão Calcular("env") for clicado, executa o processamento abaixo.
     {
        String sn1 = request.getParameter("num1");
        String sn2 = request.getParameter("num2");
    
     
        try
        {
           int in1 = Integer.parseInt(sn1);
           int in2 = Integer.parseInt(sn2);

           if(in1 > in2)
           {
              int aux = in1;
              in1 = in2;
              in2 = aux;  
           }

           for(int i=in1; i<=in2; i++)
           {
              if(i % 2 == 1)
              {
                 out.print(i + " - ");
              } 
           }     
        }
        catch(Exception e){}
     }     
   
     else
     {
        //Se o botão Calcular("env") NÃO for clicado, irá para a página do parâmetro e mostrará na URL (bug=true).
        response.sendRedirect("exemplo05Form.jsp?bug=true");
     }
     %>
 </body>
</html>
