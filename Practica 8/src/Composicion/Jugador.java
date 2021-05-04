package Composicion;

public class Jugador {

	int numero_uniforme;
	String Nombre;
	int puntos_anotados;
	String Posicion;
	int estatura;
	
	
	public void setNumero_uniforme(int numero_uniforme) {
		this.numero_uniforme = numero_uniforme;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void setPuntos_anotados(int puntos_anotados) {
		this.puntos_anotados = puntos_anotados;
	}

	public void setPosicion(String posicion) {
		Posicion = posicion;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public int getNumero_uniforme() {
		return numero_uniforme;
	}

	public String getNombre() {
		return Nombre;
	}

	public int getPuntos_anotados() {
		return puntos_anotados;
	}

	public String getPosicion() {
		return Posicion;
	}

	public int getEstatura() {
		return estatura;
	}
	
	
	
	
}
