package example9;
import javax.swing.*;

public class example9_1 extends JFrame {
	public example9_1() {
		setTitle("300x300 ���� ������ �����");
		setSize(300,300); // ������ ũ�� 300x300
		setVisible(true); // ������ ���
	}
	public static void main(String[] args) {
		example9_1 frame = new example9_1();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
