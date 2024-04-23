package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int perimetro;
		int area;
		
		//chiamo il costruttore Rettangolo
		Rettangolo rettangolo = new Rettangolo ();
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci la base del tuo rettangolo: ");
		rettangolo.base = scan.nextInt();
		System.out.print("Inserisci l'altezza del tuo rettangolo:");
		rettangolo.altezza = scan.nextInt();
		//invoco i due emetodi della classe Rettangolo
		perimetro = rettangolo.calcoloPerimetro();
		area = rettangolo.calcoloArea();
		
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
		rettangolo.disegna();
	
		}
	
}
