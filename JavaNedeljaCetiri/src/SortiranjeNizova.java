import java.util.Scanner;

public class SortiranjeNizova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("unesite duzinu niza");
        int velicinaNiza = sc.nextInt();
        int[] brojevi = new int[velicinaNiza];
        for(int i = 0;i < brojevi.length; i++) {
           System.out.println("unesite" + (i + 1) + ". element niza ");
           brojevi[i] = sc.nextInt();
	    }
        for(int i = 0;i < brojevi.length - 1;i++) {
        	for(int j = 0; j < brojevi.length - i -1;j++) {
        		if(brojevi[j] > brojevi[j+1]) {
        			int temp = brojevi[j];
        			brojevi[j] = brojevi[j+1];
        			brojevi[j+1] = temp;
        		}
        	}
        }
        for(int x:brojevi) {
        System.out.println(x);
        }
        
}
}
