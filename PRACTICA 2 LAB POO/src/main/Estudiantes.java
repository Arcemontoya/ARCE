package main;

public class Estudiantes {

	private String nombre[];
	private String materia[];
	private String estado[];
	private int id[];
	private float cal[];

	
	public Estudiantes(int pos) {
		nombre = new String[pos];
		materia = new String[pos];
		estado = new String[pos];
		cal = new float [pos];
		id = new int[pos];
	}
	
	//Getters
	public String getName(int posicion) {
		return nombre[posicion];
	}
	
	public int getID(int posicion) {
		return id[posicion];
	}
	
	public String getSubject(int posicion) {
		return materia[posicion];
	}
	
	public float getGrade(int posicion) {
		return cal[posicion];
	}
	
	public String getStatus(int posicion) {
		return estado[posicion];
	}
	
	
	//Setters
	public void setName(String nombre, int i) {
		this.nombre[i] = nombre;
	}
	
	public void setID(int id, int i) {
		this.id[i] = id;
	}
	
	public void setSubject(String materia, int i) {
		this.materia[i] = materia;
	}
	
	public void setGrade(float cal, int i) {
		this.cal[i] = cal;
	}
	
	public void setStatus(String estado, int i) {
		this.estado[i] = estado;
	}
	
	
}
