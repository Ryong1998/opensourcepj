package practice7;
import java.util.*;

class Location7_6{
	private String city;
	private int latitude,longitude;
	
	public Location7_6(String city,int longitude,int latitude) {
		this.city=city;//도시 이름 할당
		this.longitude=longitude; //경도 값 할당
		this.latitude=latitude; // 위도 값 할당
	}
	public void show() {
		System.out.println(city+"\t"+longitude+"\t"+latitude); // 도시   경도   위도  출력
	}
}
public class practice7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		HashMap<String, Location7_6> map = new HashMap<String, Location7_6>(); //String,Location7_6을 입력 받는 HashMap인 map을 선언(파이썬의 사전과 비교)
		System.out.println("도시,경도,위도를 입력하세요.");
		for(int i =0 ;i<4;i++) {
			System.out.print(">> ");
			String text=scanner.nextLine();//text로 한 줄을 입력받음
			StringTokenizer txt=new StringTokenizer(text,",");//StringTokenizer를 이용해서 "," 기준으로 나눔
			String city=txt.nextToken().trim(); //trim을 이용해서 공백들 제거한 첫번째 값을 city에 할당
			int longitude=Integer.parseInt(txt.nextToken().trim());//Integer.parseInt()는 숫자형의 문자열을 인자 값을 ㅗ받으며, 해당 값을 10진수의 Integer 형으로 반환 해 준다
			int latitude=Integer.parseInt(txt.nextToken().trim());
			map.put(city,new Location7_6(city,longitude,latitude));	//map에 String에 city, Location7_6에 new Location7_6(city,longitude,latitude)을 할당
		}
		Set<String> keys=map.keySet(); //map의 key들(도시이름들)의 집합을 keys에 할당
		Iterator<String> it=keys.iterator();
		System.out.println("--------------------------");
		while(it.hasNext()) { //map에 존재하는 모든 정보들 출력
			String n=it.next();
			Location7_6 l=map.get(n); //n에는 도시이름들이 들어가서, map에서 key가 도시이름에 매칭되는 value를 l이라 할당
			l.show();//l에서 show라는 메소드 통해 n에 매칭되는 도시 이름 경도값 위도 값들을 출력
		}
		System.out.println("--------------------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String st=scanner.next();
			if(st.equals("그만")) {
				break;
			}
			if(map.get(st)!=null) {
				map.get(st).show(); //key를 st라고 할때 st에 매칭되는 value 값을 cnffur
			}
			else {
				System.out.println(st+"는 없습니다.");
			}
		}
		scanner.close();
	
	}

}
