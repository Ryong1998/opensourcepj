package practice9;

import javax.swing.*;
import java.awt.*;

public class practice9_4 extends JFrame {
	public practice9_4() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10)); //행과 열 수를 격자로 분할

		//색들을 배열로 생성
		Color[] colors = new Color[] { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, 
				Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
		
		for (int i=0;i<=9;i++) {
			JButton jb = new JButton(Integer.toString(i)); //숫자형을 문자형으로 변환(0->'0' 식으로)
			jb.setBackground(colors[i]); //colors 배열을 이용해서 배경색을 지정
			c.add(jb); //문자형으로 변환된 jb 달기
		}
		setSize(450, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new practice9_4();
	}
}
