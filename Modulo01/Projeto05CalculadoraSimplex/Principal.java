/**
 * Sistema que faz uma operação aritmética simples:
 * - Recebe dois números e um operador, e mostra o resultado.
 * - CALCULADORA SIMPLEX.
 * @author (Rogério) 
 * @version (1.0)
 */

public class Principal
{
    /**
     * Método principal.
     */  
    public static void main(String[] args)
    {
        double n1 = Tela.retornaDbl("Informe um valor:");
        String op = Tela.retornaTxt("Operação: (+, -, * , /)");
        double n2 = Tela.retornaDbl("Informe outro valor:");      
        
        double res = Calculadora.exec(n1, n2, op);
        
        Tela.mostraTxt("Resultado: " + res);
    }
}
