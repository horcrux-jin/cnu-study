package cp1_hw;

import java.util.Scanner;

public class Pibo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 피보나치 수열의 항의 개수는? : ");
		int count = sc.nextInt();
		
		int temp1 = 1;
		int temp2 = 0;
		
		for(int i=0; i<count; i++) {
						
			int pibo = temp1 + temp2;
			
			temp1 = temp2;
			temp2 = pibo;
			
			System.out.printf("%d ", pibo);
		}
	}
}
