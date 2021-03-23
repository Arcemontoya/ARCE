package Practica;
import java.util.Scanner;

public class CapturaEntrada {
	
	public static String capturarString(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("" + msg + "");
		return (sc.nextLine());
	}
	
	public static int capturarEntero(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("" + msg + "");
		return (sc.nextInt());
	}

}
