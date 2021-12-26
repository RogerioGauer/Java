/**
 * Classe pai das classes herdeiras FuncHorista e FuncIntegral. 
 * @author (Rogério) 
 * @version (1.0)
 */

public abstract class Funcionario
{
    //final = constante. Preferencialmente digita-se em maiúsculo para diferenciar das variáveis.
    //Por ser protected, esta contaste poderá ser usada nas classes herdeiras, do contrário não poderia.
    protected final double TAX = 0.10;
    
    //Variáveis acessíveis nesta classe (Funcionario) e nas herdeiras (FuncHorista e FuncIntegral)
    private String nom;
    private String ema;
    
    /**
     * Construtor para objetos da classe Funcionario
     */
    
    public Funcionario(String nom, String ema)
    {
        this.nom = nom;
        this.ema = ema;        
    }  
    
    //Método que ajusta o nome do funcionário.
    public void setNome(String nom)
    {
        this.nom = nom;
    }
    
    //Método que ajusta o email do funcionário.
    public void setEmail(String ema)
    {
        this.ema = ema;
    }
    
    //Método que retorna o nome do funcionário.
    public String getNome()
    {
        return this.nom;
    }
    
    //Método que retorna o email do funcionário.
    public String getEmail()
    {
        return this.ema;
    }
    
    //Por ser uma classe abstract, as classes herdeiras (FuncHorista e FuncIntegral) são obrigadas a conter o método calcularSalario().  
    //A classe pai (Funcionario) também deverá ser abstract.
    public abstract double calcularSalario();    
}
