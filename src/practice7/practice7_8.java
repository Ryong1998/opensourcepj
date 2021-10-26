package practice7;
import java.util.*;

public class practice7_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Integer> manage = new HashMap<String, Integer>();//key가 이름, value가 포인트인 hashmap인 manage 생성
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String name = scanner.next();
			if(name.equals("그만"))
				break;
			int point = scanner.nextInt();
			if(manage.get(name) == null) { //key가 name인 manage의 value가 값이 없을 때
				manage.put(name, point); //이름과 점수를 manage에 추가
			}
			else {//key가 name인 manage의 value가 값이 있으면, 기존의 point에 입력받은 point를 더한 값을 산정
				manage.put(name,  manage.get(name)+point);
			}
			
			Set<String> keys = manage.keySet(); //manage의 key들의 집합을 변수 keys라고 할때
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {//manage에 있는 모든 이름과 포인트를 출력
				String people = it.next();
				Integer sum = manage.get(people);
				System.out.print("("+people+","+sum+")");
			}
			System.out.println();
		}
		scanner.close();
	}

}
