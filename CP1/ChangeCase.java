package cp1_hw;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char eng = sc.nextLine().charAt(0);
		
		char result = (eng>='a' && eng<='z')? (char)(eng-32) : ((eng>='A' && eng<='Z')? (char)(eng+32) : eng);
		
		System.out.printf("입력값 : %c\n", eng);
		System.out.printf("변환값 : %c\n", result);
	}

}
