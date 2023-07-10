package cp1_hw;

import java.util.Scanner;
import java.util.Vector;

public class IcecreamTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		Buyer buyer = new Buyer();
		String[] icecream = sc.nextLine().split(" ");
		
		for(int i=0; i<icecream.length; i++) {
			if(icecream[i].equals("J")) {Jawsbar J = new Jawsbar(1200); buyer.buy(J);}
			else if(icecream[i].equals("M")) {Merona M = new Merona(1000); buyer.buy(M);}
			else if(icecream[i].equals("S")) {Seoju S = new Seoju(800); buyer.buy(S);}
			else if(icecream[i].equals("T")) {Tankboy T = new Tankboy(1500); buyer.buy(T);}
			else if(icecream[i].equals("W")) {Worldcone W = new Worldcone(2000); buyer.buy(W);}
			else {Icecream etc = new Icecream(1000); buyer.buy(etc);}
		}
		
		buyer.summary();	
	}
}

class Icecream {
	int price;
	int bonusPoint;
	
	Icecream(int price){
		this.price = price;
		if(price>1000) {
			bonusPoint = (int) ((price-1000)*0.1);
		}
	}
	
	public String toString() {return "Others";}
}

class Jawsbar extends Icecream {
	Jawsbar(int price){
		super(1200);
		if(price>1000) {
			bonusPoint = (int) ((price-1000)*0.1);
		}
	}
	
	public String toString() {return "Jawsbar";}
}

class Merona extends Icecream {
	Merona(int price){
		super(1000);
		if(price>1000) {
			bonusPoint = (int) ((price-1000)*0.1);
		}
	}
	
	public String toString() {return "Merona";}
}

class Seoju extends Icecream {
	Seoju(int price){
		super(800);
		if(price>1000) {
			bonusPoint = (int) ((price-1000)*0.1);
		}
	}
	
	public String toString() {return "Seoju";}
}

class Tankboy extends Icecream {
	Tankboy(int price){
		super(1500);
		if(price>1000) {
			bonusPoint = (int) ((price-1000)*0.1);
		}
	}
	
	public String toString() {return "Tankboy";}
}

class Worldcone extends Icecream {
	Worldcone(int price){
		super(2000);
		if(price>1000) {
			bonusPoint = (int) ((price-1000)*0.1);
		}
	}
	
	public String toString() {return "Worldcone";}
}

class Buyer {
	int money = 10000;
	int bonusPoint = 0;
	Vector icecreamList = new Vector();
		
	void buy(Icecream icecream) {
		if(money<icecream.price) {
			System.out.println("잔액이 충분하지 않습니다 : " + icecream);
			return;
		}
		
		money -= icecream.price;
		bonusPoint += icecream.bonusPoint;
		icecreamList.add(icecream);
	}
	
	void summary() {
		int sum = 0;
		String itemList ="";
		
		for(int i=0; i<icecreamList.size(); i++) {
			Icecream icecream = (Icecream)icecreamList.get(i);
			sum += icecream.price;
			itemList += (i==0) ? "" + icecream : ", " + icecream;
		}
		
		System.out.println("아이스크림 총액 : " + sum);
		System.out.println("고객 잔액 : " + money);
		System.out.println("적립된 포인트 : " + bonusPoint);
		System.out.println("구매한 아이스크림 목록 : " + icecreamList);
	}
}
