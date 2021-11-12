package practice10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class practice10_4 extends JFrame{

	JLabel label; 
	String text = "Love Java";
	public practice10_4(){
		setTitle("Left 키로 문자열 이동"); 
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label= new JLabel(text);
		
		label.addKeyListener(new MyKeyAdapter());
		
		label.setSize(200,50);
		add(label);
		setSize(400,200);
		setVisible(true);
		label.setFocusable(true);
		label.requestFocus();
		
	}
	class MyKeyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch(keyCode) { 
				case KeyEvent.VK_LEFT: 
					text = text.substring(1)+text.substring(0, 1);
					label.setText(text); 
					break;
				default:
					break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new practice10_4();
	}
	

}
