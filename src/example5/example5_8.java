package example5;

interface PhoneInterface_8 { // �������̽� ����
	final int TIMEOUT = 10000; // ��� �ʵ� ����
	void sendCall_8(); // �߻� �޼ҵ�(public abstract ���� ����)
	void receiveCall_8(); // �߻� �޼ҵ�
	default void printLogo_8() { // default �޼ҵ�
		System.out.println("** Phone **");
	}
}

class SamsungPhone_8 implements PhoneInterface_8 { // �������̽� ����
	// PhoneInterface�� ��� �޼ҵ� ����
	@Override
	public void sendCall_8() {
		System.out.println("�츮������");
	}
	@Override
	public void receiveCall_8() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	// �޼ҵ� �߰� �ۼ�
	public void flash_8() { 
		System.out.println("��ȭ�⿡ ���� �������ϴ�."); 
	}
}

public class example5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamsungPhone_8 phone = new SamsungPhone_8();
		phone.printLogo_8();
		phone.sendCall_8();
		phone.receiveCall_8();
		phone.flash_8();
	}

}
