package cp1_hw;

import java.util.Scanner;

public class FiboTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		sc.close();
		
		Fibbo fibbo1 = new Fibbo(i1);
		fibbo1.print();
	}
}

class Fibbo{
	int num;
	int sn1;
	int sn2;
	
	Fibbo(int num) {
		this.num = num;
	}
	
	int rec(int num) {
        if (num <= 1) {
            return num;
        } else {
            return rec(num - 1) + rec(num - 2);
        }
    }
	
	void print() {
		System.out.println(rec(this.num));
	}
}

