package example6;
import java.util.StringTokenizer;

public class example6_9 {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ?浿/??ȭ/ȫ??/????/????", "/");
		while (st.hasMoreTokens()) 
			System.out.println(st.nextToken());
	}
}
