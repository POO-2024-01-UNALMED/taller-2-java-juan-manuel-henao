package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
void cambiarRegistro(int registro) {
	this.registro=registro;
}
void asignarTipo(String claseMotor) {
	if ((claseMotor=="electrico")||(claseMotor=="gasolina")) {
		tipo=claseMotor;
	}
}
}
