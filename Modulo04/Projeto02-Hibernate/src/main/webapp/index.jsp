<html>
<body>
<h2>Hello World!</h2>

<%@page import="javax.persistence.*"%>
<%@page import="model.*"%>

<%
EntityManagerFactory emf = Persistence.createEntityManagerFactory("Alfaloja-PU");
EntityManager em = emf.createEntityManager();

//Buscar um produto do banco de dados.
Produto objpro = em.find(Produto.class, 2);
System.out.println(objpro.getNome());
em.close();
emf.close();
%>	

</body>
</html>
