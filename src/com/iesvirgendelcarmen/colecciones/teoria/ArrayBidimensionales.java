package com.iesvirgendelcarmen.colecciones.teoria;

import java.util.Scanner;

public class ArrayBidimensionales {

	public static void main(String[] args) {
		final int COLUMNAS = 3;
		final int FILAS    = 3;
		Scanner sc = new Scanner(System.in);
		int[][] arrayBidimensional = 
				new int[FILAS][COLUMNAS];
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				System.out.printf("Valor fila %d columna %d%n",
						i, j);
				arrayBidimensional[i][j] = sc.nextInt(); 
			}
		}
		sc.close();
		//mostrar array bidemensional
		for (int i = 0; i < FILAS; i++) { //imprime filas
			for (int j = 0; j < COLUMNAS; j++) { //imprime columnas
				System.out.printf("%3d" ,arrayBidimensional[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		mostrarDatosArraysBidimensional(arrayBidimensional);
		System.out.println("--------------------------------------");

		int[][]  nuevoArray = {
				{1,2} , 
				{11,12,13} ,
				{1}
		};
		
		mostrarDatosArraysBidimensional(nuevoArray);
		
	}
	
	public static void mostrarDatosArraysBidimensional(int[][] array) {
		for (int i = 0; i < array.length; i++) { //imprime filas
			for (int j = 0; j <array[i].length; j++) { //imprime columnas
				System.out.printf("%3d" ,array[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	

}
