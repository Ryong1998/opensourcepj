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
			int y = (int) (Math.random() * 200) + 50; //50에서 250사이의 x,y좌표 생성
			j.setLocation(x, y); //라벨의 위치 설정
			j.setSize(10, 10); //라벨의 크기 설정
			j.setOpaque(true); //라벨의 배경색이 보이게 함
			j.setBackground(Color.BLUE); //라벨의 색을 파란색으로 함
			c.add(j);//컨텐트팬에 컴포넌트 달기
		}
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new practice9_6();
	}
}