package week1.day4;

public class Fibbonacci {

	public static void main(String[] args) {
	
		int a=0; int b=1; int sum;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1; i<=13; i++) {
			sum=a+b;
			a=b;
				b=sum;
				System.out.println(sum);
	}
	}
}
