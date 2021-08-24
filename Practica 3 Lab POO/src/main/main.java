package main;

import java.util.Scanner;

public class main {

	public static void main(String args[]) {
		
		Scanner comando = new Scanner(System.in);
		Persona persona = new Persona();
		
		String nombre, apellido_paterno, apellido_materno, dia, mes, anio, eFederativa;
		String sexo;
		
		System.out.println("\nIngrese apellido paterno en mayusculas ej [ARCE]: ");
		apellido_paterno = comando.nextLine();
		System.out.println("\nIngrese apellido materno en mayusculas ej [ARCE]: ");
		apellido_materno = comando.nextLine();
		System.out.println("\nIngrese nombre en mayusculas ej [ANTONIO]: ");
		nombre = comando.nextLine();
		System.out.println("\nIngrese sexo ej [M/F]: ");
		sexo = comando.nextLine();
		System.out.println("\nIngrese año de nacimiento ej [2001]: ");
		anio = comando.nextLine();
		System.out.println("\nIngrese mes de nacimiento ej [08]: ");
		mes = comando.nextLine();
		System.out.println("\nIngrese dia de nacimiento ej [15]: ");
		dia = comando.nextLine();
		System.out.println("\nIngrese entidad federativa en mayusculas ej [AGUASCALIENTES]: ");
		eFederativa = comando.nextLine();
		
		Persona.SetCurp(nombre, apellido_paterno, apellido_materno, dia, mes, anio, sexo, eFederativa);
		Persona.SetRFC(nombre, apellido_paterno, apellido_materno, dia, mes, anio);
		
		System.out.println("\n");
		System.out.println("\nCURP:");
		System.out.println(persona.getCurp());
		System.out.println("\nRFC:");
		System.out.println(persona.getRfc());
		
	}
	
}
