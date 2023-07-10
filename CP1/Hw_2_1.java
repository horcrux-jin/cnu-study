package cp1_hw;

import java.util.Scanner;

public class Hw_2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("과 : ");
		String major = sc.nextLine();
		
		System.out.print("학번 : ");
		int num = sc.nextInt();
		
		System.out.printf("안녕하세요.\n저는 2023년 1학기 컴퓨터프로그래밍1 수업을 듣는 %s 입니다\n",name);
		System.out.printf("저는 %s %d 학번 입니다", major, num);
		
	}

}
