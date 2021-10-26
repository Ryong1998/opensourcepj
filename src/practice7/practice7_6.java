package practice7;
import java.util.*;

class Location7_6{
	private String city;
	private int latitude,longitude;
	
	public Location7_6(String city,int longitude,int latitude) {
		this.city=city;//���� �̸� �Ҵ�
		this.longitude=longitude; //�浵 �� �Ҵ�
		this.latitude=latitude; // ���� �� �Ҵ�
	}
	public void show() {
		System.out.println(city+"\t"+longitude+"\t"+latitude); // ����   �浵   ����  ���
	}
}
public class practice7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Location7_6> map = new HashMap<String, Location7_6>(); //String,Location7_6�� �Է� �޴� HashMap�� map�� ����(���̽��� ������ ��)
		System.out.println("����,�浵,������ �Է��ϼ���.");
		for(int i =0 ;i<4;i++) {
			System.out.print(">> ");
			String text=scanner.nextLine();//text�� �� ���� �Է¹���
			StringTokenizer txt=new StringTokenizer(text,",");//StringTokenizer�� �̿��ؼ� "," �������� ����
			String city=txt.nextToken().trim(); //trim�� �̿��ؼ� ����� ������ ù��° ���� city�� �Ҵ�
			int longitude=Integer.parseInt(txt.nextToken().trim());//Integer.parseInt()�� �������� ���ڿ��� ���� ���� �ǹ�����, �ش� ���� 10������ Integer ������ ��ȯ �� �ش�
			int latitude=Integer.parseInt(txt.nextToken().trim());
			map.put(city,new Location7_6(city,longitude,latitude));	//map�� String�� city, Location7_6�� new Location7_6(city,longitude,latitude)�� �Ҵ�
		}
		Set<String> keys=map.keySet(); //map�� key��(�����̸���)�� ������ keys�� �Ҵ�
		Iterator<String> it=keys.iterator();
		System.out.println("--------------------------");
		while(it.hasNext()) { //map�� �����ϴ� ��� ������ ���
			String n=it.next();
			Location7_6 l=map.get(n); //n���� �����̸����� ����, map���� key�� �����̸��� ��Ī�Ǵ� value�� l�̶� �Ҵ�
			l.show();//l���� show��� �޼ҵ� ���� n�� ��Ī�Ǵ� ���� �̸� �浵�� ���� ������ ���
		}
		System.out.println("--------------------------");
		while(true) {
			System.out.print("���� �̸� >> ");
			String st=scanner.next();
			if(st.equals("�׸�")) {
				break;
			}
			if(map.get(st)!=null) {
				map.get(st).show(); //key�� st��� �Ҷ� st�� ��Ī�Ǵ� value ���� cnffur
			}
			else {
				System.out.println(st+"�� �����ϴ�.");
			}
		}
		scanner.close();
	
	}

}
