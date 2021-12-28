<html>
 <head>
     <title>Exemplo02 - JSP</title>
 </head>

 <body>     
     <h1>Exemplo02 - Java Server Pages</h1>     

     <%
     //Declaração das variáveis.
     int ini = 10;     
     int fim = 30;
     int soma = 0;
     int cont = 0;
     String result = "";

     //Processamento. 
     for (int i=ini; i<=fim; i++)
     {
     	if (i % 2 == 0)
     	{
            result = result + i + " - ";
            cont++;  
            soma = soma + i;  
     	}
     }

     //Saída do resultado.
     out.print(result + "<br>");
     out.print("Quantidade de números pares: " + cont + "<br>");
     out.print("Soma dos números pares: " + soma + "<br>");
     %>
 </body>
</html>
