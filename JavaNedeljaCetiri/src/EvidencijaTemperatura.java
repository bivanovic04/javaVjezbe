import java.util.Scanner;

public class EvidencijaTemperatura {
	
private double niz[];

public EvidencijaTemperatura() {
}

	public double[] getNiz() {
	return niz;
}

public void setNiz(double[] niz) {
	this.niz = niz;}
public double prosjecnaTemperatura(double niz[]) {
	for(x : niz) {
		suma += x
	return suma / niz.length;
}
public double makslimalaTemperatura(double niz[]) {
	double max = niz[0];
	for(x : niz) {
		if(x > max) {
			max = x;
		}
	}
	return max
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
double temperature[] = new double[5];
    for(int i = 0;i < temperature.length; i++) {
    System.out.println("unesite" + (i + 1) + ". element niza ");
    temperature[i] = sc.nextDouble();
	}
    System.out.println("duzina niza je :" + temperature.length);
    for(double x:temperature) {
        System.out.println("temperature: " + x);
    }
    System.out.println("unesite temperaturu: ");
   double unesenaTemperatura = sc.nextDouble();
   int j = 0;
   for (double x : temperature) {
       if (x != unesenaTemperatura) {
           j++;
   for(int i = 0; i < temperature.length; i++) {
	   if(temperature[i] == unesenaTemperatura) {
		   System.out.println("Unesena vrijednos se nalazi u nizu");
	   }else {
		   double noviNiz[] = new double[j];
		   int k = 0;
	        for (double y : temperature) {
	            if (y != unesenaTemperatura) {
	                noviNiz[k] = y;
	                k++;
	        for (double t : noviNiz) {
	        	System.out.println("Novi niz:" + t);
	        }
	            }
	        }
	   }
   }
	}
}   
   }
}


