package controlador;
import modelo.Mundo;
import vista.Interfaz;
public class Controlador {
	private Mundo m;
	private Interfaz gui;
	public Controlador() {
		m= new Mundo();
		gui=new Interfaz();
		gui.mostrarSuperman(m.getSup().Despegar());
		gui.mostrarSuperman(m.getSup().Volar());
		gui.mostrarSuperman(m.getSup().Aterrizar());
		gui.mostrarSuperman(m.getSup().DetenerBala());
		gui.mostrarSuperman(m.getSup().Comer());
		gui.mostrarSuperman(m.getSup().AterrizarEnEdificio());
		gui.mostrarAve(m.getAve().Despegar());
		gui.mostrarAve(m.getAve().Volar());
		gui.mostrarAve(m.getAve().Aterrizar());
	    gui.mostrarAve(m.getAve().CrearNido());
	    gui.mostrarAve(m.getAve().DejarHuevo());
	    gui.mostrarAve(m.getAve().Comer());
	    gui.mostrarHelicoptero(m.getHel().Despegar());
	    gui.mostrarHelicoptero(m.getHel().Volar());
	    gui.mostrarHelicoptero(m.getHel().Aterrizar());
	    gui.mostrarHidAvi�n(m.getHid().Despegar());
	    gui.mostrarHidAvi�n(m.getHid().Volar());
	    gui.mostrarHidAvi�n(m.getHid().Aterrizar());
	    gui.mostrarJet(m.getJet().Despegar());
	    gui.mostrarJet(m.getJet().Volar());
	    gui.mostrarJet(m.getJet().Aterrizar());
	    gui.mostrarJet(m.getJet().ViajeRapido());
	    gui.mostrarMurci�lagos(m.getMur().Despegar());
	    gui.mostrarMurci�lagos(m.getMur().Volar());
	    gui.mostrarMurci�lagos(m.getMur().Aterrizar());
	    gui.mostrarMurci�lagos(m.getMur().Comer());
	    gui.mostrarMurci�lagos(m.getMur().Dormir());
	    gui.mostrarMariposa(m.getMar().Despegar());
	    gui.mostrarMariposa(m.getMar().Volar());
	    gui.mostrarMariposa(m.getMar().Aterrizar());
	    gui.mostrarMariposa(m.getMar().Comer());
	    gui.mostrarMariposa(m.getMar().SalirDeCapullo());
	}
}