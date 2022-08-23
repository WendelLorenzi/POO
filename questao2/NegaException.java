import java.io.IOException;
import javax.swing.JOptionPane;

public class NegaException extends Exception{
    public void impErro() {
        JOptionPane.showMessageDialog(null," NUMERO NEGATIVO");
    }
}
