package com.iesvirgendelcarmen.colecciones.teoria;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		//crear colección de tipos enteros de tamaño 10
		int[] coleccionEnteros;
		coleccionEnteros = new int[10];
		
		//rellenar
		for (int i = 0; i < coleccionEnteros.length; i++) {
			coleccionEnteros[i] = 3;
		}
		//crear coleccion de tipo doubles de tamaño 5
		double coleccionDoubles[] = new double[5];
		//rellenar
	
		for (double d : coleccionDoubles) {
			d = 5.2;
		}
		//crear coleccion de tipo cadenas inicializada
		String[] coleccionCadenas = {"juan", "pepi", "luisa" ,
							"felicidad", "enrique" , "joaquin"};
		
		//mostramos datos de la primera colección
		for (int i : coleccionEnteros) {
			System.out.println(i);
		}
		
		//mostramos datos de la segunda colección
		for (int i = 0; i < coleccionDoubles.length; i++) {
			System.out.println(coleccionDoubles[i]);
		}  //¡OJO! nos encontramos una sorpresa
		   //no hemos inicializado la colección
		
		for (String nombres : coleccionCadenas) {
			System.out.println(nombres.toUpperCase().substring(1, 2));
		}
		System.out.printf("Tamaño de la colección de cadenas %d%n",
				coleccionCadenas.length);
	//coleccionCadenas[6] = "hola"; no puede ser pues esa posición no existe
		
		//rellenamos el double con el 5.2 que queríamos antes
		Arrays.fill(coleccionDoubles, 5.2);
		//mostramos datos de la segunda colección
		for (int i = 0; i < coleccionDoubles.length; i++) {
			System.out.println(coleccionDoubles[i]);
		}  //ya no hay sorpresas
		
		//mostramos el valor de la referencia del array de doubles
		System.out.println(coleccionDoubles);
		System.out.println(Arrays.toString(coleccionDoubles));

	}

}
