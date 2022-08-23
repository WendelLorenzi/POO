import javax.swing.JButton;
import javax.swing.JFrame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

public class Jan{

	static JButton bt1 = new JButton("Sair");
	static JButton bt2 = new JButton("Abrir a Janelinha Filha");
	static JFrame jn = new JFrame("Janelinha");

	public static void main(String arg[]){
		//jn.setDefaultCloseOperation(jn.EXIT_ON_CLOSE);
		jn.setDefaultCloseOperation(jn.DISPOSE_ON_CLOSE);
		jn.setSize(400,400);	

		jn.add(bt1);
		jn.add(bt2);
	
		bt1.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					jn.dispose();
				}
			}
		);
		bt2.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					Jan2 jn2 = new Jan2();
					jn2.abreJan();
				}
			}
		);

		jn.setLayout(new FlowLayout());
		jn.setVisible(true);	
	}

}
