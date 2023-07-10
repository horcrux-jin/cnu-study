package cp1_hw;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변환할 초 입력 : ");
		int time = sc.nextInt();
		
		System.out.printf("%d초는 %d시간 %d분 %d초 입니다.", time,time/3600,time%3600/60,time%60);
	}

}
