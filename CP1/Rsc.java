package cp1_hw;

import java.util.Scanner;

public class Rsc {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위/바위/보 중 하나를 입력하세요 : ");
		String user = sc.nextLine();
		
		System.out.printf("Player : %s\n", user);

		String com = null;
		int randNum = (int)(Math.random()*9)+1;
		
		switch (randNum%3) {
			case 1 :
				com = "가위";
				break;
			case 2 :
				com = "바위";
				break;
			case 0 :
				com = "보";
				break;
		}
		
		System.out.printf("Computer : %s\n", com);

		if(user.equals(com)) {
			System.out.println("비겼습니다.");
		} else if(user.equals("가위")&&com.equals("바위") || user.equals("보")&&com.equals("가위") || user.equals("바위")&&com.equals("보")) {
			System.out.println("Player가 졌습니다.");
		} else {
			System.out.println("Player가 이겼습니다!");
		}
	}
}
