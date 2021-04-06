package zoo;

public class Cebra extends Animal{

	public Cebra(String name, int age, boolean vaccinated) {
		super(name, age, vaccinated);
	}
	
	public void corriendo() {
		System.out.println(name + "esta corriendo.");
	}
	
	@Override
	public String mostrar() {
		return "CEBRA";
	}
	
}
