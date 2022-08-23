import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaAlteraCozinha implements ActionListener{

    static JButton botao1= new JButton(" Limpar ");
    static JButton botao2= new JButton("Sair da janela");
    static JButton botao4= new JButton(" Alterar ");   
    static JLabel rotulo1= new JLabel("Digite a posicao que deseja alterar: ");
    static JLabel rotulo2= new JLabel("Digite a quantidade de cadeiras: ");
    static JLabel rotulo3= new JLabel("Digite o preco: ");
    static JLabel rotulo4= new JLabel("Digite a cor: ");
    static JLabel rotulo5= new JLabel("Digite a cidade de onde veio a madeira: ");
    static JLabel rotulo6= new JLabel("Digite o CEP da cidade: ");
    static JFrame janela= new JFrame();
    static JanelaAlteraCozinha jac= new JanelaAlteraCozinha();
    static JTextField caixa1= new JTextField(5);
    static JTextField caixa2= new JTextField(15);
    static JTextField caixa3= new JTextField(15);
    static JTextField caixa4= new JTextField(15);
    static JTextField caixa5= new JTextField(15);
    static JTextField caixa6= new JTextField(15);

      public void abreJanAltCoz(){
        int larg= 250;
        int alt= 500;
        janela.setSize(larg,alt);
        janela.setTitle("Altera Mesa Cozinha");
             janela.setDefaultCloseOperation(janela.DISPOSE_ON_CLOSE);
  
      janela.add(rotulo1);
      janela.add(caixa1);

      janela.add(rotulo2);
      janela.add(caixa2);

      janela.add(rotulo3);
      janela.add(caixa3);

      janela.add(rotulo4);
      janela.add(caixa4);

      janela.add(rotulo5);
      janela.add(caixa5);

      janela.add(rotulo6);
      janela.add(caixa6);

      janela.add(botao1);
      janela.add(botao2);
      janela.add(botao4);

        botao1.addActionListener(jac);
        botao2.addActionListener(jac);
        botao4.addActionListener(jac);

        janela.setLayout(new FlowLayout());
        janela.setVisible(true);

    }

        public void actionPerformed(ActionEvent evt){
        Object obj= evt.getSource();

         if(evt.getSource().equals(botao4)){
        StorageMesa s= StorageMesa.getInstance();
        s.alteraMesaCozinha(Integer.parseInt(caixa1.getText()), (caixa2.getText()), (caixa3.getText()),(caixa4.getText()), (caixa5.getText()), (caixa6.getText()));
         }
         if(evt.getSource().equals(botao1)){
          caixa1.setText("");
          caixa2.setText("");
          caixa3.setText("");
          caixa4.setText("");
          caixa5.setText("");
          caixa6.setText("");
         }
         if(evt.getSource().equals(botao2)){
          janela.dispose();
         }
  }
}