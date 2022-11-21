package biglietteria.bool;
import java.util.Scanner;

public class Biglietteria {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("KM da Percorrere: ");
		int km = sc.nextInt();
		
		System.out.print("Età passeggero: ");
		int età = sc.nextInt();
		
		Biglietto b=new Biglietto(km, età);
		
		try {
			System.out.println(b);
		} catch(Exception e ) {
			System.err.println(e.getMessage());
		}
	}
}
