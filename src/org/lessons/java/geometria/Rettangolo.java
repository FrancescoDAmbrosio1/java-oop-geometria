package org.lessons.java.geometria;

public class Rettangolo {
	int base;
	int altezza;
	
	//metodo per il calcolo dell'area
	int calcoloArea() {
		int area = base * altezza;
		return area;
	}
	
	//metodo per il calcolo del perimetro
	int calcoloPerimetro() {
		int perimetro = (base * 2) + (altezza * 2);
		return perimetro;
	}
}
	