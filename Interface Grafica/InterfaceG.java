import javax.swing.JOptionPane;

public class InterfaceG {

    public static void main(String[] args) {
       
       String a=  JOptionPane.showInputDialog(null, "Digite o texto", JOptionPane.PLAIN_MESSAGE, lula1);
       JOptionPane.showMessageDialog(null, "Texto Digitado: "+ a, "Mensagem", JOptionPane.ERROR_MESSAGE);
        int b= JOptionPane.showConfirmDialog(null, "Texto", "Janela", JOptionPane.YES_NO_CANCEL_OPTION, lula2);
        if(b==0){
            JOptionPane.showMessageDialog(null, "CONFIRMADO" , "Mensagem de confirmação", JOptionPane.PLAIN_MESSAGE);
        }
    }
}