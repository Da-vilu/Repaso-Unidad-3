import java.util.Scanner;

public class Reto_416 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.print("Introduce el numero de personas: "); int x = in.nextInt();
		
		int[] birth = new int [x];
		
		int[] dia = new int [x];
		int[] mes = new int [x];
		int[] año = new int [x];
		
		
		for(int i =0; i<birth.length; i++){
			
			dia[i] = (int)(Math.random()*31);
			while(dia[i]==0){
			 dia[i] = (int)(Math.random()*31);
			 }System.out.print(dia[i]+"/");
			 
			 mes[i] = (int)(Math.random()*12);
				while(mes[i]==0){
				 mes[i] = (int)(Math.random()*12);
				 }System.out.print(mes[i]+"/");
			 
			 año[i] = (int)(Math.random()*2020);
			 
			 while(año[i]<1900 || año[i]>2020){
			 año[i] = (int)(Math.random()*2020);
			 }
			 System.out.print(año[i]+"\n");	 
		}
		
		
		
	}

}
