package practice9;

import javax.swing.*;
import java.awt.*;

public class practice9_6 extends JFrame {

	public practice9_6() {
		setTitle("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		for (int i = 0; i < 20; i++) {
			JLabel j = new JLabel(Integer.toString(i));
			int x = (int) (Math.random() * 200) + 50;
			int y = (int) (Math.random() * 200) + 50; //50���� 250������ x,y��ǥ ����
			j.setLocation(x, y); //���� ��ġ ����
			j.setSize(10, 10); //���� ũ�� ����
			j.setOpaque(true); //���� ������ ���̰� ��
			j.setBackground(Color.BLUE); //���� ���� �Ķ������� ��
			c.add(j);//����Ʈ�ҿ� ������Ʈ �ޱ�
		}
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new practice9_6();
	}
}