package Composicion;

public class Equipo {
	
	String nombre_equipo;
	String Division;
	String Nombre_Entrenador;
	String Torneos_Participacion;
	int torneos_ganados;
	int torneos_perdidos;
	int sumatoria_puntos = 0;
	
	Jugador jugadores[] = new Jugador[10];
	
	
public void formar_Equipo() {
		
	sumatoria_puntos = 0;
	
		for (int i = 0; i < 10; i++) {
			System.out.println("|---------------------[JUGADOR "+ (i+1)+"]---------------------|");
			jugadores[i] = new Jugador();
			jugadores[i].setNumero_uniforme(CapturaEntrada.capturarEntero("\n--> Ingrese numero de uniforme: "));
			jugadores[i].setNombre(CapturaEntrada.capturarString("--> Ingrese nombre: "));
			jugadores[i].setPuntos_anotados(CapturaEntrada.capturarEntero("--> Ingrese puntos anotados: "));
			jugadores[i].setPosicion(CapturaEntrada.capturarString("--> Ingrese posicion: "));
			jugadores[i].setEstatura(CapturaEntrada.capturarEntero("--> Ingrese estatura en CM: "));
			
			for(int j = 0; j < i; j++) {
				System.out.println("|---------------------[JUGADOR "+ (i+1)+"]---------------------|");
				
				do {
					System.out.println("\nERROR INGRESO MISMO JUGADOR O NUMERO DE CAMISA REPETIDO");
					jugadores[i].setNumero_uniforme(CapturaEntrada.capturarEntero("\n--> Ingrese numero de uniforme: "));
					jugadores[i].setNombre(CapturaEntrada.capturarString("--> Ingrese nombre: "));
					jugadores[i].setPuntos_anotados(CapturaEntrada.capturarEntero("--> Ingrese puntos anotados: "));
					jugadores[i].setPosicion(CapturaEntrada.capturarString("--> Ingrese posicion: "));
					jugadores[i].setEstatura(CapturaEntrada.capturarEntero("--> Ingrese estatura en CM: "));
				}while((jugadores[i].Nombre == jugadores[j].Nombre || jugadores[i].numero_uniforme == jugadores[j].numero_uniforme));
			}
			
			sumatoria_puntos += jugadores[i].getPuntos_anotados();
			System.out.println("PUNTOS DEL EQUIPO: " + sumatoria_puntos);
			
		}
	
	}
	
	
	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	public void setDivision(String division) {
		Division = division;
	}

	public void setNombre_Entrenador(String nombre_Entrenador) {
		Nombre_Entrenador = nombre_Entrenador;
	}

	public void setTorneos_Participacion(String torneos_Participacion) {
		Torneos_Participacion = torneos_Participacion;
	}

	public void setTorneos_ganados(int torneos_ganados) {
		this.torneos_ganados = torneos_ganados;
	}

	public void setTorneos_perdidos(int torneos_perdidos) {
		this.torneos_perdidos = torneos_perdidos;
	}

	public void setJugadores(Jugador[] jugadores) {
		this.jugadores = jugadores;
	}
	
	public String getNombre_equipo() {
		return nombre_equipo;
	}

	public String getDivision() {
		return Division;
	}

	public String getNombre_Entrenador() {
		return Nombre_Entrenador;
	}

	public String getTorneos_Participacion() {
		return Torneos_Participacion;
	}

	public int getTorneos_ganados() {
		return torneos_ganados;
	}

	public int getTorneos_perdidos() {
		return torneos_perdidos;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	
}
