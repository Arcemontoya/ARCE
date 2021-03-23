package Practica;

public class Main {
	
	public static void main(String [] args) {
		
		Banco usuarios = new Banco();
		int numClientes = 0, opcion_1 = 0, opcion_2 = 0, dinero;
		int PIN;
		
		
		
		do {
			
			usuarios.menu();
			opcion_1 = CapturaEntrada.capturarEntero("\nIngrese opcion: ");
			ClearScreen.Cls(25);
			switch (opcion_1) {
				case 1:
					numClientes = CapturaEntrada.capturarEntero("Ingrese cantidad de cuentas a registrar: ");
					usuarios.setCuenta(numClientes);
					ClearScreen.Cls(25);
				break;
			case 2:
					if (numClientes == 0) {
						System.out.println("INGRESE PRIMERO LAS CUENTAS");
						ClearScreen.Cls(25);
					}
					else {
						do {
							usuarios.menu_operaciones();
							opcion_2 = CapturaEntrada.capturarEntero("\nIngrese opcion");
							ClearScreen.Cls(25);
							switch (opcion_2) {
								case 1:
									PIN = CapturaEntrada.capturarEntero("INGRESE PIN: ");
									dinero = CapturaEntrada.capturarEntero("INGRESE DINERO A DEPOSITAR");
									usuarios.Deposito(PIN, dinero);
									ClearScreen.Cls(25);
									break;
								case 2:
									PIN = CapturaEntrada.capturarEntero("INGRESE PIN: ");
									dinero = CapturaEntrada.capturarEntero("INGRESE DINERO A DEPOSITAR");
									usuarios.Deposito(PIN, dinero);
									ClearScreen.Cls(25);
									break;
								case 3:
									PIN = CapturaEntrada.capturarEntero("INGRESE PIN: ");
									usuarios.revisarCuenta(PIN);
									ClearScreen.Cls(25);
									break;
							}
						}while(opcion_2 != 4);
						
				break;
				}
			}
			
		}while(opcion_1 != 4);
	}
}
