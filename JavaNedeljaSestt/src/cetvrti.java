import java.util.Scanner;

public class cetvrti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// napisati program koji unijeti string (karakteri 0-9) enkriptuje ako je paran = 0 ako je neparan = 1
		Scanner sc = new Scanner(System.in);
		System.out.println("unesite string: ");
		String x = sc.nextLine();
        String s = "";
				for(int i = 0; i < x.length(); i++) {
		           char c = x.charAt(i);
		           int cifra = Character.getNumericValue(c);
		           if(cifra % 2 == 0) {
		        	   s= s + "1";
		           }else {
		        	   s= s + "0";
		           }
				}
	}

}
