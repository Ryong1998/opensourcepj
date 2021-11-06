package practice9;

import java.awt.*; 
import javax.swing.*; 

public class practice9_2 extends JFrame { 
	public practice9_2() { 
			setTitle("BorderLayout Practice"); 
			setSize(400, 200); 
			setDefaultCloseOperation(EXIT_ON_CLOSE); 
			Container c = getContentPane(); 
			c.setLayout(new BorderLayout(5,7));  //¼öÆò5ÇÈ¼¿, ¼öÁ÷7ÇÈ¼¿
			c.add(new JButton("North"),BorderLayout.NORTH); //BorderLayout »ç¿ë
			c.add(new JButton("West"), BorderLayout.WEST); 
			c.add(new JButton("Center"), BorderLayout.CENTER); 
			c.add(new JButton("East"), BorderLayout.EAST); 
			c.add(new JButton("South"), BorderLayout.SOUTH); 
			setVisible(true); 
		} 
	public static void main(String[] args) { 
		new practice9_2(); 
	} 
}



