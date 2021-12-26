import javax.swing.*;

public class TesteJanela
{
    public static void main(String args[])
    {
        String sida;
        //Sempre virá um texto (String).
        sida = JOptionPane.showInputDialog("Digite sua idade");
        
        //Mas eu posso usar uma classe para converter.
        //Neste caso, converte uma String no formato de número.
        //Exemplo: "123" para 123.
        int ida = Integer.parseInt(sida);
        
        String msg = "";
        if(ida >= 18)
        {
            msg = "Inscrição permitida";
        }
        else
        {
            msg = "Inscrição não permitida";
        }
        
        //Mostra uma mensagem na janela de diálogo.
        JOptionPane.showMessageDialog(null, msg);        
    }
}
