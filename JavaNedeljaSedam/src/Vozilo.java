import java.util.ArrayList;

public class Vozilo {
	private String proizvodjac;
	private int godinaProizvodnje;
	private int kubikaza;
	private String boja;
	
	public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja ) {
		super();
		this.proizvodjac = proizvodjac;
		this.godinaProizvodnje = godinaProizvodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
	}
	

	public String getProizvodjac() {
		return proizvodjac;
	}


	public void setProizvodjac(String proizvodjac) {
		this.proizvodjac = proizvodjac;
	}


	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}


	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}


	public int getKubikaza() {
		return kubikaza;
	}


	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}


	public String getBoja() {
		return boja;
	}


	public void setBoja(String boja) {
		this.boja = boja;
	}
/*@Override
public String toString() {
	return String.format( 
}
*/
   public double cijenaRegistracije() {
	   double cijenaRegistracije = 100;
	   if (this.getGodinaProizvodnje() >= 2010)
		   cijenaRegistracije += 30;
	   if(this.getKubikaza() > 200)
		   cijenaRegistracije += 50;
	   return 0;
   }
   public class Automobil extends Vozilo{
	   private int brojVrata;
	   private String tipMotora;
	   
	   public Automobil(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int brojVrata,
				String tipMotora, double cijenaRegistracije) {
			super(proizvodjac, godinaProizvodnje, kubikaza, boja);
			this.brojVrata = brojVrata;
			this.tipMotora = tipMotora;
	   }

	public int getBrojVrata() {
		return brojVrata;
	}




	   public void setBrojVrata(int brojVrata) {
		   this.brojVrata = brojVrata;
	   }




	   public String getTipMotora() {
		   return tipMotora;
	   }




	   public void setTipMotora(String tipMotora) {
		   this.tipMotora = tipMotora;
	   }

	   public Automobil() {
			this(null, 0, 0, null, 0, null, 0);
		}
		
		public double cijenaRegistracije() {
			double cijenaRegistracije = 100;
			if(tipMotora != "Diesel")
				cijenaRegistracije += 20;
		return cijenaRegistracije+= 20;
		}
		
//@Override
		
		public class Kamion extends Vozilo{
			private int kapacitetTereta;
			private boolean prikolica;
			
			public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int kapacitetTereta,
					boolean prikolica, double cijenaRegistracije) {
				super(proizvodjac, godinaProizvodnje, kubikaza, boja);
				this.kapacitetTereta = kapacitetTereta;
				this.prikolica = prikolica;
		}
			
	public int getKapacitetTereta() {
				return kapacitetTereta;
			}




			public void setKapacitetTereta(int kapacitetTereta) {
				this.kapacitetTereta = kapacitetTereta;
			}




			public boolean isPrikolica() {
				return prikolica;
			}




			public void setPrikolica(boolean prikolica) {
				this.prikolica = prikolica;
			}
			public Kamion() {
				this(null, 0, 0, null, 0, true,0);
			}
			
			public double cijenaRegistracije() {
				double cijenaRegistracije = 100;
				if(prikolica = "True" != null)
					cijenaRegistracije+=50;
				return cijenaRegistracije+=50;
			}
//@Override
			public class Kombi extends Vozilo{
				private int kapacitetPutnika;
				
				public Kombi(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int kapacitetPutnika, double cijenaRegistracije) {
					super(proizvodjac, godinaProizvodnje, kubikaza, boja);
					this.kapacitetPutnika = kapacitetPutnika;
			}
				

	public int getKapacitetPutnika() {
					return kapacitetPutnika;
				}






				public void setKapacitetPutnika(int kapacitetPutnika) {
					this.kapacitetPutnika = kapacitetPutnika;
				}
      public double cijenaRegistracije() {
    	  double cijenaRegistracije = 100;
    	  if(kapacitetPutnika >= 8)
    		  cijenaRegistracije += 30;
    	  return cijenaRegistracije = cijenaRegistracije + 30;
      }





	public static void main(String[] args) {
		
	 ArrayList<Vozilo> vozila = new ArrayList<>();
	 //vozila.add(new vozilo())
	 
	}

}
		}
   }
}
