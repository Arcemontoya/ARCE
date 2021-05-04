package Composicion;

public class Torneo {
	
	String nombre_torneo;
	String Region;
	int equipos_participantes;
	int partidos_jugados;
	int partidos_pendientes;
	
	Equipo equipos[] = new Equipo[5];
	
	public void formar_Torneo() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("|---------------------[EQUIPO "+ (i+1)+"]---------------------|");
			
			equipos[i] = new Equipo();
			
			equipos[i].setNombre_equipo(CapturaEntrada.capturarString("\n--> Ingrese nombre del equipo: "));
			equipos[i].setDivision(CapturaEntrada.capturarString("--> Ingrese division: "));
			equipos[i].setNombre_Entrenador(CapturaEntrada.capturarString("--> Ingrese nombre del entrenador: "));
			equipos[i].setTorneos_Participacion(CapturaEntrada.capturarString("--> Torneos en los que participa: "));
			equipos[i].setTorneos_ganados(CapturaEntrada.capturarEntero("--> Ingrese torneos ganados: "));
			equipos[i].setTorneos_perdidos(CapturaEntrada.capturarEntero("--> Ingrese torneos perdidos: "));
			
			equipos[i].formar_Equipo();
			
			for (int j = 0; j < i; i++) {
				for(int k = 0; k < 10; k++) {
					for (int l = 0; l < 10; l++) {
						do {
							System.out.println("\nERROR UN JUGADOR ESTA JUGANDO EN DOS EQUIPOS AL MISMO TIEMPO REINGRESE EQUIPOS");
							equipos[i].formar_Equipo();
						}while(equipos[i].jugadores[k].getNombre() == equipos[i].jugadores[l].getNombre());
						}
					}
				}
			}
			
		}
		
	public String getNombre_torneo() {
		return nombre_torneo;
	}
	
	public void setNombre_torneo(String nombre_torneo) {
		this.nombre_torneo = nombre_torneo;
	}
	
	public String getRegion() {
		return Region;
	}
	
	public void setRegion(String region) {
		Region = region;
	}
	
	public int getEquipos_participantes() {
		return equipos_participantes;
	}
	
	public void setEquipos_participantes(int equipos_participantes) {
		this.equipos_participantes = equipos_participantes;
	}
	
	public int getPartidos_jugados() {
		return partidos_jugados;
	}
	
	public void setPartidos_jugados(int partidos_jugados) {
		this.partidos_jugados = partidos_jugados;
	}
	
	public int getPartidos_pendientes() {
		return partidos_pendientes;
	}
	
	public void setPartidos_pendientes(int partidos_pendientes) {
		this.partidos_pendientes = partidos_pendientes;
	}
	
	
	
	
}
