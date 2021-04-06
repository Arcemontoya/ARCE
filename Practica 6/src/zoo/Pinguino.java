package zoo;

public class Pinguino extends Animal{

	public Pinguino(String name, int age, boolean vaccinated) {
		super(name, age, vaccinated);
	}
	
	@Override
	public void eat() {
		System.out.println(name + "esta comiendo pescado.");
	}
	
	@Override
	public String mostrar() {
		return "PINGUINO";
	}
}
