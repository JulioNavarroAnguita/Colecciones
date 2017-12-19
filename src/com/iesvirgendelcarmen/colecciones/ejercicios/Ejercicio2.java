package com.iesvirgendelcarmen.colecciones.ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		//rellenamos el array1 con un bucle
		for (int i = 0; i < array1.length; i++) {
			array1[i] = 3;
		}
		//rellenamos el array2 usando el método fill
		Arrays.fill(array2, 5);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		mostrarArrays(array1, array2);
	}
	
	public static void mostrarArrays(int[] primerArray, int[] segundoArray) {
		if (primerArray.length == segundoArray.length) {
			for (int i = 0; i < segundoArray.length; i++) {
				System.out.println(primerArray[i] + "--" + segundoArray[i]);
			}
		}
	}

}
