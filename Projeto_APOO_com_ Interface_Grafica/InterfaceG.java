import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceG implements ActionListener{

    static JFrame janela= new JFrame();
    static JButton botao1= new JButton();
    static JButton botao2= new JButton();
    static JButton botao3= new JButton();
    static InterfaceG i= new InterfaceG();

    public static void main(String arg[]){
        int larg= 500;
        int alt= 500;
        janela.setSize(larg, alt);
        janela.setTitle("\t Projeto Mesa");
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);

        botao1.setText("Mesa Cozinha");
        botao2.setText("Mesa Estudo");
        botao3.setText("Sair");

        janela.add(botao1);
        janela.add(botao2);
        janela.add(botao3);

        botao1.addActionListener(i);
        botao2.addActionListener(i);
        botao3.addActionListener(i);

        janela.setLayout(new FlowLayout());
        janela.setVisible(true); 
    }
  public void actionPerformed(ActionEvent evt){
        Object obj = evt.getSource();

        if(evt.getSource().equals(botao1)){
            JanelaCozinha jan2 = new JanelaCozinha();
            jan2.abreJan1();
        }
        if(evt.getSource().equals(botao2)){
            JanelaEstudo jan3 = new JanelaEstudo();
            jan3.abreJan2();
        }
        if(evt.getSource().equals(botao3)){
            janela.dispose();
        }
    }
}