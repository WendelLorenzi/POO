import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class StorageMesa {
    private static StorageMesa instance;

    private List<Mestudo> vetEstudo;
    private List<Mcozinha> vetCozinha;


    private StorageMesa() {
        vetEstudo = new ArrayList<>();
        vetCozinha = new ArrayList<>();
    }

    public static StorageMesa getInstance() {
        if (instance == null) {
            instance = new StorageMesa();
        }
        return instance;
    }


    public void insereMesaEstudo(String cx1, String cx2, String cx3, String cx4, String cx5) {
        Mestudo m = new Mestudo();

        m.setPesosup(Integer.parseInt(cx1));
        m.setPreco(Integer.parseInt(cx2));
        m.setCor(cx3);
        m.getMadeira().setCidade(cx4);
        m.getMadeira().setCep(Integer.parseInt(cx5));
        vetEstudo.add(m);

    }

    public void insereMesaCozinha(String cx1, String cx2, String cx3, String cx4, String cx5) {
        Mcozinha c = new Mcozinha();

        c.setQtdCad(Integer.parseInt(cx1));
        c.setPreco(Integer.parseInt((cx2)));
        c.setCor((cx3));
        c.getMadeira().setCidade((cx4));
        c.getMadeira().setCep(Integer.parseInt((cx5)));
        vetCozinha.add(c);
    }

    public Mestudo consMesaEstudo(int i) {
        try {
            return vetEstudo.get(i);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nao encontrado", "Erro", 0);
            return null;
        }
    }

    public Mcozinha consMesaCozinha(int i) {
        try {
            return vetCozinha.get(i);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nao encontrado", "Erro", 0);
            return null;
        }
    }

    public void alteraMesaEstudo(int i, String cx2, String cx3, String cx4, String cx5, String cx6) {
        Mestudo est = consMesaEstudo(i);
        est.setPesosup(Integer.parseInt((cx2)));
        est.setPreco(Integer.parseInt((cx3)));
        est.setCor((cx4));
        est.getMadeira().setCidade((cx5));
        est.getMadeira().setCep(Integer.parseInt((cx6)));
    }

    public void alteraMesaCozinha(int i, String cx2, String cx3, String cx4, String cx5, String cx6) {
        Mcozinha coz = consMesaCozinha(i);
        coz.setQtdCad(Integer.parseInt((cx2)));
        coz.setPreco(Integer.parseInt((cx3)));
        coz.setCor((cx4));
        coz.getMadeira().setCidade((cx5));
        coz.getMadeira().setCep(Integer.parseInt((cx6)));
    }

    public void excluiMesaEstudo(int i) {
        vetEstudo.remove(i);
    }

    public void excluiMesaCozinha(int i) {
        vetCozinha.remove(i);
    }

}