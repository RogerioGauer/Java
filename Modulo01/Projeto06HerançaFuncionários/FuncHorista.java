/**
 * Classe herdeira da classe Funcionario.  
 * @author (Rogério) 
 * @version (1.0)
 */

public class FuncHorista extends Funcionario
{
    private int qtd;
    private double val;
    
    /**
     * Construtor para objetos da classe FuncHorista
     */
    
    public FuncHorista(String nom, String ema, int qtd, double val)
    {
        //Chamando o método construtor da classe pai(Funcionario).
        super(nom, ema);         
        
        //Inicialização de outras variáveis específicas da classe.
        this.qtd = qtd;
        this.val = val;
    }
    
    //Método para realizar o cálculo do salário.
    public double calcularSalario()
    {
        double bas = this.qtd * this.val;
        double sal = bas - (bas * TAX);    
        return sal;
    }    
}
