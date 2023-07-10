package cp1_hw;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계좌1 정보 입력"); 
		System.out.print("계좌번호 : ");
		String accountNumber1 = sc.nextLine(); 
		System.out.print("예금주 : ");
		String owner1 = sc.nextLine(); 
		System.out.print("초기잔액 : ");
		int balance1 = sc.nextInt(); 
		sc.nextLine(); 
		System.out.println();
		
		System.out.println("계좌2 정보 입력"); 
		System.out.print("계좌번호 : ");
		String accountNumber2 = sc.nextLine(); 
		System.out.print("예금주 : ");
		String owner2=sc.nextLine(); 
		System.out.print("초기잔액 : ");
		int balance2 = sc.nextInt(); 
		sc.nextLine();
		
		System.out.print("\n계좌1에서 계좌2로 송금할 금액 : ");
		int sendAmount = sc.nextInt();
		
		System.out.print("==============================\n");
		
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount();
		
		a.accountNumber = accountNumber1;
		a.owner = owner1;
		a.balance = balance1;
		
		b.accountNumber = accountNumber2;
		b.owner = owner2;
		b.balance = balance2;
		
		a.withdraw(sendAmount);
		b.deposit(sendAmount);
			
		a.printAccount();
		b.printAccount();

	}
}

class BankAccount{
	
	String accountNumber;
	String owner;
	int balance;
	
	void deposit(int amount) {
		balance = balance + amount;
	}
	
	void withdraw(int amount) {
		balance = balance - amount;
	}
	
	void printAccount() {
		System.out.printf("계좌번호 : %s\n", accountNumber);
		System.out.printf("예금주 : %s\n", owner);
		System.out.printf("잔액 : %s\n", balance);
		System.out.println();
	}
}