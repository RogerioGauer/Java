public class TesteString
{
    public static void main(String args[])
    {
        //String é uma classe do Java, portanto, as variáveis são objetos.
        String texto1 = "Texto de teste para demonstrar métodos prontos";
        String texto2 = new String("Outro texto de teste para demonstrar métodos prontos");
        
        System.out.println( texto1.toUpperCase() );
        System.out.println( texto1.substring(4,25) );
        System.out.println( texto1.equals("é igual a?") );
        System.out.println( texto1.charAt(15) );
        
        //Declaramos um vetor (array) usando colchetes.
        //No Java, temos vetores com tipos definidos.
        String[] vetor = texto1.split(" ");
        System.out.println( vetor[4] );  
        
    }
}
