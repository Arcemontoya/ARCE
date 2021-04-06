package zoo;

public class Mono extends Animal{

	public Mono(String name, int age, boolean vaccinated) {
		super(name, age, vaccinated);
	}
	
	@Override
	public void eat() {
		System.out.println(name + "esta comiendo platanos.");
	}
	
	@Override
	public String mostrar() {
		return "MONO";
	}

}
