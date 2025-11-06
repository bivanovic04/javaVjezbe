
 class Konobar extends Zaposleni {
private double prekovremeniSati;
public Konobar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double prekovremeniSati) {
super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
this.prekovremeniSati = prekovremeniSati;
}
@Override
public double IzracunajPlatu() {
	double osnova = getUkupanBrojSati() * getPlataPoSatu();
	double prekovremeni = prekovremeniSati * (getPlataPoSatu() * 1.2);
	return 4 * (osnova + prekovremeni);
}
public double getPrekovremeniSati() {
	return prekovremeniSati;
}
public void setPrekovremeniSati(double prekovremeniSati) { 
	this.prekovremeniSati = prekovremeniSati; 
}
@Override
public String getTip() {
	return "Konobar";
}

}
