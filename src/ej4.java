import java.util.ArrayList;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> num = new ArrayList <Integer>();
		
		for(int i = 0; i<100; i++){
			if(i%2!=0){
				num.add(i);
				System.out.println(i);
			}
		}
	}

}
