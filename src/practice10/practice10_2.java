package practice10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class practice10_2 extends JFrame{
	
	public practice10_2(){
		setTitle("�巡�뵿�� YELLO"); // ���� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener); 
		c.setBackground(Color.GREEN);
		setSize(400,200);
		setVisible(true);
	}
	//MouseMotionAdapter�� ��� �޴� MyMouseMotionAdapter Ŭ����
	class MyMouseListener implements MouseListener, 
	MouseMotionListener {
		
		public void mouseDragged(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseReleased(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN); 
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new practice10_2();
	}
	
}
