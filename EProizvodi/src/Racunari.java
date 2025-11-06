
class Racunari extends EProizvodi {
	private String procesor;
    private int memorija;

    public Racunari(String opis, String sifra, double uvoznaCijena, String procesor, int memorija) {
        super(opis, sifra, uvoznaCijena);
        this.procesor = procesor;
        this.memorija = memorija;
    }

    @Override
    public double maloprodajnaCijena() {
        double cijena = super.maloprodajnaCijena(); 
        return cijena * 1.05; 
    }
    @Override
    public String toString() {
        return super.toString() + " CPU: " + procesor + ", RAM: " + memorija + "GB";
    }

}
