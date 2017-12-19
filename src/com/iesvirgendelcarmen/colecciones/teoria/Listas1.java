package com.iesvirgendelcarmen.colecciones.teoria;

import java.util.ArrayList;

public class Listas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaCadenas = new ArrayList ();
		listaCadenas.add("juan");
		listaCadenas.add("pedro");
		listaCadenas.add("juani");
		listaCadenas.add("juanita");
		listaCadenas.add(3+"");
		System.out.println("Tamaño de la lista: " + listaCadenas.size()); 
		System.out.println("Elemento cero de la lista: " + listaCadenas.get(0));
	//	System.out.println("Elemento cero de la lista: " + listaCadenas.get(10));
		//recorrer la lista
		//forma clásica, usando un índice
		for (int i = 0; i < listaCadenas.size(); i++) {
			System.out.printf("Elemento %d  de la lista %S%n" ,
					i , listaCadenas.get(i));
		}
		listaCadenas.remove(0);
		System.out.println(listaCadenas);
		listaCadenas.add(0, "joselito");
		System.out.println(listaCadenas);
		listaCadenas.add(2, "joselita");
		System.out.println(listaCadenas);
		listaCadenas.set(2, "pepita");
		System.out.println(listaCadenas);





	}

}
