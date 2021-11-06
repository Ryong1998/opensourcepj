package practice9;
import java.awt.*; 
import javax.swing.*; 

class NorthPanel extends JPanel{ 
	public NorthPanel() { 
		setBackground(Color.LIGHT_GRAY); 
		add(new JButton("Open")); //그냥 add를 하면 알아서 일직선 상으로 추가가 됨
		add(new JButton("Close")); 
		add(new JButton("Exit")); 
	} 
} 
class CenterPanel extends JPanel{ 
	public CenterPanel() { 
		setLayout(null); 
		for (int i = 0; i < 20; i++) { 
			int x = (int)(Math.random()*250); 
			int y = (int)(Math.random()*250); //랜덤으로 수 생성
			JLabel label=new JLabel("*"); //"*"라는 문자열을 가지고 있는 label 라벨들 생성
			label.setForeground(Color.GREEN); //색을 초록색으로 설정
			label.setLocation(x,y); //위치 설정
			label.setSize(20, 20); //문자의 크기 설정
			label.setOpaque(true); //배경화면이 보이게 함
			add(label); 
		} 
	} 
} 
class SouthPanel extends JPanel{ 
	public SouthPanel() { 
		setBackground(Color.YELLOW); 
		add(new JButton("Integer Input")); 
		add(new TextField(15)); 
	} 
} 
public class practice9_8 extends JFrame{ 
	public practice9_8(){ 
		setTitle("여러 개의 패널을 가진 프레임"); 
		setSize(300, 300); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(),BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		setVisible(true); 
	} 
	public static void main(String[] args) { 
		new practice9_8(); 
	} 
}


