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
	
	//metodo che disegna il rettangolo
	void disegna() {
		
		for(int i = 0; i <= altezza; i++) {
			if(i == 0) {
				for(int j= 0; j < base; j++) {
					System.out.print("0");
				}
				System.out.println("");
			} else if(i == altezza-1) {
				for(int j= 0; j < base; j++) {
					System.out.print("0");
				}
				System.out.println("");
				break;
			} else {
				for(int j= 0; j <= base-1; j++) {
					boolean middleStructureCondition = (j == 0 || j == base-1);
					if(middleStructureCondition == true) {
						System.out.print("0");	
					}else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}
}
	