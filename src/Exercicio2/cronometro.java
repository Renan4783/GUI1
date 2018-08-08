package Exercicio2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class cronometro implements ActionListener{
	
	JLabel jlab;
	long start;
	
	public cronometro(){
		JFrame jfrm = new JFrame("Um cronometro simples");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(230, 90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton jbtnStart = new JButton("Iniciar");
		JButton jbtnStop = new JButton("Parar");
		jbtnStart.addActionListener(this);
		jbtnStop.addActionListener(this);
		jfrm.add(jbtnStart);
		jfrm.add(jbtnStop);
		jlab = new JLabel("Pressione Iniciar para iniciar cronômetro.");
		jfrm.add(jlab);
		jfrm.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae){
		Calendar cal = Calendar.getInstance();
		if (ae.getActionCommand().equals("Iniciar")){
			start = cal.getTimeInMillis();
			jlab.setText("Cronometro Está executando");
		} else {
			jlab.setText("Tempo decorrido: " + (double) (cal.getTimeInMillis() - start)/1000);
		}
	}
	
	public static void main(String args[]){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new cronometro();
			}
		});
	}
}
