package Composicion;

public class main {
	
	static Torneo torneo = new Torneo();
	
	public static void main(String [] args) {
	
		torneo.setNombre_torneo(CapturaEntrada.capturarString("INGRESE NOMBRE DEL TORNEO: "));
		torneo.setEquipos_participantes(5);
		torneo.setPartidos_jugados(CapturaEntrada.capturarEntero("INGRESE CANTIDAD DE PARTIDOS JUGADOS: "));
		torneo.setPartidos_pendientes(CapturaEntrada.capturarEntero("INGRESE CANTIDAD DE PARTIDOS PENDIENTES: "));
		
		System.out.println("|---------------------[COPA "+torneo.nombre_torneo+"]---------------------|");
		System.out.println("Equipos participantes: "+ torneo.equipos_participantes);
		System.out.println("Partidos jugados: "+ torneo.partidos_jugados);
		System.out.println("Partidos pendientes: "+ torneo.partidos_pendientes+"\n\n");
		torneo.formar_Torneo();
		
	}
	
}
