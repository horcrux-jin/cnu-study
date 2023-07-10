package cp1_hw;

import java.util.Scanner;

public class Spin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] inputArr = input.split(" ");
		
		
		int max = 0;
		
		for(int i=0; i<inputArr.length; i++) {
			if (inputArr[i].length()>max) {
				max = inputArr[i].length();
			}
		}

        for (int i=max-1; i>=0; i--) {
            for (int j=0; j<inputArr.length; j++) {
                String cnt = inputArr[j];
                if (i < cnt.length()) {
                    System.out.print(cnt.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }		
	}
}
