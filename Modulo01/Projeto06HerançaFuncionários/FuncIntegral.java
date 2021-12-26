/**
 * Classe herdeira da classe Funcionario.  
 * @author (Rogério) 
 * @version (1.0)
 */

public class FuncIntegral extends Funcionario
{
    private double bas;
    
    /**
     * Construtor para objetos da classe FuncIntegral
     */
    
    public FuncIntegral(String nom, String ema, double bas)
    {
        //Chamando o método construtor da classe pai(Funcionario). 
        super(nom, ema);     
        
        //Inicialização de variável específica desta subclasse.
        this.bas = bas;
    }
    
    //Método para realizar o cálculo do salário.
    public double calcularSalario()
    {
        double sal = this.bas - (this.bas * this.TAX);
        return sal;
    }    
}
