package edu.umg.progra2.catalogos;

public class AutomovilHibrido extends Automovil{
	
	public AutomovilHibrido(String modelo, String color, int potencia, double espacio) {
		super(modelo, color, potencia, espacio);
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "AutomovilHibrido [modelo=" + modelo + ", color=" + color + ", potencia=" + potencia + ", espacio="
				+ espacio + "]";
	}
	
	
	
	

}
