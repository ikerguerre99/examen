package Azterketak;

import java.util.Scanner;

public class Kontrola2 {

	public static void main(String[] args) {
		String[] pizzaIzenak = new String[3];
		double[] pizzaPrezioak = new double[3];
		int kontagailua = 0;

		
		Scanner scan = new Scanner(System.in);
		
		//array-ari balioak eman
		
		do{
			System.out.println("Sar ezazu pizza izen bat.");
			pizzaIzenak[kontagailua] = scan.nextLine();
			
			System.out.println("Sar ezazu dagokion prezioa.");
			pizzaPrezioak[kontagailua] = Double.parseDouble(scan.nextLine());
			
			kontagailua++;
		}while(kontagailua < 3);
		
		int aukera;
		
		//menua atera
		
		do {
			System.out.println("--------Menua--------");
			System.out.println("1.- Zerrendatu pizzak ---- "
								+ "2.- Prezio garestiena ---- "
								+ "3.- Pizza merkeena ---- "
								+ "4.- Prezioen batezbestekoa ---- "
								+ "0.- Irten");
			
		aukera = scan.nextInt();
		
		switch (aukera){
		case 1:
			zerrendatu(pizzaIzenak, pizzaPrezioak);
			break;
		
		case 2:
			garestiena(pizzaPrezioak);
			break;
			
		case 3:
			merkeena(pizzaPrezioak, pizzaIzenak);
			break;
		
		case 4:
			batezbestekoa(pizzaPrezioak);
			break;
			
		case 0:
			System.out.println("---- Programa itxi duzu ----");
			break;
			
		default:
			System.out.println("Sar ezazu balore egoki bat.");
			System.out.println("");
			break;
			
		}
			} while (aukera != 0);
			
}

// zenbakiak zerrendatu
	
	private static void zerrendatu(String[] pizzaIzenak, double[] pizzaPrezioak) {
		for(int i = 0; i < 3; i++){
			System.out.print(pizzaIzenak[i] + " --- ");
			System.out.println(pizzaPrezioak[i] + "�");
		}	
	}
	
// pizza garesiena zenbat balio duen esan	
	
	private static void garestiena(double[] pizzaPrezioak) {
		int i;
		double max;

		max = pizzaPrezioak[0];
		for (i = 0; i <= pizzaPrezioak.length - 1; i++) {
			if (pizzaPrezioak[i] > max) {
				max = pizzaPrezioak[i];
		}
	}
		System.out.println("Garestiena " + max + "� balio du.");
		System.out.println("");
	
	}
	
//Pizza merkeena zein den esan eta zenbat balio duen (zein den ez doa ondo)	
	
	private static void merkeena(double[] pizzaPrezioak, String[] pizzaIzenak){
		int i;
		double min;

		min = pizzaPrezioak[0];
		for (i = 0; i <= pizzaPrezioak.length - 1; i++) {
			if (pizzaPrezioak[i] < min) {
				min = pizzaPrezioak[i];
			}	
		}
		
		//Pizzaren izena atera
		
		if (min == pizzaPrezioak[0]){
			System.out.print("Pizza merkeena " + pizzaIzenak[0] + " da eta");
			
		}else if (min == pizzaPrezioak[1]){
			System.out.print("Pizza merkeena " + pizzaIzenak[1] + " da eta");
			
		}else if (min == pizzaPrezioak[2]){
			System.out.print("Pizza merkeena " + pizzaIzenak[2] + " da eta");
		}
		
		
		System.out.println(" balio minimoa " + min + " �da.");
		System.out.println("");
	}
	
// Pizzen prezioen batezbestekoa atera	
	
	private static void batezbestekoa(double[] pizzaPrezioak) {
		int i;
		double media = 0;
		double batura = 0;

		for (i = 0; i <= pizzaPrezioak.length - 1; i++) {
			batura = batura + pizzaPrezioak[i];

		}
		media = batura / pizzaPrezioak.length;
		System.out.println("Zenbaki hauen media " + media + " da.");
		System.out.println("");
	}
}





