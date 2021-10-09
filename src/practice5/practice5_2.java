package practice5;

class TV{
	   private int size;
	   public TV(int size) { 
		   this.size = size; //4.super�� ���ؼ� �θ�Ŭ���� �� ������ ����, size �Ҵ�
	   }
	   protected int getSize() { 
		   return size; 
	   }
}

class ColorTV extends TV {
	   private int color;
	   ColorTV(int size, int color) {
	      super(size); //3.super�� ���ؼ� �θ�Ŭ���� ������ ����
	      this.color = color; //5.color�Ҵ�
	   }
	   public void printProperty() {
	      System.out.print(getSize()+"��ġ "+color+"�÷�");//10.super�� ���ؼ� �θ�Ŭ���� �� �żҵ�ǽ�
	   }
}

class IPTV extends ColorTV {
	   String IP;
	   IPTV(String IP, int size, int color) {
	      super(size, color); //2.super�� ���ؼ� �θ�Ŭ���� ������ ����
	      this.IP = IP; //6.IP�Ҵ�
	   }
	   public void printProperty() {
	      System.out.print("���� IPTV�� "+IP+" �ּ��� "); //8. ���
	      super.printProperty(); //9.super�� �̿��� �θ�Ŭ���� �޼ҵ� �ǽ�
	   }
	   
	}

public class practice5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //1.iptv ��ü ����
		iptv.printProperty(); //7.iptv��ü�� printProperty �޼ҵ� �ǽ�
	}

}
