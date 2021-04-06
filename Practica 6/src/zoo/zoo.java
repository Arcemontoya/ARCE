package zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class zoo {

	public static void main(String args[]) {

		ArrayList<Animal> animal = new ArrayList<Animal>();
		ClearScreen cls = new ClearScreen();

		Scanner captura = new Scanner(System.in);
		int opcion = 0;
		int opcion_animal = 0;
		int opcion_veterinario;
		int indice;
		int edad;
		boolean vaccinated;

		Veterinarian veterinario = new Veterinarian(null, 0);

		String nombre, nombre_v;
		double salario;

		do {
			System.out.println("|-----------------[ZOO]-----------------|");
			System.out.println("\n1) Veterinario");
			System.out.println("\n2) Animales");
			System.out.println("\n3) Salir");
			System.out.println("\n-> Seleccione opcion: ");
			opcion = captura.nextInt();
			cls.Cls(25);
			switch (opcion) {
			case 1:
				System.out.println("|-----------------[Veterinario]-----------------|");
				System.out.println("\n1) Contratar");
				System.out.println("\2) Mostrar empleado");
				System.out.println("3) Modificar salario");
				System.out.println("4) Despedir");
				System.out.println("5) Vacunar animal por indice");
				System.out.println("6) Alimentar animal por indice");
				System.out.println("\n-> Seleccione opcion: ");
				opcion_veterinario = captura.nextInt();
				cls.Cls(25);
				switch (opcion_veterinario) {
				case 1:
					System.out.println("|-----------------[Veterinario]-----------------|");
					System.out.println("\nINGRESE NOMBRE: ");
					captura.nextLine();
					nombre_v = captura.nextLine();
					System.out.println("INGRESE SALARIO: ");
					salario = captura.nextDouble();
					veterinario = new Veterinarian(nombre_v, salario);
					cls.Cls(25);
					break;
				case 2:
					System.out.println("|-----------------[Veterinario]-----------------|");
					System.out.println("NOMBRE: " + veterinario.getName());
					System.out.println("SALARIO: " + veterinario.getSalary());
					cls.Cls(25);
					break;
				case 3:
					System.out.println("|-----------------[Veterinario]-----------------|");
					System.out.println("\nINGRESE NUEVO SALARIO: ");
					salario = captura.nextDouble();
					veterinario.setSalary(salario);
					System.out.println("\nSALARIO MODIFICADO");
					cls.Cls(25);
					break;
				case 4:
					System.out.println("|-----------------[Veterinario]-----------------|");
					veterinario = new Veterinarian(null, 0);
					System.out.println("VETERINARIO DESPEDIDO");
					cls.Cls(25);
					break;
				case 5:
					System.out.println("|-----------------[Vacunar]-----------------|");
					System.out.println("\nIngrese indice para vacunar: ");
					indice = captura.nextInt() - 1;
					veterinario.vaccinate(animal.get(indice));
					cls.Cls(25);
					break;
				case 6:
					System.out.println("|-----------------[Vacunar]-----------------|");
					System.out.println("\nIngrese indice para alimentar: ");
					indice = captura.nextInt() - 1;
					animal.get(indice).eat();
					cls.Cls(25);
					break;
				}
				break;
			case 2:
				System.out.println("|-----------------[Animales]-----------------|");
				System.out.println("\n1) Leon");
				System.out.println("2) Cebra");
				System.out.println("3) Mono");
				System.out.println("4) Pinguino");
				System.out.println("5) Liberar por indice");
				System.out.println("6) Mostrar por indice");
				System.out.println("\n-> Seleccione opcion: ");
				opcion_animal = captura.nextInt();
				cls.Cls(25);
				switch (opcion_animal) {
				case 1:
					System.out.println("|-----------------[LEON]-----------------|");
					System.out.println("\nIngrese nombre: ");
					captura.nextLine();
					nombre = captura.nextLine();
					System.out.println("\nIngrese edad: ");
					edad = captura.nextInt();
					vaccinated = false;
					animal.add(new Leon(nombre, edad, vaccinated));
					cls.Cls(25);
					break;
				case 2:
					System.out.println("|-----------------[CEBRA]-----------------|");
					System.out.println("\nIngrese nombre: ");
					captura.nextLine();
					nombre = captura.nextLine();
					System.out.println("\nIngrese edad: ");
					edad = captura.nextInt();
					vaccinated = false;
					animal.add(new Cebra(nombre, edad, vaccinated));
					cls.Cls(25);
					break;
				case 3:
					System.out.println("|-----------------[MONO]-----------------|");
					System.out.println("\nIngrese nombre: ");
					captura.nextLine();
					nombre = captura.nextLine();
					System.out.println("\nIngrese edad: ");
					edad = captura.nextInt();
					vaccinated = false;
					animal.add(new Mono(nombre, edad, vaccinated));
					cls.Cls(25);
					break;
				case 4:
					System.out.println("|-----------------[PINGUINO]-----------------|");
					System.out.println("\nIngrese nombre: ");
					captura.nextLine();
					nombre = captura.nextLine();
					System.out.println("\nIngrese edad: ");
					edad = captura.nextInt();
					vaccinated = false;
					animal.add(new Pinguino(nombre, edad, vaccinated));
					cls.Cls(25);
					break;
				case 5:
					System.out.println("|-----------------[LIBERAR]-----------------|");
					System.out.println("\nIngrese indice para liberar animal: ");
					indice = captura.nextInt() - 1;
					animal.remove(indice);
					System.out.println("\nANIMAL LIBERADO CON EXITO");
					cls.Cls(25);
					break;
				case 6:
					System.out.println("|-----------------[MOSTRAR]-----------------|");
					System.out.println("\nIngrese indice para mostrar animal: ");
					indice = captura.nextInt() - 1;
					System.out.println("\nNOMBRE: " + animal.get(indice).getName());
					System.out.println("EDAD: " + animal.get(indice).getAge());
					System.out.println("ESPECIE: " + animal.get(indice).mostrar());
					if (animal.get(indice).vaccinated) {
						System.out.println("\n Esta vacunado.");
					} else {
						System.out.println("\n No esta vacunado.");
					}
					cls.Cls(25);
				}
				break;
			}
		} while (opcion != 3);

	}

}