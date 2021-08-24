package main;

import java.util.Random;

public class Persona {

	private static char curp[];
	private static char RFC[];
	private static Random random = new Random();
	private static int r;
	private static int r_1;
	private static int r_2;
	private static int r_3;
	private static int r_4;
	
	
	
	public Persona() {
		curp = new char[18];
		RFC = new char [13];
	}
	
	public static void SetCurp(String nombre, String apellido_paterno, String apellido_materno, String dia, String mes, String anio, String sexo, String eFederativa) {	
		int c = 1;
		curp[0] = apellido_paterno.charAt(0);
		
		do {
			if (apellido_paterno.charAt(c) == 'A' || apellido_paterno.charAt(c) == 'E' || apellido_paterno.charAt(c) == 'I' || apellido_paterno.charAt(c) == 'O' || apellido_paterno.charAt(c) == 'U') {
				curp[1] = apellido_paterno.charAt(c);
				break;
			}
			c += 1;
		}while(c < apellido_paterno.length());
		
		curp[2] = apellido_materno.charAt(0);
		curp[3] = nombre.charAt(0);
		curp[4] = anio.charAt(2);
		curp[5] = anio.charAt(3);
		curp[6] = mes.charAt(0);
		curp[7] = mes.charAt(1);
		curp[8] = dia.charAt(0);
		curp[9] = dia.charAt(1);
		curp[10] = sexo.charAt(0);
		
		switch (eFederativa){
		case "AGUASCALIENTES":
            curp[11] = 'A'; curp[12] = 'S'; break;
            case "BAJA CALIFORNIA":
            	curp[11] = 'B'; curp[12] = 'C'; break;
            case "BAJA CALIFORNIA SUR":
            	curp[11] = 'B'; curp[12] = 'S'; break;
            case "CAMPECHE":
            	curp[11] = 'C'; curp[12] = 'C'; break;
            case "CHIAPAS":
            	curp[11] = 'C'; curp[12] = 'S'; break;
            case "CHIHUAHUA":
            	curp[11] = 'C'; curp[12] = 'H'; break;
            case "COAHUILA":
            	curp[11] = 'C'; curp[12] = 'L'; break;
            case "COLIMA":
            	curp[11] = 'C'; curp[12] = 'M'; break;
            case "CIUDAD DE MEXICO":
            	curp[11] = 'D'; curp[12] = 'F'; break;
            case "DURANGO":
            	curp[11] = 'D'; curp[12] = 'G'; break;
            case "GUANAJUATO":
            	curp[11] = 'G'; curp[12] = 'T'; break;
            case "GUERRERO":
            	curp[11] = 'G'; curp[12] = 'R'; break;
            case "HIDALGO":
            	curp[11] = 'H'; curp[12] = 'G'; break;
            case "JALISCO":
            	curp[11] = 'J'; curp[12] = 'C'; break;
            case "ESTADO DE MEXICO":
            	curp[11] = 'M'; curp[12] = 'C'; break;
            case "MICHOACAN":
            	curp[11] = 'M'; curp[12] = 'N'; break;
            case "MORELOS":
            	curp[11] = 'M'; curp[12] = 'S'; break;
            case "NAYARIT":
            	curp[11] = 'N'; curp[12] = 'T'; break;
            case "NUEVO LEON":
            	curp[11] = 'N'; curp[12] = 'L'; break;
            case "OAXACA":
            	curp[11] = 'O'; curp[12] = 'C'; break;
            case "PUEBLA":
            	curp[11] = 'P'; curp[12] = 'L'; break;
            case "QUERETARO":
            	curp[11] = 'O'; curp[12] = 'T'; break;
            case "QUINTANA ROO":
            	curp[11] = 'Q'; curp[12] = 'R'; break;
            case "SAN LUIS POTOSI":
            	curp[11] = 'S'; curp[12] = 'P'; break;
            case "SINALOA":
            	curp[11] = 'S'; curp[12] = 'L'; break;
            case "SONORA":
            	curp[11] = 'S'; curp[12] = 'R'; break;
            case "TABASCO":
            	curp[11] = 'T'; curp[12] = 'C'; break;
            case "TAMAULIPAS":
            	curp[11] = 'T'; curp[12] = 'S'; break;
            case "TLAXCALA":
            	curp[11] = 'T'; curp[12] = 'L'; break;
            case "VERACRUZ":
            	curp[11] = 'V'; curp[12] = 'Z'; break;
            case "YUCATAN":
            	curp[11] = 'Y'; curp[12] = 'N'; break;
            case "ZACATECAS":
            	curp[11] = 'Z'; curp[12] = 'S'; break;
            default:
            	curp[11] = 'N'; curp[12] = 'E'; break;
        }
		
		c = 1;
		
		do {
			if (apellido_paterno.charAt(c) != 'A' || apellido_paterno.charAt(c) != 'E' || apellido_paterno.charAt(c) != 'I' || apellido_paterno.charAt(c) != 'O' || apellido_paterno.charAt(c) != 'U') {
				curp[13] = apellido_paterno.charAt(c);
				break;
			}
			c += 1;
		}while(c < apellido_paterno.length());
		
		c = 1;
		
		do {
			if (apellido_materno.charAt(c) != 'A' || apellido_materno.charAt(c) != 'E' || apellido_materno.charAt(c) != 'I' || apellido_materno.charAt(c) != 'O' || apellido_materno.charAt(c) != 'U') {
				curp[14] = apellido_materno.charAt(c);
				break;
			}
			c += 1;
		}while(c < apellido_materno.length());
	
		c = 1;
		
		do {
			if (nombre.charAt(c) != 'A' || nombre.charAt(c) != 'E' || nombre.charAt(c) != 'I' || nombre.charAt(c) != 'O' || nombre.charAt(c) != 'U') {
				curp[15] = nombre.charAt(c);
				break;
			}
			c += 1;
		}while(c < nombre.length());
		
		
		
		curp[16] = '1';
		curp[17] = '2';
	}
	
	
	public static void SetRFC(String nombre, String apellido_paterno, String apellido_materno, String dia, String mes, String anio) {
		
		int c = 1;
		RFC[0] = apellido_paterno.charAt(0);
		
		do {
			if (apellido_paterno.charAt(c) != 'A' || apellido_paterno.charAt(c) != 'E' || apellido_paterno.charAt(c) != 'I' || apellido_paterno.charAt(c) != 'O' || apellido_paterno.charAt(c) != 'U') {
				RFC[1] = apellido_paterno.charAt(c);
				break;
			}
			c += 1;
		}while(c < apellido_paterno.length());
		
		
		RFC[2] = apellido_materno.charAt(0);
		RFC[3] = nombre.charAt(0);
		RFC[4] = anio.charAt(2);
		RFC[5] = anio.charAt(3);
		RFC[6] = mes.charAt(0);
		RFC[7] = mes.charAt(1);
		RFC[8] = dia.charAt(0);
		RFC[9] = dia.charAt(1);
		RFC[10] = 'A';
		RFC[11] = 'L';
		RFC[12] = '1';
	}
	
	
	public static char[] getCurp() {
		return curp;
	}
	
	public static char[] getRfc() {
		return RFC;
	}
	
}
