import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
EProizvodi[] lista = new EProizvodi[10];
int brojProizvoda = 0;

System.out.println("1. Unos uređaja");
System.out.println("2. Pregled svih uređaja sa maloprodajnom cijenom");
System.out.print("Unesite izbor: ");
int odabir = sc.nextInt();
sc.nextLine(); 

if (odabir == 1) {

    System.out.print("Unesite opis ");
    String opis = sc.nextLine();

    System.out.print("Unesite sifru ");
    String sifra = sc.nextLine();

    System.out.print("Unesite uvoznu cijenu: ");
    double cijena = sc.nextDouble();
    sc.nextLine();
    EProizvodi novi = null;

    if (sifra.equals("RA")) {
        System.out.print("Procesor ");
        String cpu = sc.nextLine();

        System.out.print("Memorija ");
        int ram = sc.nextInt();

        novi = new Racunari(opis, sifra, cijena, cpu, ram);
    }
    else if (sifra.equals("TE")) {
        System.out.print("Operativni sistem ");
        String os = sc.nextLine();

        System.out.print("Veličina ekrana ");
        double vel = sc.nextDouble();

        novi = new Telefoni(opis, sifra, cijena, os, vel);
    }
    else if (sifra.equals("TV")) {
        System.out.print("Veličina ekrana: ");
        double vel = sc.nextDouble();

        novi = new TV(opis, sifra, cijena, vel);
    }
    else {
        System.out.println("Nepoznata sifra ");
    }

    if (novi != null) {
        lista[brojProizvoda] = novi;
        brojProizvoda++;
        System.out.println("Uredjaj uspjesno unesen");
    }
}
else if  (odabir == 2) {
    if (brojProizvoda == 0) {
        System.out.println("Nema unesenih uredjaja.");
    } else {
        for (int i = 0; i < brojProizvoda; i++) {
            System.out.println(lista[i]);
        }
    }
}

    }

	}
	


