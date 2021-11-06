package practice9;

import javax.swing.*;
import java.awt.*;

public class practice9_4 extends JFrame {
	public practice9_4() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10)); //��� �� ���� ���ڷ� ����

		//������ �迭�� ����
		Color[] colors = new Color[] { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, 
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
		
		for (int i=0;i<=9;i++) {
			JButton jb = new JButton(Integer.toString(i)); //�������� ���������� ��ȯ(0->'0' ������)
			jb.setBackground(colors[i]); //colors �迭�� �̿��ؼ� ������ ����
			c.add(jb); //���������� ��ȯ�� jb �ޱ�
		}
		setSize(450, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new practice9_4();
	}
}
