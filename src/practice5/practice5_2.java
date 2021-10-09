package practice5;

class TV{
	   private int size;
	   public TV(int size) { 
		   this.size = size; //4.super를 통해서 부모클래스 온 생성자 생성, size 할당
	   }
	   protected int getSize() { 
		   return size; 
	   }
}

class ColorTV extends TV {
	   private int color;
	   ColorTV(int size, int color) {
	      super(size); //3.super를 통해서 부모클래스 생성자 생성
	      this.color = color; //5.color할당
	   }
	   public void printProperty() {
	      System.out.print(getSize()+"인치 "+color+"컬러");//10.super를 통해서 부모클래스 온 매소드실시
	   }
}

class IPTV extends ColorTV {
	   String IP;
	   IPTV(String IP, int size, int color) {
	      super(size, color); //2.super를 통해서 부모클래스 생성자 생성
	      this.IP = IP; //6.IP할당
	   }
	   public void printProperty() {
	      System.out.print("나의 IPTV는 "+IP+" 주소의 "); //8. 출력
	      super.printProperty(); //9.super를 이용해 부모클래스 메소드 실시
	   }
	   
	}

public class practice5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //1.iptv 객체 생성
		iptv.printProperty(); //7.iptv객체의 printProperty 메소드 실시
	}

}
