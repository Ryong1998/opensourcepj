package example10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class example10_1 extends JFrame {
	public example10_1() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); // Action 리스너 달기
		c.add(btn);
		setSize(350, 150);
		setVisible(true); 
	}
	public static void main(String [] args) {
		new example10_1();
	}
}

class MyActionListener implements ActionListener { 
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
		b.setText("액션");
		else
		b.setText("Action");
	}
}
