import java.util.Arrays;
import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int[] n=new int[10];
		
		for(int i=0;i<n.length;i++){
			System.out.print("Introduce un número: "); n[i]=in.nextInt();
		}
		
		Arrays.sort(n);
		
		for(int i =0; i<n.length;i++){
			System.out.print(" "+n[i]);
		}
	}

}
