package modelo;

public class Hidroavi�n extends Avi�n {

	@Override
	public String Despegar() {
		// TODO Auto-generated method stub
		return "Puede despegar desde el agua. ";
	}

	@Override
	public String Aterrizar() {
		// TODO Auto-generated method stub
		return "Puede aterrizar en el agua. ";
	}

	@Override
	public String Volar() {
		// TODO Auto-generated method stub
		return "Llega a una altura m�xima y se matiene estable. ";
	}

}
