package example7;
import java.util.*;

class Student7_7 { // �л��� ǥ���ϴ� Ŭ����
	int id;
	String tel;
	public Student7_7(int id, String tel) {
		this.id = id; this.tel = tel;
	}
	public int getId() {
        return id;
    }
    public String getTel() {
        return tel;
    }
}
public class example7_7 {

	public static void main(String[] args) {
		// �л� �̸��� Student ��ü�� ������ �����ϴ� HashMap �÷��� ����
		HashMap<String, Student7_7> map = new HashMap<String, Student7_7>();
		
		// 3 ���� �л� ����
		map.put("Ȳ����", new Student7_7(1, "010-111-1111")); 
		map.put("���繮", new Student7_7(2, "010-222-2222"));
		map.put("�賲��", new Student7_7(3, "010-333-3333"));
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�˻��� �̸�?");
			String name = scanner.nextLine(); // ����ڷκ��� �̸� �Է�
			if(name.equals("exit"))
				break; // while ���� ��� ���α׷� ����
			
			Student7_7 student = map.get(name); // �̸��� �ش��ϴ� Student ��ü �˻�
			
			if(student == null)
				System.out.println(name + "�� ���� ����Դϴ�.");
			else
				System.out.println("id:" + student.getId() + ", ��ȭ:" + student.getTel());
		}
		System.out.println("�����մϴ�");
		scanner.close();
	}

}
