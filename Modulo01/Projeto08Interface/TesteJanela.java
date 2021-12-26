import javax.swing.*;

public class TesteJanela
{
    public static void main(String args[])
    { 
        //Para criar uma janela, primeiro fazemos o "buraco".
        JFrame jan = new JFrame("Minha Janela");
        
        //Depois criamos uma "moldura" com "vidro".
        JPanel pan = new JPanel();
        
        //E então grudamos os "adesivos".
        JTextField txt = new JTextField(20);
        JLabel lab = new JLabel("Nome:");
        JButton btn = new JButton("Clique aqui");
        
        //Depois de criar todos os elementos é só "fixar".
        pan.add(lab); pan.add(txt); pan.add(btn);
        jan.add(pan);
        
        //Retoques finais (para ajustar o tamanho).
        jan.pack();
        
        //E por fim a inauguração.
        jan.setVisible(true);        
    }    
}
