package modelo;

public class Airplane implements Flyer{

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "El avi�n esta despegando...";
	}

	@Override
	public String land() {
		// TODO Auto-generated method stub
		return "El avi�n esta aterrizando...";
		
		
	}

	@Override
	public String fly() {
		// TODO Auto-generated method stub
		return "El avi�n esta en el aire...";
	}

}
