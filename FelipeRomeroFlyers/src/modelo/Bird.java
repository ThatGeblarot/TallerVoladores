package modelo;

public class Bird extends Animal implements Flyer{

	public String takeOff() {
		return "El ave se va";
		}

	public String land() {
		return "El ave est� llegando";
		}

	public String fly() {
		return "El ave esta volando";
		}

	public String buildNest() {
		return "El ave esta costruyendo su casa";
		}
	
	public String layEggs() {
		return "El ave est� poniendo huevos";
		}

	public String eat() {
		return super.eat();
		}
}
