package com.layout;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border {
	public static void main(String[] args) {
	 new Border();
	}
JFrame f;

public Border() {
		f = new JFrame();
		JButton b1 = new JButton("North");
		JButton b2 = new JButton("South");
		JButton b3 = new JButton("West");
		JButton b4 = new JButton("East");
		JButton b5 = new JButton("Center");
		
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
