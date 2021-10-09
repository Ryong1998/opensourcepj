package practice5;

abstract class PairMap {
	   protected String keyArray[]; // key ���� �����ϴ� �迭
	   protected String valueArray[]; // value ���� �����ϴ� �迭
	   abstract String get(String key); // key ���� ���� value ����, ������ null ����
	   abstract void put(String ket, String value); // key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
	   abstract String delete(String key); // key ���� ���� ������ (value�� �Բ�) ����, ������ value �� ����
	   abstract int length(); // ���� ����� �������� ���� ����
	}

class Dictionary extends PairMap {
	   private int set;
	   public Dictionary(int num) { //1.dictionary�� key�� �׿� �����ϴ� value�� �����Ǿ� �����Ƿ� ũ�⸦ �Է¹ް�, ũ�Ⱑ ���� �迭 2�� ����(key�뵵,value�뵵)
	      keyArray = new String[num]; //key�� ����� �迭
	      valueArray = new String[num];//value�� ����� �迭
	      this.set = 0; // ���� ����� �������� ������ ����
	   }
	   
	   public String get(String key) {//3.�Է¹��� key���� �����ϴ� value ���� ������
	      for(int i=0; i<set; i++) { //���� �����ϴ� ũ�⸸ŭ �迭�� Ž���ؼ�
	         if(key.equals(keyArray[i])) { //�Է¹��� key���� ������
	            return valueArray[i]; //key�� �����ϴ� value ���� ��ȯ
	         }
	      }
	      return null; // ���ϴ� key�� ���ٸ� null ����
	   }
	   
	   public void put(String key, String value) {//2.key�� value�� �Է¹޴� �޼ҵ�
	      for(int i=0; i<set; i++) { //���� ����� ������ ������ŭ ����
	         if(key.equals(keyArray[i])) { //���� key�迭�� �ִ� ���� ���� ���� �Է¹޴´ٸ�(���� ���)
	        	valueArray[i] = value; //key�� �����ϴ� value�� ���ϴ� ���̹Ƿ� value�迭�� ���� �Է¹��� ������ ���� 
	            return; // �ߺ��� key�� �ִٸ� �����ϰ� �Լ� ����
	         }
	      }
	      keyArray[set] = key; //for������ �Լ����ᰡ �Ǵ� �ʴ´ٸ�(���� �迭�� ���� ������ �Է¹޾Ҵٸ�) key ���� �Է¹��� ������ �ٲٰ�
	      valueArray[set] = value; //value ���� �Է¹��� ������ �ٲٰ�
	      set++;//key�迭�� value �迭�� ���� ���� �߰��Ǿ����Ƿ� ����� �ƿ����� 1�� ����
	   }
	   
	   public String delete(String key) { //4.key���� �Է¹޾Ƽ� �����ϴ� �޼ҵ�
	      for(int i=0; i<set; i++) { //���� ����� ������ ������ŭ �ݺ�
	         if(key.equals(keyArray[i])) { //�Է¹��� Ŷ���� key�迭�� �����ϸ�
	            String s = valueArray[i]; //key���� �����ϴ� value���� ���� �����ϰ�
	            keyArray[i] = null; //�����ؾ� �ϹǷ� �����ϴ� key���� ����
	            valueArray[i] = null; //�����ϴ� value ���� ����
	            return s;  // ������ value �� ����(��� �����Ǿ��� �˷��ֱ� ���ؼ�)
	         }
	      }
	      return null; // ������ ���� ���ٸ� null ����
	   }
	   
	   public int length() {// ���� ����� �������� ���� ����
	      return set;
	   }
	}

public class practice5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10); //1�� �ּ����� �̵�
	    dic.put("Ȳ����", "�ڹ�");//2�� �ּ����� �̵�
	    dic.put("���繮", "���̼�");
	    dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����
	    System.out.println("���繮�� ���� "+dic.get("���繮")); //3�� �ּ����� �̵�
	    System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	    String s=dic.delete("Ȳ����"); // Ȳ���� ������ ����, 4�� �ּ����� �̵�
	    System.out.println("������ value : "+s);
	    System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));//3���ּ����� �̵�
	}

}
