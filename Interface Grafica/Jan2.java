import javax.swing.JButton;
import javax.swing.JFrame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

public class Jan2{


	static JButton bt1 = new JButton("Fechar a Janelinha Filha");
	static JFrame jn2 = new JFrame("Janelinha Filha");

	public void abreJan(){
		jn2.setDefaultCloseOperation(jn2.DISPOSE_ON_CLOSE);
		//jn2.setDefaultCloseOperation(jn2.EXIT_ON_CLOSE);
		jn2.setSize(400,400);	

		jn2.add(bt1);
	
		bt1.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent evt){
					jn2.dispose();
				}
			}
		);

		jn2.setLayout(new FlowLayout());
		jn2.setVisible(true);	
	}
}
