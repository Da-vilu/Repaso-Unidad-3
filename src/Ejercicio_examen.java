import java.util.ArrayDeque;
import java.util.Scanner;

public class Ejercicio_examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int c = 0;
		String [] alumnos = {"Daniel", "Iván", "Nico", "Alberto", "Pablo", "Gonzalo"};
		ArrayDeque <Integer> idalgebra = new ArrayDeque <Integer>();
		ArrayDeque <Integer> idcalculo = new ArrayDeque <Integer>();
		
		for(int i = 0; i<alumnos.length;i++){
			System.out.println("Id: "+i+", Alumno: "+alumnos[i] );
		}
		System.out.println(" ");
		while(c!=-1){
			System.out.print("Introduzca el Id de los alumnos en Álgebra, si desea terminar introduzca '-1': "); 
			c=in.nextInt();
			if(c!=-1){
				idalgebra.add(c);
			}
			
		}
		c=0;
		
		while(c!=-1){
			System.out.print("Introduzca el Id de los alumnos en Cálculo, si desea terminar introduzca '-1': "); 
			c=in.nextInt();
			if(c!=-1){
				idcalculo.add(c);
			}
			
		}
		System.out.print("Los alumnos que tienen ambas asginaturas son: ");
		for(int i = 0; i<6;i++){
			if(idalgebra.contains(i)&&idcalculo.contains(i)){
				System.out.print(" "+alumnos[i]);
				
			}
		}
		
		
	}
}
