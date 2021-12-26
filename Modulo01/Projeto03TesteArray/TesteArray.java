import java.util.*;//Importação da classe ArrayList

public class TesteArray
{
    public static void main(String args[])
    {
        //Podemos declarar variáveis para comportar mais de um valor(array).
        String[] nomes = new String[3];
        nomes[0] = "Ana";
        nomes[1] = "Pedro";
        nomes[2] = "Renata";
        
        int[] idades = new int[3];
        idades[0] = 12;
        idades[1] = 36;
        idades[2] = 74;
        
        System.out.println(nomes[0] + " com idade de " + idades[0]);
        System.out.println(nomes[1] + " com idade de " + idades[1]);
        System.out.println(nomes[2] + " com idade de " + idades[2]);
        
        
        //Podemos usar uma classe da linguagem para manipular vetores de qualquer coisa.
        ArrayList vetor = new ArrayList();
        vetor.add("Texto de teste A");
        vetor.add("Texto de teste B");
        vetor.add("Texto de teste C");   
          
        System.out.println("Quantidade de elementos adicionados: " + vetor.size());
        System.out.println(vetor.get(2));
    }
}
