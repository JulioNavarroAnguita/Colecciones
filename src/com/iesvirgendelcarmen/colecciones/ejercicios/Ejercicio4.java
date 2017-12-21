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
		System.out.printf("Añadiendo la cadena %s a la lista. ¿Éxito? %b%n",
				"pepito2", insertarCadena("pepito2", listaCadenas));
		System.out.println(listaCadenas);
		System.out.printf("Eliminando la cadena %s a la lista. ¿Éxito? %b%n",
				"pepito222", eliminarCadena("pepito222", listaCadenas));
		System.out.println(listaCadenas);
		System.out.println("Lista de cadenas mas largas");
		System.out.println(obtenerCadenasMasLargas(listaCadenas));

	}
	
	public static boolean comprobarContienCadena (String cadena, ArrayList<String> lista) {
		return lista.contains(cadena);
	}
	
	public static boolean insertarCadena(String cadena, ArrayList<String> lista) {
		return lista.add(cadena);
	}
	
	public static boolean eliminarCadena(String cadena, ArrayList<String> lista) {
		return lista.remove(cadena);
	}
	
	public static ArrayList<String> obtenerCadenasMasLargas (ArrayList<String> lista) {
		ArrayList<String> listaCadenasMasLargas = new ArrayList<>();
		//para evitar analizar la cadena vacía
		if (lista.size() == 0) {
			return listaCadenasMasLargas;
		}
		String cadenaMasLarga = lista.get(0);
		listaCadenasMasLargas.add(cadenaMasLarga);
		for (int i = 1; i < lista.size(); i++) {
			
			if (lista.get(i).length() > cadenaMasLarga.length()) {
				listaCadenasMasLargas.clear(); //reseteo de la lista
				listaCadenasMasLargas.add(lista.get(i));
				cadenaMasLarga = lista.get(i); //ahora es la cadena de mayor longitud
				continue;
			}
			
			if (lista.get(i).length() == cadenaMasLarga.length()) {
				listaCadenasMasLargas.add(lista.get(i));
			}
			
		}
		return listaCadenasMasLargas;
	}

}
