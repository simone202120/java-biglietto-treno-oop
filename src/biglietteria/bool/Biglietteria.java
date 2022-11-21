package biglietteria.bool;

public class Biglietteria {
	
	public static void main(String[] args) throws Exception {
		Biglietto b=new Biglietto(50,10);
		try {
			System.out.println(b);
		} catch(Exception e ) {
			System.err.println(e.getMessage());
		}
	}
}
