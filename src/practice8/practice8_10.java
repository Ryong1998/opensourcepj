package practice8;
import java.io.*;
import java.util.*;

public class practice8_10 {
	
	private String fileName = "C:\\Users\\LG\\eclipse-workspace\\practice\\phone8_10.txt";
	private HashMap<String, String> phoneMap = new HashMap<String, String>();
	
	private void readPhoneFile() {
		try {
			String line;
		    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "utf-8"));
		    while ((line = reader.readLine()) != null){
		        String[] parts = line.split(" ", 2); //파일에서 내용이    이름 전화번호   형식으로 저장이 되어 있어서 이름과 전화번호 사이에 공백을 기준으로 키와 벨류를 나눔
		        if (parts.length == 2){ //이름과 전화번호로 파일 한 줄이 구성되어 있을 때
		            String key = parts[0]; //나눈 부분의 [0]을 key값으로
		            String value = parts[1]; //나눈 부부닁 [1]을 value값으로
		            phoneMap.put(key, value); //HashMap인 phoneMap에 내용 추가
		        } 
		        else {
		            System.out.println("잘못된 입력: " + line);
		        }
		    }			
		    reader.close();
			System.out.println(phoneMap.keySet()); //킷값이 제대로 들어갔는 확인용
		} 
		
		catch (IOException e) { // 파일을 저장할 수 없는 경우 예외
			e.printStackTrace();
		}
		
		System.out.println("총 " + phoneMap.size() + "개의 전화번호를 읽었습니다."); //몇개의 전화번호를 읽었는지 확인
		
	}
	
	private void processQuery() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("이름>> ");
			String name = scanner.next(); // 이름 입력
			if(name.equals("그만")) //그만을 입력 받으면 중지
				break;
			String tel = phoneMap.get(name); //phoneMape에서 key가 name인 value의 값을 tel에 할당
			if(tel == null) { //tel이 null 이면(name이 key값에 없을 때)
				System.out.println("찾는 이름이 없습니다.");			
			}
			else{
				System.out.println(tel);
			}
		}

		scanner.close();
	}
	
	public void run() {
		readPhoneFile(); //HashMap인 phoneMap 업데이트
		processQuery(); //값을 입력받고 입력받은 값에 매칭되는 전화번호 출력
	}
	
	public static void main(String[] args) {
		practice8_10 phoneExplorer = new practice8_10();
		phoneExplorer.run();
	}

}
