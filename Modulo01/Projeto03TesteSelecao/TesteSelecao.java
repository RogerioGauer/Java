import javax.swing.*;

public class TesteSelecao
{
    public static void main(String args[])
    {
        //Código que recebe a idade de um atleta e informa sua categoria.
        //05 a 12 - Infantil
        //13 a 20 - Juvenil
        //21 a 45 - Adulto
        //46 a 70 - Master
        
        String sida;
        sida = JOptionPane.showInputDialog("Informe a idade");
        int ida = Integer.parseInt(sida);
        
        String msg = ""; 
        if(ida < 5 || ida > 70)
        {
            msg = "Idade não permitida";             
        }
        else if(ida >= 5 && ida <= 12)        
        {
            msg = "Categoria Infantil";        
        }
        else if(ida >= 13 && ida <= 20)
        {
            msg = "Categoria Juvenil";
        }
        else if(ida >= 21 && ida <= 45)
        {
            msg = "Categoria Adulto";
        }
        else
        {
            msg = "Categoria Master";
        }
        
        JOptionPane.showMessageDialog(null, msg);
    }
}
