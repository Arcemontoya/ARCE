package Practica;


public class Banco{

	Cuenta[] clientes;
	
	public void setCuenta(int numCliente){
		
		boolean coincidencia;
		clientes = new Cuenta[numCliente];

		
		for (int i = 0; i < numCliente; i++){
			
			
			clientes[i] = new Cuenta();
			clientes[i].setPropietario(CapturaEntrada.capturarString("INGRESE NOMBRE DEL PROPIETARIO: "));			
			
			do {
				coincidencia = false;
				
				if (i == 0) {
					clientes[i].setPIN(CapturaEntrada.capturarEntero("INGRESE PIN: "));
				}else {
					clientes[i].setPIN(CapturaEntrada.capturarEntero("INGRESE PIN: "));
					for(int j = 0; j < clientes.length-1; j++) {
						if (clientes[j].getPIN() == clientes[i].getPIN()) {
							coincidencia = true;
							System.out.println("ERROR, COINCIDENCIA DE PIN, INGRESE OTRO");
						}
					}
				}
				
			}while(coincidencia == true);
			
			
			
			clientes[i].setDinero(CapturaEntrada.capturarEntero("INGRESE SALDO: "));	
		}
	}
	
	public void revisarCuenta(int PIN) {
		
		for (int i = 0; i < clientes.length; i++) {
			
			if (PIN == clientes[i].getPIN()) {
				System.out.println("\nPropietario: " + clientes[i].getPropietario());
				System.out.println("\nSaldo: " + clientes[i].getDinero());
			}else{
				System.out.println("");
			}
		}
		
	}
	
	public void Deposito(int pIN, int Dinero) {
		
		int nuevo_din = 0;
		
		for (int i = 0; i < clientes.length; i++) {
			
			if (pIN == clientes[i].getPIN()) {
				nuevo_din = clientes[i].getDinero() + Dinero;
				clientes[i].setDinero(nuevo_din);
				System.out.println("ACCION REALIZADA CON EXITO");				
			}
				
		}
		
		
		
	}
	
	public void Extraccion(int PIN, int Dinero) {
		int nuevo_din = 0;
		
		for (int i = 0; i < clientes.length; i++) {
			
			if (PIN == clientes[i].getPIN()) {
				nuevo_din = clientes[i].getDinero() - Dinero;
				clientes[i].setDinero(nuevo_din);
				System.out.println("ACCION REALIZADA CON EXITO");
			}
			
		}
		
	}
	
	
	public void menu() {
		
		System.out.println("|------------------[BANCO]------------------|");
		System.out.println("\n1) Registrar usuarios.");
		System.out.println("\n2) Realizar operaciones");
		System.out.println("\n3) Salir.");
		
	}
	
public void menu_operaciones() {
		
		System.out.println("|------------------[BANCO]------------------|");
		System.out.println("\n1) Realizar deposito a la cuenta propia.");
		System.out.println("\n2) Retirar dinero.");
		System.out.println("\n3) Revisar cuenta.");
		System.out.println("\n4) Regresar pantalla anterior.");
		
	}
	
	
}
