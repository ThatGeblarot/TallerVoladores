package modelo;

public class Helicoptero extends Avi�n {

	@Override
	public String Despegar() {
		// TODO Auto-generated method stub
		return "Gira sus h�lices para despegar. ";
	}

	@Override
	public String Aterrizar() {
		// TODO Auto-generated method stub
		return "Baja la velocidad de h�lices y se mantiene estable hasta aterrizar. ";
	}

	@Override
	public String Volar() {
		// TODO Auto-generated method stub
		return "Se inclina para avanzar. ";
	}

}