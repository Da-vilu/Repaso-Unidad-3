import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int [] n = new int [5];
		int [] n2 = new int [5];
		int [] ntotal = new int [10];
		
		for(int i = 0; i<n.length;i++){
			
			System.out.print("Introduce un número: "); n[i]=in.nextInt();
			ntotal[i]=n[i];
			}
		
			for(int i = 0; i<n2.length;i++){
			
			System.out.print("Introduce un número: "); n2[i]=in.nextInt();
			
			ntotal[i+5]=n2[i];
			}
			
			for(int i = 0; i<ntotal.length;i++){
				System.out.println(ntotal[i]);
			}
	}

}
