import javax.swing.*;
import java.awt.event.*;

public class TesteInterface extends JFrame implements ActionListener   
{
    JPanel pan;
    JTextField txt;
    JButton btn;
    
    public TesteInterface(String tit)
    {
        super(tit);
        pan = new JPanel();
        txt = new JTextField(30);
        btn = new JButton("Clique aqui");        
        btn.addActionListener(this);//ActionListener = Escutador
        pan.add(txt);
        pan.add(btn);
        this.add(pan);
    }
    
    //Método que efetivamente "faz alguma coisa", quando for clicado o botão.
    //actionPerformed = método da classe ActionListener.    
    public void actionPerformed(ActionEvent ae)
    {
        txt.setText("Agora o usuário clicou no botão");
    }
}
