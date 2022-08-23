import javax.swing.JButton;
import javax.swing.JFrame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.FlowLayout;

public class Jan2 implements ActionListener{


	static JButton bt1 = new JButton("Fechar a Janelinha Filha");
	static JFrame jn2 = new JFrame("Janelinha Filha");
	static Jan2 j = new Jan2();


	public void actionPerformed(ActionEvent evt){
		if(evt.getSource().equals(bt1)){
			jn2.dispose();

		}
	}
	public void abreJan(){
		jn2.setDefaultCloseOperation(jn2.DISPOSE_ON_CLOSE);
		//jn2.setDefaultCloseOperation(jn2.EXIT_ON_CLOSE);
		jn2.setSize(400,400);	

		jn2.add(bt1);
	
		bt1.addActionListener(j);

		jn2.setLayout(new FlowLayout());
		jn2.setVisible(true);	
	}
}
