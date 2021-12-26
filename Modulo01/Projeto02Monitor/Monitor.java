//Classe que representa os atributos e métodos de um monitor de computador.
public class Monitor
{
    //Atributos do monitor.
    private int resolucao;
    private String tipo;
    private String sep;
    
    //Método construtor serve para inicializar os dados do objeto.
    public Monitor()
    {
        this.tipo = "LED";
        this.ajustarResolucao(1024);
    }
    
    //Método que exibe mensagem na tela quando o monitor é ligado.
    public void ligar()
    {
        System.out.println("Ligando o monitor..."); 
        System.out.println("");
    }
    
    //Método que exibe mensagem após o monitor ligar.
    public void exibirMensagem(String txt)
    {
        System.out.println("");
        System.out.println(this.sep);
        System.out.println("Resolução atual: " + this.resolucao);
        System.out.println(txt);   
        System.out.println(this.sep);
        System.out.println("");
    }
          
    //Método para ajustar a resolução.
    public void ajustarResolucao(int resolucao)
    {
        if(resolucao != 1024 && resolucao != 1280 && resolucao != 1600)
        {
            this.resolucao = 1024;                
        }
        else
        {
            this.resolucao = resolucao;
        }
        this.ajustarSeparador();
    }
      
    //Método que exibe mensagem na tela quanto o monitor é desligado.
    public void desligar()
    {
        System.out.println("");
        System.out.println("Desligando o monitor...");        
    }
    
    //Método para ajustar o símbolo que representa a resolução.
    private void ajustarSeparador()
    {
        String sep = "";
        int qtd = (int) (this.resolucao/100);
        for(int i=0; i<qtd; i++)
        {
            sep += "-";                      
        }
        this.sep = sep;
    }
}
