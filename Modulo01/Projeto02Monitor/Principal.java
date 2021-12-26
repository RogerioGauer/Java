//Classe principal de início do sistema.
public class Principal
{
    public static void main (String[] args)
    {
        //Criação do objeto.
        Monitor m1 = new Monitor();
        
        //Uso dos métodos disponíveis.
        m1.ligar();
        
        m1.exibirMensagem("Bem vindo");
        
        m1.ajustarResolucao(1600);
        
        m1.exibirMensagem("Cuide da postura");
        
        m1.desligar();
        
    }
}
