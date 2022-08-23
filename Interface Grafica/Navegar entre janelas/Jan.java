import javax.swing.JButton;
import javax.swing.JFrame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

public class Jan implements ActionListener{

	static JButton bt1 = new JButton("Sair");
	static JButton bt2 = new JButton("Abrir a Janelinha Filha");
	static JFrame jn = new JFrame("Janelinha");
	static Jan j = new Jan();

	public static void main(String arg[]){
		//jn.setDefaultCloseOperation(jn.EXIT_ON_CLOSE);
		jn.setDefaultCloseOperation(jn.DISPOSE_ON_CLOSE);
		jn.setSize(400,400);	

		jn.add(bt1);
		jn.add(bt2);
	
		bt1.addActionListener(j);
		bt2.addActionListener(j);

		jn.setLayout(new FlowLayout());
		jn.setVisible(true);	
	}

	public void actionPerformed(ActionEvent evt){
		if(evt.getSource().equals(bt1)){
			jn.dispose();
		}

		if(evt.getSource().equals(bt2)){
			Jan2 jn2 = new Jan2();
			jn2.abreJan();	
			
		}
	}
}
