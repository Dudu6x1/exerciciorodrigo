package duduexercicio;

import java.util.Scanner;

	public class duduexercicio {
		public static void main(String[] args) {
		    
			 Scanner Dudu = new Scanner(System.in);
			       double nt1, nt2, media;
			        
			       System.out.println("Insira sua primeira nota: ");
			       nt1 = Dudu.nextDouble();
			        
			       System.out.println("Insira sua segunda nota:");
			       nt2= Dudu.nextDouble();
			       media=(nt1+nt2)/2;
			        
			       System.out.println("sua media e: " + (nt1*2 + nt2*3)/5);
			        
	}			   
}



