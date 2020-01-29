import java.util.ArrayList;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> num = new ArrayList <Integer>();
		
		
		
		int desde = 2;
        int hasta = 100;
        boolean esPrimo;

        for (int i = desde; i <= hasta; i++) {
            esPrimo = true;

            for (int j = 2; j <= i; j++) {
                if (i % j != 0) {
                    esPrimo = true;
                    num.add(i);
                    System.out.println(num.add(i));
                }
            }
        }
  
	
}}
	
	
	

		
