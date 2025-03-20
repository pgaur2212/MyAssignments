package week1.day4;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String n= "Preetika";
		char[] ca= n.toCharArray();
		
		// P R E E T I K A
		// 0 1 2 3 4 5 6 7
		
		for (int i=ca.length-1; i>=0; i--)
		{
		System.out.print(ca[i]);
	
		}
	}

}
