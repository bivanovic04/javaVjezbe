
abstract class Zaposleni {
private int id;
private String ime;
private String prezime;
private double plataPoSatu;
private double ukupanBrojSati;
public Zaposleni(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
	this.id = id;
	this.ime = ime;
	this.prezime = prezime;
	this.plataPoSatu = plataPoSatu;
	this.ukupanBrojSati = ukupanBrojSati;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getIme() {
	return ime;
}
public void setIme(String ime) {
	this.ime = ime;
}
public String getPrezime() {
	return prezime;
}
public void setPrezime(String prezime) {
	this.prezime = prezime;
}
public double getPlataPoSatu() {
	return plataPoSatu;
}
public void setPlataPoSatu(double plataPoSatu) {
	this.plataPoSatu = plataPoSatu;
}
public double getUkupanBrojSati() {
	return ukupanBrojSati;
}
public void setUkupanBrojSati(double ukupanBrojSati) {
	this.ukupanBrojSati = ukupanBrojSati;
}
public abstract double IzracunajPlatu();
public abstract String getTip();

}
