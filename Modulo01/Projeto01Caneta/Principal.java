public class Principal
{
    public static void main (String args[])
    {
        //Criação de um objeto "real" para uso
        Caneta bic = new Caneta();
        
        //e aqui o uso efetivo do objeto através do seu método
        bic.ajustarCor("azul");
        bic.ajustarTamanho(1);
        bic.escrever("teste bem sucedido");
    }
}
