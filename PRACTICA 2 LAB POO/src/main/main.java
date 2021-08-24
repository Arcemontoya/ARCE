package main;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		Scanner comando = new Scanner(System.in);
		
		Estudiantes alumno = new Estudiantes(10);
		
		String nombres, materias, estado;
		int ids;
		float cals;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Ingrese nombre "+(i+1)+": ");
			nombres = comando.nextLine();
			System.out.println("Ingrese materia: ");
			materias = comando.nextLine();
			System.out.println("Ingrese ID: ");
			ids = comando.nextInt();
			System.out.println("Ingrese calificacion: ");
			cals = comando.nextFloat();
			comando.nextLine();
			
			if (cals > 60) {
				estado = "APROBADO";
			}else {
				estado = "REPROBADO";
			}
			
			alumno.setName(nombres, i);
			alumno.setGrade(cals, i);
			alumno.setStatus(estado, i);
			alumno.setSubject(materias, i);
			alumno.setID(ids, i);
			
		}
		
		
		for (int i = 0; i<10; i++) {
			System.out.println(alumno.getName(i)+"\t-\t"+alumno.getID(i)+"\t-\t"+alumno.getSubject(i)+"\t-\t"+alumno.getGrade(i)+"\t-\t"+alumno.getStatus(i)+"\t-\t");
		}

		
		
	}

}
