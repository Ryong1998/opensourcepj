package example5;

class Person_2 {
	private int weight;
	int age;
	protected int height;
	public String name;
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight() {
		return weight;
	}
}

class Student_2 extends Person_2 {
	public void set() {
		age = 30; // ���� Ŭ������ ����Ʈ ��� ���� ����
		name = "ȫ�浿"; // ���� Ŭ������ public ��� ���� ����
		height = 175; // ���� Ŭ������ protected ��� ���� ����
		// weight = 99; // ����. ���� Ŭ������ private ���� �Ұ�
		setWeight(99); // private ��� weight�� setWeight()���� ���� ����
	}
}

public class example5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_2 s = new Student_2();
		s.set();
		System.out.println("age:"+s.age+" name:"+s.name+" height:"+s.height+" weight:"+s.getWeight());
	}

}
