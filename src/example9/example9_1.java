package example9;
import javax.swing.*;

public class example9_1 extends JFrame {
	public example9_1() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}
	public static void main(String[] args) {
		example9_1 frame = new example9_1();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
