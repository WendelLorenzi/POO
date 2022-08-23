import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCozinha implements ActionListener{

    static JFrame janela= new JFrame();
    static JButton botao1= new JButton("Cadastrar Mesa cozinha");
    static JButton botao2= new JButton("Consultar Mesa cozinha");
    static JButton botao3= new JButton("Alterar registro de Mesa Cozinha");
    static JButton botao4= new JButton("Excluir registro");
    static JButton botao5= new JButton("Retornar a janela anterior");
    static JanelaCozinha j = new JanelaCozinha();

      public void abreJan1(){
        int larg= 500;
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
        JanelaCadastroCozinha cad= new JanelaCadastroCozinha();
        cad.abreJanCoz();
    }
    if(evt.getSource().equals(botao2)){
        JanelaConsultaCozinha cons= new JanelaConsultaCozinha();
        cons.abreJanConsCoz();
    }
    if(evt.getSource().equals(botao3)){
        JanelaAlteraCozinha alt= new JanelaAlteraCozinha();
        alt.abreJanAltCoz();
    }
    if(evt.getSource().equals(botao4)){
        JanelaExcluiCozinha ex= new JanelaExcluiCozinha();
        ex.abreJanExCoz();
    }
    if(evt.getSource().equals(botao5)){
        janela.dispose();
    }
  }
}