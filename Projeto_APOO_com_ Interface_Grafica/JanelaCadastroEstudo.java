import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaCadastroEstudo implements ActionListener{

    static JButton botao1= new JButton(" Salvar ");
    static JButton botao2= new JButton(" Limpar ");
    static JButton botao3= new JButton("Sair da janela");
    static JLabel rotulo1= new JLabel("Digite o peso suportado: ");
    static JLabel rotulo2= new JLabel("Digite o preco: ");
    static JLabel rotulo3= new JLabel("Digite a cor: ");
    static JLabel rotulo4= new JLabel("Digite a cidade de onde veio a madeira: ");
    static JLabel rotulo5= new JLabel("Digite o CEP da cidade: ");
    static JFrame janela= new JFrame();
    static JanelaCadastroEstudo jce= new JanelaCadastroEstudo();
    static JTextField caixa1= new JTextField(15);
    static JTextField caixa2= new JTextField(15);
    static JTextField caixa3= new JTextField(15);
    static JTextField caixa4= new JTextField(15);
    static JTextField caixa5= new JTextField(15);

      public void abreJanEst(){
        int larg= 250;
        int alt= 500;
        janela.setSize(larg,alt);
        janela.setTitle("Cadastro Mesa Estudo");
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

      janela.add(botao1);
      janela.add(botao2);
      janela.add(botao3);
      
      	botao3.addActionListener(jce);
        botao1.addActionListener(jce);
        botao2.addActionListener(jce);

        janela.setLayout(new FlowLayout());
        janela.setVisible(true);

    }
 
        public void actionPerformed(ActionEvent evt){
        Object obj= evt.getSource();

         if(evt.getSource().equals(botao1)){
        StorageMesa st= StorageMesa.getInstance();
        st.insereMesaEstudo((caixa1.getText()), (caixa2.getText()), (caixa3.getText()),(caixa4.getText()), (caixa5.getText()));
         }
         if(evt.getSource().equals(botao2)){
          caixa1.setText("");
          caixa2.setText("");
          caixa3.setText("");
          caixa4.setText("");
          caixa5.setText("");
         }
         if(evt.getSource().equals(botao3)){
          janela.dispose();
         }
  }
}