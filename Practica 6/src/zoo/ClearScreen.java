package zoo;


import java.util.Scanner;

public class ClearScreen {

	static Scanner comando = new Scanner(System.in);
	
	public static void Cls(int lineas) {
		
		System.out.println("\nPRESIONE ENTER PARA CONTINUAR");
		comando.nextLine();
		
		for (int i = 0; i < lineas; i++) {
			System.out.println();
		}
	}
}

