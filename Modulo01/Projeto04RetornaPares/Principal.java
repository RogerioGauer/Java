/**
 * Exercício para treinar os recursos vistos até agora:
 * - Classificação, organização dos atributos e métodos,
 * - e alguns recursos da linguagem (String, Array, etc).
 */

public class Principal
{
    /**
     * 
     */
    
    public static void main(String args[])
    {
        //Obter os dados que o usuário informa.
        int ini = Tela.retornaInt("Informe um número inteiro:");
        int fim = Tela.retornaInt("Informe outro número inteiro:");
        
        //Criar o objeto para processamento.
        Pares p = new Pares();
        String res = p.retornaNros(ini, fim);
        
        //Sair com o resultado.
        Tela.mostraTxt(res);
    }
}
