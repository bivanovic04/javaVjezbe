import java.util.Scanner;

public class treci {
private static boolean jeSamoglasnik(char c){
	c = Character.toLowerCase(c);
	return c == 'a' || c== 'e' || c== 'i' || c== 'o' || c== 'u';
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// izbrojati samoglasnike i suglesnike u stringu
		Scanner sc = new Scanner(System.in);
		System.out.println("unesite string: ");
		String x = sc.nextLine();
		int samoglasnici = 0;
		int brSlova = 0;
		for(int i = 0; i < x.length(); i++) {
			char c = x.charAt(i); // izdvajamo karakter sa i-te pozicije
			if (Character.isLetter(c)) {
				brSlova ++;
				if(jeSamoglasnik(c))
					samoglasnici ++;
				samoglasnici+= 1;
			}
			}
				System.out.println("br samoglasnika je " + samoglasnici);
				System.out.println("br suglasnika je " + (brSlova - samoglasnici));
				sc.close();
		}
	}


