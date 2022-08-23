import javax.swing.JOptionPane;


public class JanelaExcluiEstudo {
	public void abreJanExEst(){
		String a= "";
		a= JOptionPane.showInputDialog(null, "Digite a posicao na qual deseja excluir: ","Excluir Cozinha",JOptionPane.PLAIN_MESSAGE);
		StorageMesa sto= StorageMesa.getInstance();
		sto.excluiMesaEstudo(Integer.parseInt(a));
	}
}
