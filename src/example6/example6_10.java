package example6;
public class example6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI); // ������ ��� ���
		System.out.println(Math.ceil(3.14)); // ceil(�ø�)
		System.out.println(Math.floor(3.14)); // floor(����)
		System.out.println(Math.sqrt(9)); // ������
		System.out.println(Math.exp(2)); // e�� 2��
		System.out.println(Math.round(3.14)); // �ݿø�
		// [1, 45] ������ ������ ���� 5�� �߻�
		System.out.print("�̹��� ����� ��ȣ�� ");
		for(int i=0; i<5; i++)
			System.out.print((int)(Math.random()*45 + 1) + " "); 
	}

}
