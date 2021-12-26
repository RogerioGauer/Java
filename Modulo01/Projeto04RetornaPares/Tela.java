import javax.swing.*;
/**
 * 
 */

public class Tela
{
    /**
     * 
     */
    
    public static int retornaInt(String txt)
    {
        //Usa o método do Java para abrir uma janela de diálogo, retornando uma String.
        String snum = JOptionPane.showInputDialog(txt);
        
        //Converter a String em um número.
        int inum = Integer.parseInt(snum);
        
        //Retornar para quem usar método.
        return inum;        
    }
    
    /**
     * 
     */
    
    public static void mostraTxt(String txt)
    {
        //Mostra na janela de diálogo o texto informado.
        JOptionPane.showMessageDialog(null, txt);
    }
}
