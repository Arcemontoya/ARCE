package zoo;

public class Animal {

	String name;
	int age;
	boolean vaccinated;

	public Animal(String name, int age, boolean vaccinated) {
		this.name = name;
		this.age = age;
		this.vaccinated = vaccinated;
	}

	public void eat() {
		System.out.println(name + " esta comiendo.");
	}

	public void sleep() {
		System.out.println(name + "esta durmiendo.");
	}

	public String mostrar() {
		return "Animal";
	}

	public void setVaccinated() {
		this.vaccinated = true;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean isVaccinated() {
		return vaccinated;
	}

}
