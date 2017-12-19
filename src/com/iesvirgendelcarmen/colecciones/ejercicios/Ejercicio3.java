package com.iesvirgendelcarmen.colecciones.ejercicios;

import java.util.Arrays;

public class Ejercicio3 {
	public static void main(String[] args) {
		final int TAMANNO = 100;
		int[] arrayEnteros = new int[TAMANNO]; //declaración del array
		//llenamos el array con valore aleatorios
		/*double decimal = (Math.random() * 100);
		int entero     = (int) decimal;
		System.out.printf("Decimal %.2f, entero %d%n", decimal ,entero);*/
		for (int i = 0; i < TAMANNO; i++) {
			arrayEnteros[i] =  (int) (Math.random() * 101);
		}
		//mostrar los datos
		System.out.println(Arrays.toString(arrayEnteros));
		//mostrar la media
		System.out.printf("Valor medio %.2f, desviación típica %.2f%n", 
				calcularValorMedioArray(arrayEnteros), 
				calcularDesviacionTipica(arrayEnteros));
	//	int[] copiaOriginal = arrayEnteros.clone(); si quiero tener el orden original
		//OJO el array original queda ordenado en el momento que apliquemos sort
		Arrays.sort(arrayEnteros); //ordenado el array
		System.out.println("Array ordenado " + Arrays.toString(arrayEnteros));
		int[] minimoMaximo = devolverMinimoMaximo(arrayEnteros);
		System.out.printf("Valor mas pequeño %d y valor mas grande %d%n",
				minimoMaximo[0], minimoMaximo[1]);
		System.out.println("Array de pares " + 
				Arrays.toString(devolverParesDelArray(arrayEnteros)));
	}
	
	public static double calcularValorMedioArray(int[] array) {
		int suma = 0;
		for (int i : array) {
			suma += i;
		}
		return  1.0 * suma / array.length;
		
	}
	
	public static double calcularDesviacionTipica(int[] array) {
		double suma = 0;
		for (int i : array) {
			suma += Math.pow(i - calcularValorMedioArray(array) ,2);
		}
		return Math.sqrt(suma / array.length);
		
	}
	
	/*public static int[] ordenarArray(int[] array) {
		Arrays.sort(array);
		return array;
	} no merece la pena hacer esto, pues queda el el array original ordenado*/
	
	public static int[] devolverMinimoMaximo (int[] array) {
		int[] arrayADevolver = new int[2];
		arrayADevolver[0] = array[0];
		arrayADevolver[1] = array[array.length -1];
		return arrayADevolver;
	}
	
	public static int[] devolverParesDelArray (int[] array) {
		//calcular cuantos pares existen
		int numeroPares = 0;
		for (int i : array) {
			if (i % 2 == 0)
				numeroPares++;
		}
		//rellenar el array de pares
		int[] arrayPares = new int[numeroPares];
		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				arrayPares[contador] = array[i];
				contador++;
			}
			
		}
		return arrayPares;
	}
	
	
}
