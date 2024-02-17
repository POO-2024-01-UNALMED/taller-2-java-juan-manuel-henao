package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad=0;
		for(Asiento asiento:asientos) {
			if (asiento instanceof Asiento) {
				cantidad++;
			}
		
		}
		return cantidad;
	}
	
	String verificarIntegridad() {
		String respuesta;
		for(Asiento asiento:asientos) {
			if (registro!=asiento.registro) {
				respuesta="Las piezas no son originales";
				
			}else {
				respuesta="Auto original";
			}
		
		}
		if(registro==motor.registro) {
			respuesta="Auto original";
		}else {
			respuesta="Las piezas no son originales";
		}
		return respuesta;
	}
}



   