package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> Cores = new ArrayList();
		
		Scanner leia= new Scanner(System.in);
		for (int x=0; x < 5; x++) {
			System.out.println("Digite uma cor:");
			String Cor=leia.nextLine();
			Cores.add(Cor);
		}
		System.out.println("Cores inseridas: ");
		for (String Cor: Cores) {
			System.out.println(Cor);
		}
		Collections.sort(Cores);
		System.out.println("\nCores em ordem crescente: ");
		for (String Cor: Cores) {
			System.out.println(Cor);
		}

	}

}
