import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int[] n=new int[10];
		
		int suma=0, mult=1;
		
		for(int i=0;i<n.length;i++){
			System.out.print("Introduce un número: "); n[i]=in.nextInt();
			suma+=n[i];
			mult*=n[i];
		}
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: -"+suma);
		System.out.println("La multiplicacion es: "+mult);
		System.out.println("La division es: "+suma/10);
	}
}
