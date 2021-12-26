//Classe para representar um objeto caneta e suas funcionalidades
public class Caneta
{
    //Características da caneta representadas por variáveis
    String cor;
    int tamanho;
    
    //Funcionalidades da caneta representadas por métodos:
    
    //Método que ajusta a cor da caneta
    public void ajustarCor(String cor)
    {  
        this.cor = cor;        
    }
    
    //Método que ajusta a ponta da caneta
    public void ajustarTamanho(int tamanho)
    {
        this.tamanho = tamanho;
    }
    //Método que escreve com a caneta
    public void escrever(String txt)
    {
        System.out.println("Cor da tinta: " + this.cor);
        System.out.println("Tamanho da ponta: " + this.tamanho);
        System.out.println("Texto informado: " + txt);            
    }
    
}
