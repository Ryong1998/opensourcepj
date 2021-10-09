package practice5;

abstract class PairMap {
	   protected String keyArray[]; // key 들을 저장하는 배열
	   protected String valueArray[]; // value 들을 저장하는 배열
	   abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴
	   abstract void put(String ket, String value); // key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
	   abstract String delete(String key); // key 값을 가진 아이템 (value와 함꼐) 삭제, 삭제된 value 값 리턴
	   abstract int length(); // 현재 저장된 아이템의 개수 리턴
	}

class Dictionary extends PairMap {
	   private int set;
	   public Dictionary(int num) { //1.dictionary는 key와 그에 대응하는 value로 구성되어 있으므로 크기를 입력받고, 크기가 같은 배열 2개 생성(key용도,value용도)
	      keyArray = new String[num]; //key로 사용할 배열
	      valueArray = new String[num];//value로 사용할 배열
	      this.set = 0; // 현재 저장된 아이템의 개수를 저장
	   }
	   
	   public String get(String key) {//3.입력받은 key값데 대응하는 value 값을 가져옴
	      for(int i=0; i<set; i++) { //현재 존재하는 크기만큼 배열을 탐색해서
	         if(key.equals(keyArray[i])) { //입력받은 key값이 있으면
	            return valueArray[i]; //key에 대응하는 value 값을 반환
	         }
	      }
	      return null; // 원하는 key가 없다면 null 리턴
	   }
	   
	   public void put(String key, String value) {//2.key와 value를 입력받는 메소드
	      for(int i=0; i<set; i++) { //현재 정장된 아이템 갯수만큼 실행
	         if(key.equals(keyArray[i])) { //만약 key배열에 있는 값과 같은 값을 입력받는다면(수정 기능)
	        	valueArray[i] = value; //key에 대응하는 value가 변하는 것이므로 value배열의 값을 입력받은 값으로 변경 
	            return; // 중복된 key가 있다면 저장하고 함수 종료
	         }
	      }
	      keyArray[set] = key; //for문에서 함수종료가 되는 않는다면(현재 배열에 없는 값들을 입력받았다면) key 값을 입력받은 값으로 바꾸고
	      valueArray[set] = value; //value 값을 입력받은 값으로 바꾸고
	      set++;//key배열과 value 배열에 값이 각각 추가되었으므로 저장된 아에팀수 1개 증가
	   }
	   
	   public String delete(String key) { //4.key값을 입력받아서 삭제하는 메소드
	      for(int i=0; i<set; i++) { //현재 저장된 아이템 개수만큼 반복
	         if(key.equals(keyArray[i])) { //입력받은 킷값이 key배열에 존재하면
	            String s = valueArray[i]; //key값에 대응하는 value값을 따로 저장하고
	            keyArray[i] = null; //삭제해야 하므로 대응하는 key값을 제거
	            valueArray[i] = null; //대응하는 value 값을 제거
	            return s;  // 삭제된 value 값 리턴(어떤게 삭제되었는 알려주기 위해서)
	         }
	      }
	      return null; // 삭제된 것이 없다면 null 리턴
	   }
	   
	   public int length() {// 현재 저장된 아이템의 개수 리턴
	      return set;
	   }
	}

public class practice5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10); //1번 주석으로 이동
	    dic.put("황기태", "자바");//2번 주석으로 이동
	    dic.put("이재문", "파이선");
	    dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
	    System.out.println("이재문의 값은 "+dic.get("이재문")); //3번 주석으로 이동
	    System.out.println("황기태의 값은 "+dic.get("황기태"));
	    String s=dic.delete("황기태"); // 황기태 아이템 삭제, 4번 주석으로 이동
	    System.out.println("삭제된 value : "+s);
	    System.out.println("황기태의 값은 "+dic.get("황기태"));//3번주석으로 이동
	}

}
