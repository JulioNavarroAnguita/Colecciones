package com.iesvirgendelcarmen.colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		ArrayList<String> listaCadenas = new ArrayList<>();
		System.out.println("Introduce palabras. Para acaber introduce fin o FIN");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String cadena = sc.next();
			if ( cadena.equalsIgnoreCase("fin"))
				break;
			listaCadenas.add(cadena);
		}
		sc.close();
		System.out.println(listaCadenas);
		System.out.printf("La lista ¿contiene la cadena %s? %b%n", 
				"ojo", comprobarContienCadena("ojo", listaCadenas));
	}
	
	public static boolean comprobarContienCadena (String cadena, ArrayList<String> lista) {
		return lista.contains(cadena);
	}
	
	

}
