package practice5;

class Weapon {
	protected int fire() {
		return 1; // ����� �⺻������ �� �� ���
	}
}

class Cannon extends Weapon {
	@Override ////��������. �Ʒ� �޼��尡 ��Ȯ�� �������̵��� ������ �����Ϸ��� üũ�ϱ� ������ ���� �Ǽ��� ���� �� ����.
	protected int fire() { // �������̵�
	return 10; // ������ �� ���� 10���� ���
	}
}

public class practice5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " + 
		weapon.fire());
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ��� " + 
		weapon.fire());
	}

}
