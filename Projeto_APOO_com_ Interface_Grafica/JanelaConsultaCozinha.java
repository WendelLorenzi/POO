import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaConsultaCozinha implements ActionListener {

    static JButton botao1 = new JButton(" Consultar ");
    static JButton botao2 = new JButton(" Limpar ");
    static JButton botao3 = new JButton("Sair da janela");
    static JLabel rotulo1 = new JLabel("Digite a posicao que deseja consultar: ");
    static JLabel rotulo2 = new JLabel("Quantidade de cadeiras: ");
    static JLabel rotulo3 = new JLabel("Preco: ");
    static JLabel rotulo4 = new JLabel("Cor: ");
    static JLabel rotulo5 = new JLabel("Cidade de origem da madeira: ");
    static JLabel rotulo6 = new JLabel("CEP: ");
    static JFrame janela = new JFrame();
    static JanelaConsultaCozinha jcc = new JanelaConsultaCozinha();
    static JTextField caixa1 = new JTextField(10);
    static JTextField caixa2 = new JTextField(10);
    static JTextField caixa3 = new JTextField(10);
    static JTextField caixa4 = new JTextField(10);
    static JTextField caixa5 = new JTextField(10);
    static JTextField caixa6 = new JTextField(10);

    public void abreJanConsCoz() {
        int larg = 250;
        int alt = 500;
        janela.setSize(larg, alt);
        janela.setTitle("Consulta Mesa Cozinha");
        janela.setDefaultCloseOperation(janela.DISPOSE_ON_CLOSE);

        janela.add(rotulo1);
        janela.add(caixa1);

        janela.add(botao1);
        janela.add(botao2);

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

        janela.add(botao3);

        botao1.addActionListener(jcc);
        botao2.addActionListener(jcc);
        botao3.addActionListener(jcc);

        janela.setLayout(new FlowLayout());
        janela.setVisible(true);

    }

    public void actionPerformed(ActionEvent evt) {

        if (evt.getSource().equals(botao1)) {
            Mcozinha mcozinha = StorageMesa.getInstance().consMesaCozinha((Integer.parseInt(caixa1.getText())));
            if (mcozinha == null) return;
            caixa2.setText(String.valueOf(mcozinha.getQtdCad()));
            caixa3.setText(String.valueOf(mcozinha.getPreco()));
            caixa4.setText(mcozinha.getCor());
            caixa5.setText(mcozinha.getMadeira().getCidade());
            caixa6.setText(String.valueOf(mcozinha.getMadeira().getCep()));
        }
        if (evt.getSource().equals(botao2)) {
            caixa1.setText("");
        }
        if (evt.getSource().equals(botao3)) {
            janela.dispose();
        }
    }
}