package practice7;
import java.util.*;

public class practice7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> manage = new HashMap<String, Integer>();//key�� �̸�, value�� ����Ʈ�� hashmap�� manage ����
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է� >> ");
			String name = scanner.next();
			if(name.equals("�׸�"))
				break;
			int point = scanner.nextInt();
			if(manage.get(name) == null) { //key�� name�� manage�� value�� ���� ���� ��
				manage.put(name, point); //�̸��� ������ manage�� �߰�
			}
			else {//key�� name�� manage�� value�� ���� ������, ������ point�� �Է¹��� point�� ���� ���� ����
				manage.put(name,  manage.get(name)+point);
			}
			
			Set<String> keys = manage.keySet(); //manage�� key���� ������ ���� keys��� �Ҷ�
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {//manage�� �ִ� ��� �̸��� ����Ʈ�� ���
				String people = it.next();
				Integer sum = manage.get(people);
				System.out.print("("+people+","+sum+")");
			}
			System.out.println();
		}
		scanner.close();
	}

}
