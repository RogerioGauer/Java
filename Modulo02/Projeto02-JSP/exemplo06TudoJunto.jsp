<html>
 <head>
     <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
     <title>Exemplo06 - JSP</title>
 </head>

 <body>     
     <h1>Exemplo06 - Tudo Junto (Formulário e Processamento)</h1>
     
     <form action="exemplo06TudoJunto.jsp" method="POST">
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
     boolean bug = false;
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
        catch(Exception e)
        {
           bug = true;
        }
     }    

     else 
     {
        bug = true;
     }
     %> 

     <%
     //String bug = request.getParameter("bug");
     if(bug)
     {
        out.print("Informe os números pelo formulário");                      
     }
     %>   
 </body>
</html>
