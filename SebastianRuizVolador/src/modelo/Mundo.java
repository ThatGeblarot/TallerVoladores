package modelo;
public class Mundo {
		private Avi�n avi;
		private P�jaro paj;
		private Superman sup;
		private Bicicleta bic;
		private Supergirl supg;
		private NaveEspacial nav;
		
		
			public Mundo() {
				avi= new Avi�n();
				bic= new Bicicleta();
				paj= new P�jaro();
				sup= new Superman();
				supg= new Supergirl();
				nav= new NaveEspacial();
			}

			public Bicicleta getBic() {
				return bic;
			}

			public void setBic(Bicicleta bic) {
				this.bic = bic;
			}

			public Supergirl getSupg() {
				return supg;
			}

			public void setSupg(Supergirl supg) {
				this.supg = supg;
			}

			public NaveEspacial getNav() {
				return nav;
			}

			public void setNav(NaveEspacial nav) {
				this.nav = nav;
			}

			public Avi�n getAvi() {
				return avi;
			}

			public void setAvi(Avi�n avi) {
				this.avi = avi;
			}

			public P�jaro getPaj() {
				return paj;
			}

			public void setPaj(P�jaro paj) {
				this.paj = paj;
			}

			public Superman getSup() {
				return sup;
			}

			public void setSup(Superman sup) {
				this.sup = sup;
			}

			
			
}

