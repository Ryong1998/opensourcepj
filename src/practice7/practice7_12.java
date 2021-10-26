package practice7;
import java.util.Scanner;
import java.util.Vector;

class Word {
	private String eng, kor;
	Word(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}
	String Eng() {
		return eng;
	}
	String Kor() {
		return kor;
	}
}


public class practice7_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var v = new Vector<Word>(); //Word클래스를 입력받는 벡터 v 를 선언
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("dog", "강아지"));
		v.add(new Word("cat", "고양이"));
		v.add(new Word("computer", "컴퓨터"));
		v.add(new Word("bag", "가방"));
		v.add(new Word("book", "책"));
		v.add(new Word("pencil", "연필"));
		v.add(new Word("cloth", "옷"));
		v.add(new Word("pants", "바지"));
		v.add(new Word("head", "머리"));
		v.add(new Word("hand", "손"));
		v.add(new Word("foot", "발"));
		v.add(new Word("arm", "팔"));
		v.add(new Word("cigarettes", "담배"));
		v.add(new Word("fire", "불"));
		v.add(new Word("water", "물")); //영단어와 뜻을 입력 받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
		while (true) {
			System.out.println();
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
			int num = scanner.nextInt();
			if (num == 3) //3을 입력 받으면 종료
				break;
			switch (num) {
			case 1:// 단어 테스트를 입력 받은 경우
				System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
				System.out.println("-1을 입력하면 테스트를 종료합니다.");
				System.out.println();
				int[] example = new int[4]; //example은 보기를 나타낼 때 사용
				while (true) {
					for (int i = 0; i < 4; i++) {
						int v_random_index = (int) (Math.random() * v.size()); //r은 v크기만큼의 랜덤을 돌렸을 때 나오는 인덱스
						example[i] = v_random_index; //4개의 example에 v_random_index를 할당
						if (i > 0 && example[i - 1] == example[i]) //example에 할당한 value들이 같은 값을 가지고 있으면
							i--;//i를 감소 시켜서 다시 할당
					}
					int v_random_index2 = (int) (Math.random() * 4); //0에서부터 4미만의 index(정답의 인덱스)를 할당
					System.out.println(v.get(example[v_random_index2]).Eng() + "?");

					for (int i = 0; i < 4; i++) { //4개의 보기를 출력
						System.out.print("(" + (i + 1) + ")" + v.get(example[i]).Kor() + " ");
					}
					int answer = 0;
					System.out.print(":>");
					String tmp = scanner.next();
					if (tmp.equals("1") || tmp.equals("2") || tmp.equals("3") || tmp.equals("4") || tmp.equals("-1"))//1 2 3 4 -1 중 값을 입력하면
						answer = Integer.parseInt(tmp); //정상적인 값을 입력 받은 것으로 간주 하고 answer에 값을 할당
					else {
						System.out.println("숫자를 입력하세요 !!");
						System.out.println();
					}
					if (answer == -1) //-1을 입력받으면
						break;//종료
					if (answer >= 1 && answer <= 4) { //1에서 4 사이의 값을 입력 받으면
						if (v.get(example[answer - 1]).Eng().equals(v.get(example[v_random_index2]).Eng())) {
							System.out.println("Excellent  !!");
							System.out.println();
						} else {
							System.out.println("No.  !!");
							System.out.println();
						}
					}
				}
				break;
			case 2: //단어 삽입을 입력한 경우
				System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
				while (true) {
					System.out.print("영어 한글 입력 >> ");
					String eng = scanner.next();
					if (eng.equals("그만"))
						break;
					String kor = scanner.next();
					int count = 0;
					for (int i = 0; i < v.size(); i++) {
						String tmp = v.get(i).Eng();
						if (tmp.equals(eng)) //v에 존재하는 영단어 와 입력받은 영단어가 같으면
							System.out.println("이미 있는 단어 입니다.. 다른 단어를 입력하세요!");
						else //같지 않다면 count는 증가
							count++;
					}
					if (count == v.size()) //v에 존재하는 모든 영단어를 비교했는데도 입력 받은 영단어가 없으면
						v.add(new Word(eng, kor)); //입력받은 영단어, 한글단어를 추가
				}
				break;
			default:
				System.out.println("1, 2, 3중 하나를 입력하세요"); //1 2 3 이외의 값을 입력받은 경우
				break;
			}
		}
		scanner.close();


	}

}
