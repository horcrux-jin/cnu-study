package cp1_hw;

public class Star {

	public static void main(String[] args) {
		
		for(int a=0; a<7; a++) {
			
			for(int b=a; b<6; b++) {
				System.out.print(" ");
			}
			
			for(int c=0; c<a*2+1; c++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		for(int a=6; a>0; a--) {
			for(int b=7; b>a; b--) {
				System.out.print(" ");
			}
		
			for(int c=1; c<=a*2-1; c++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}
}
