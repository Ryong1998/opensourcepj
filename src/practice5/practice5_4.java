package practice5;
import java.util.Scanner;
abstract class Converter {
   abstract protected double convert(double src); // �߻� �޼ҵ�
   abstract protected String getSrcString(); // �߻� �޼ҵ�
   abstract protected String getDestString(); // �߻� �޼ҵ�
   protected double ratio; // ����
   public void run() {
      Scanner scanner = new Scanner(System.in);
      System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
      System.out.print(getSrcString()+"�� �Է��ϼ���>> ");
      double val = scanner.nextDouble();
      double res = convert(val);
      System.out.println("��ȯ ���: "+res+getDestString()+"�Դϴ�");
      scanner.close();
   }
}

class Km2Mile extends Converter {
	   public Km2Mile(double ratio) {
		   this.ratio = ratio;
	   }
	   protected double convert(double src) { // �߻� �޼ҵ� ����
		   return src/ratio;
	   } 
	   protected String getSrcString() { // �߻� �޼ҵ� ����
		   return "Km"; 
	   }  
	   protected String getDestString() { // �߻� �޼ҵ� ����
		   return "mile"; 
	   }  
	}
public class practice5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Km2Mile toMile = new Km2Mile(1.6); // 1������ 1.6km
		toMile.run();
	}

}
