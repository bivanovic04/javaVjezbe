import java.util.Scanner;

public class prvi {
// za unijeti string izr. koliko ima rijeci
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("unesite string: ");
		String x = sc.nextLine();
		String[] rijeci = x.split(" ");
		System.out.print("Broj rijeci je: " + rijeci.length);
	}
}
