package Exercicio1;

import java.awt.*;

import javax.swing.*;

public class Exemplo1Swing {
	public Exemplo1Swing(){
		JFrame jfrm = new JFrame ("Uma aplicação simples Swing");
		jfrm.setLayout(new BorderLayout());
		jfrm.setSize(275, 275);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jlab1 = new JLabel(" Centro ");
		JLabel jlab2 = new JLabel(" Norte ");
		JLabel jlab3 = new JLabel(" Sul ");
		JLabel jlab4 = new JLabel(" Leste ");
		JLabel jlab5 = new JLabel(" Oeste ");
		jfrm.add(jlab1, BorderLayout.CENTER);
		jfrm.add(jlab2, BorderLayout.NORTH);
		jfrm.add(jlab3, BorderLayout.SOUTH);
		jfrm.add(jlab4, BorderLayout.EAST);
		jfrm.add(jlab5, BorderLayout.WEST);	
		jfrm.setVisible(true);
	}
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new Exemplo1Swing();
			}
		});
		
	}
}
