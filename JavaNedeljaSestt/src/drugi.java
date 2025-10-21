import java.util.Scanner;

public class drugi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// provjeriti da li je string palindrom
		Scanner sc = new Scanner(System.in);
		System.out.println("unesite string: ");
		String x = sc.nextLine().trim();
		/* ili
				x = x.trim();
				*/
		String okrenutiTekst = new StringBuilder(x).reverse().toString();
		// moramo da pretvorimo stringbuilder da iskoristimo metodu pa moramo da ga vratimo nazad u string
		System.out.print(x.equalsIgnoreCase(okrenutiTekst));
		// ne radi ovako ako ima spaceove izmedju, trim mice spaceove samo sa strana
	}

}
