
public class EProizvodi {
	private String opis;
    private String sifra;
    private double uvoznaCijena;

    public EProizvodi(String opis, String sifra, double uvoznaCijena) {
        this.opis = opis;
        this.sifra = sifra;
        this.uvoznaCijena = uvoznaCijena;
}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public double getUvoznaCijena() {
		return uvoznaCijena;
	}

	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	 public String getTip() {
	        return sifra.substring(0, 2);
	 }
	 public double maloprodajnaCijena() {
	        return uvoznaCijena * 1.05;
	    }

	    @Override
	    public String toString() {
	        return sifra + " - " + opis + " - Cijena: " + maloprodajnaCijena();
	    }
	    
}

