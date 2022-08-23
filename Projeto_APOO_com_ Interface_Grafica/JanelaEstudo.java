import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaEstudo implements ActionListener{

    static JFrame janela= new JFrame();
    static JButton botao1= new JButton("Cadastrar Mesa Estudo");
    static JButton botao2= new JButton("Consultar Mesa Estudo");
    static JButton botao3= new JButton("Alterar registro de Mesa Estudo");
    static JButton botao4= new JButton("Excluir registro");
    static JButton botao5= new JButton("Retornar a janela anterior");
    static JanelaEstudo j = new JanelaEstudo();

  public void abreJan2(){
        int larg= 300;
        int alt= 500;
        janela.setSize(larg,alt);
        janela.setTitle("Mesa Cozinha");

    janela.setDefaultCloseOperation(janela.DISPOSE_ON_CLOSE);

      janela.add(botao1);
      janela.add(botao2);
      janela.add(botao3);
      janela.add(botao4);
      janela.add(botao5);

    botao1.addActionListener(j);
    botao2.addActionListener(j);
    botao3.addActionListener(j);
    botao4.addActionListener(j);
    botao5.addActionListener(j);

        janela.setLayout(new FlowLayout());
        janela.setVisible(true);
    }

  public void actionPerformed(ActionEvent evt){
      Object obj= evt.getSource();

    if(evt.getSource().equals(botao1)){
        JanelaCadastroEstudo cad= new JanelaCadastroEstudo();
        cad.abreJanEst();
    }
    if(evt.getSource().equals(botao2)){
        JanelaConsultaEstudo cons= new JanelaConsultaEstudo();
        cons.abreJanConsEst();
    }
    if(evt.getSource().equals(botao3)){
        JanelaAlteraEstudo alt= new JanelaAlteraEstudo();
        alt.abreJanAltEst();
    }
    if(evt.getSource().equals(botao4)){
        JanelaExcluiEstudo ex= new JanelaExcluiEstudo();
        ex.abreJanExEst();
    }
    if(evt.getSource().equals(botao5)){
        janela.dispose();
    }
  }
}