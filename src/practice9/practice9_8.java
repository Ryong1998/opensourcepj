package practice9;
import java.awt.*; 
import javax.swing.*; 

class NorthPanel extends JPanel{ 
	public NorthPanel() { 
		setBackground(Color.LIGHT_GRAY); 
		add(new JButton("Open")); //�׳� add�� �ϸ� �˾Ƽ� ������ ������ �߰��� ��
		add(new JButton("Close")); 
		add(new JButton("Exit")); 
	} 
} 
class CenterPanel extends JPanel{ 
	public CenterPanel() { 
		setLayout(null); 
		for (int i = 0; i < 20; i++) { 
			int x = (int)(Math.random()*250); 
			int y = (int)(Math.random()*250); //�������� �� ����
			JLabel label=new JLabel("*"); //"*"��� ���ڿ��� ������ �ִ� label �󺧵� ����
			label.setForeground(Color.GREEN); //���� �ʷϻ����� ����
			label.setLocation(x,y); //��ġ ����
			label.setSize(20, 20); //������ ũ�� ����
			label.setOpaque(true); //���ȭ���� ���̰� ��
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
		setTitle("���� ���� �г��� ���� ������"); 
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


