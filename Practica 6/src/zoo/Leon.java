package zoo;

public class Leon extends Animal {

	public Leon(String name, int age, boolean vaccinated) {
		super(name, age, vaccinated);
	}

	@Override
	public void eat() {
		System.out.println(name + "esta comiendo carne.");
	}

	@Override
	public String mostrar() {
		return "LEON";
	}
}
