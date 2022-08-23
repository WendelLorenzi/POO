import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem ;


import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prv2 implements ActionListener {
    static Prv2 p = new Prv2();
    static JFrame janela = new JFrame();

    static JLabel rtl1 = new JLabel();
    static JLabel rtl2 = new JLabel();
    static JLabel rtl3 = new JLabel();

    static JTextField cx1 = new JTextField(5);
    static JTextField cx2 = new JTextField(5);
    static JTextField cx3 = new JTextField(5);

    static JButton bt1 = new JButton();
    static JButton bt2 = new JButton();
    static JButton bt3 = new JButton();
    static JButton bt4 = new JButton();

    public static void main(String[] args) {
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        int largura = 300;
        int altura = 200;

        janela.setSize(largura, altura);
        janela.setTitle("Calculadora");

        rtl1.setText("Valor 1");
        rtl2.setText("Valor 2");
        rtl3.setText("Resultado");

        bt1.setText("+");
        bt2.setText("-");
        bt3.setText("Limpar");
        bt4.setText("Sair");

        janela.add(rtl1);
        janela.add(cx1);

        janela.add(rtl2);
        janela.add(cx2);

        janela.add(rtl3);
        janela.add(cx3);

        janela.add(bt1);
        janela.add(bt2);
        janela.add(bt3);
        janela.add(bt4);

        bt1.addActionListener(p);
        bt2.addActionListener(p);
        bt3.addActionListener(p);
        bt4.addActionListener(p);

        janela.setLayout(new FlowLayout());
        janela.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {

        if(evt.getSource().equals(bt1)) {
            try{
                int valor1 = Integer.parseInt(cx1.getText());
                int valor2 = Integer.parseInt(cx2.getText());
                int resultado = soma(valor1,valor2);
                cx3.setText(Integer.toString(resultado));
            } catch (DezException d){
                d.impErro();
            }
        }
        if(evt.getSource().equals(bt2)) {
            try{
                int valor1 = Integer.parseInt(cx1.getText());
                int valor2 = Integer.parseInt(cx2.getText());
                int resultado = sub(valor1,valor2);
                cx3.setText(Integer.toString(resultado));
            } catch (NegaException n){
                n.impErro();
            }
        }
        if(evt.getSource().equals(bt3)) {
            cx1.setText("");
            cx2.setText("");
            cx3.setText("");
            cx1.requestFocus();
        }
        if(evt.getSource().equals(bt4)) {
            janela.dispose();
        }
    }

    public int soma(int valor1, int valor2) throws DezException{
      int resultado;
      resultado = valor1 + valor2;
      if(resultado>10){
        throw new DezException();
      }else{
        return resultado;
      }
    }

    public int sub(int valor1, int valor2) throws NegaException{
      int resultado;
      resultado= valor1 - valor2;
      if(resultado < 0){
        throw new NegaException();
      }else{
        return resultado;
      }

    }
}
