package zoo;

public class Veterinarian{
	
	String name;
	double salary;
	
	public Veterinarian(String name, double salary) {
		this.name = name;
		this.salary = salary;
		
	}
	
	public void vaccinate(Animal animal) {
		animal.setVaccinated();
		System.out.println("\nEL ANIMAL YA FUE VACUNADO");
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
