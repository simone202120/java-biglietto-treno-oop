package biglietteria.bool;

import java.math.BigDecimal;

public class Biglietto {
	private int Km;
	private int età;
	final BigDecimal costoKm = new BigDecimal("0.21");
	final BigDecimal scontoOver= new BigDecimal ("0.40");
	final BigDecimal scontoJunior= new BigDecimal ("0.20");

	
	public Biglietto(int Km, int età) throws Exception  {
		setEtà(età);
		setKm(Km);
		
	}

	public int getKm() {
		return Km;
	}

	public void setKm(int km) throws Exception{
		if (km < 1) {
			throw new Exception("I KM NON POSSONO ESSERE MINORI DI 1");
		}
		this.Km=km;
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età)throws Exception {
		if (età < 1) {
			throw new Exception("L'ETA' NON PUO' ESSERE INFERIORE A 0");
		}
		this.età=età;	
	}
	
	public BigDecimal calcolaPrezzo() {
		
		BigDecimal Prezzo= BigDecimal.valueOf(Km).multiply(costoKm);
		return Prezzo=calcolaSconto(Prezzo);
		
	}
	
		private BigDecimal calcolaSconto(BigDecimal Prezzo) {
			if(età<18) {
				return Prezzo= (Prezzo.subtract(Prezzo.multiply(scontoJunior)));
				
			}if (età >64) {
				return Prezzo=	(Prezzo.subtract(Prezzo.multiply(scontoOver)));
			}
		return Prezzo;
		}
		
	
	
	
	@Override
	public String toString() {
		return "età:" + età + "\nKM: " + Km + "\nPrezzo: " + calcolaPrezzo();  
	}
}

