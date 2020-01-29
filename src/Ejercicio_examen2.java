import java.util.Scanner;


public class Ejercicio_examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int [] e = new int [4];
		int [] o = new int [4];
		int [] d = new int [2];
		int [] n = new int [10];
	
		
		boolean  d1=true;
		boolean d2=true ;
		
		System.out.println("Introduce el numero de cuenta: "); String cuenta = in.next();
		
		
		
	
		for(int i = 0;i<e.length;i++){
	
			e[i]=cuenta.charAt(i);
		
			
		}
		for(int i = 0;i<o.length;i++){
		
			o[i]=cuenta.charAt(i+4);
			
		}
		
		for(int i = 0;i<d.length;i++){
		
			d[i]=cuenta.charAt(i+8);
			
		}
		for(int i = 0;i<n.length;i++){
		
			n[i]=cuenta.charAt(i+10);
		
		}
		
	
			
		int s1=0;
		
	for (int i=0;i<e.length;i++){
		if(i==0){
			e[i]*=4;
		}if(i==1){
			e[i]*=8;
		}if(i==2){
			e[i]*=5;
		}if(i==3){
			e[i]*=10;
		}
	}
	for (int i=0;i<o.length;i++){
		if(i==0){
			o[i]*=9;
		}if(i==1){
			o[i]*=7;
		}if(i==2){
			o[i]*=3;
		}if(i==3){
			o[i]*=6;
		}
		
	}
	
	
	for(int i =0;i<8;i++){
		if(i<4){
			s1+=e[i];
		}else{
			s1+=e[i-4];
		}
	}
	
	
	s1=s1%11;
	
	switch(s1-11){
	case 10: if(1==d[0]){
		d1 = true;}else{d1=false;}
	
	case 11: if(0==d[0]){
		d1 = true;}else{d1=false;}
	
	case 2: if(2==d[0]){
		d1 = true;}else{d1=false;}
	
	case 3: if(3==d[0]){
		d1 = true;}else{d1=false;}
	
	case 4: if(4==d[0]){
		d1 = true;}else{d1=false;}
	
	case 5: if(5==d[0]){
		d1 = true;}else{d1=false;}
	
	case 6: if(6==d[0]){
		d1 = true;}else{d1=false;}
	
	case 7: if(7==d[0]){
		d1 = true;}else{d1=false;}
	
	case 8: if(8==d[0]){
		d1 = true;}else{d1=false;}
	
	case 9: if(9==d[0]){
		d1 = true;}else{d1=false;}
	
	}
	
	
	
	int s2=0;
	
	for (int i=0;i<n.length;i++){
		if(i==0){
			n[i]*=1;
		}if(i==1){
			n[i]*=2;
		}if(i==2){
			n[i]*=4;
		}if(i==3){
			n[i]*=8;
		}if(i==4){
			n[i]*=5;
		}if(i==5){
			n[i]*=10;
		}if(i==6){
			n[i]*=9;
		}if(i==7){
			n[i]*=7;
		}if(i==8){
			n[i]*=3;
		}if(i==9){
			n[i]*=6;
		}
		s2+=n[i];
	}

	s2=s2%11;
	
	switch(s2-11){
	case 10: if(1==d[1]){
		d2 = true;}else{d1=false;}
	
	case 11: if(0==d[1]){
		d2 = true;}else{d2=false;}
	
	case 2: if(2==d[1]){
		d2 = true;}else{d2=false;}
	
	case 3: if(3==d[1]){
		d2 = true;}else{d2=false;}
	
	case 4: if(4==d[1]){
		d2 = true;}else{d2=false;}
	
	case 5: if(5==d[1]){
		d2 = true;}else{d2=false;}
	
	case 6: if(6==d[1]){
		d2 = true;}else{d2=false;}
	
	case 7: if(7==d[1]){
		d2 = true;}else{d2=false;}
	
	case 8: if(8==d[1]){
		d2 = true;}else{d2=false;}
	
	case 9: if(9==d[1]){
		d2 = true;}else{d2=false;}
	
	
	}
	
	if(d1==true && d2 ==true){
		System.out.println("Su cuenta SI validada");
	}else{
		System.out.println("\nSu cuenta NO valida");
	}
		
	
		}
	}


