package modelo;

public class Avi�n extends Vehiculo implements  Volador {

	public String transportar() {
		return "llevo gente";
	}
	public String despegar() {
		return "� A que hora salimos?";
	}

	public String aterrizar() {
		return "�Puedo aterrizar ac�?";
	}
	public String volar() {
		return "�tenemos suficiente gasolina para seguir volando?";
	}

}
