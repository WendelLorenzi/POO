import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Calculadora implements ActionListener{

    static JTextField caixa1= new JTextField(10);
    static JTextField caixa2= new JTextField(10);
    static JTextField caixa3= new JTextField(10);
    static JFrame janela= new JFrame();
    static Calculadora c= new Calculadora();
    static JLabel rotulo1= new JLabel();
    static JLabel rotulo2= new JLabel();
    static JLabel rotulo3= new JLabel();
    static JButton botao1= new JButton();
    static JButton botao2= new JButton();
    static JButton botao3= new JButton();
    static JButton botao4= new JButton();
    static JButton botao5= new JButton();
    static JButton botao6= new JButton();
    static JButton botao7= new JButton();
    int num1= 0;
    int num2= 0;
    int resultado = 0;

    public static void main(String arg[]){

        int larg= 400;
        int alt= 600;
        janela.setSize(larg, alt);
        janela.setTitle("\t Calculadora");

        rotulo1.setText("Digite o primeiro numero: ");
        botao1.setText("OK");
        janela.add(rotulo1);
        janela.add(caixa1);
        janela.add(botao1);
        System.out.println("\n");

        rotulo2.setText("Digite o segundo numero: ");
        botao2.setText("OK");
        janela.add(rotulo2);
        janela.add(caixa2);
        janela.add(botao2);

        rotulo3.setText("Resultado: ");
        botao3.setText(" = ");
        janela.add(rotulo3);
        janela.add(caixa3);

        botao3.setText(" + ");
        botao4.setText(" - ");
        botao5.setText(" x ");
        botao6.setText(" / ");
        botao7.setText(" Limpar ");

        janela.add(botao3);
        janela.add(botao4);
        janela.add(botao5);
        janela.add(botao6);
        janela.add(botao7);

        botao1.addActionListener(c);
        botao2.addActionListener(c);
        botao3.addActionListener(c);
        botao4.addActionListener(c);
        botao5.addActionListener(c);
        botao6.addActionListener(c);
        botao7.addActionListener(c);

        janela.setLayout(new FlowLayout());
        janela.setVisible(true);
    } // Fim do main
    
    public void actionPerformed(ActionEvent evt){
        Object obj= evt.getSource();

        if(evt.getSource().equals(botao1)){
            num1= (Integer.parseInt());
            caixa2.requestFocus();
        }
        if(evt.getSource().equals(botao2)){
            num2= (Integer.parseInt(caixa2.getText()));
            caixa1.requestFocus();
        }
        if(evt.getSource().equals(botao3)){
            caixa3.setText("");
            resultado = num1 + num2;
            caixa3.setText(Integer.toString(resultado));
        }
        if(evt.getSource().equals(botao4)){
            caixa3.setText("");
            resultado= num1 - num2;
            caixa3.setText(Integer.toString(resultado));
        }
        if(evt.getSource().equals(botao5)){
            caixa3.setText("");
            resultado= num1 * num2;
            caixa3.setText(Integer.toString(resultado));
        }
        if(evt.getSource().equals(botao6)){
            caixa3.setText("");
            resultado= num1 / num2;
            caixa3.setText(Integer.toString(resultado));
        }
        if(evt.getSource().equals(botao7)){
            caixa3.setText("");
            caixa2.setText("");
            caixa1.setText("");
        }
    }
}