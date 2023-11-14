package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		Set<Integer> Lista=new HashSet<Integer>();
		Lista.add(1);
		Lista.add(2);
		Lista.add(3);
		Lista.add(4);
		Lista.add(5);
		Lista.add(6);
		Lista.add(7);
		Lista.add(8);
		Lista.add(9);
		Lista.add(10);
		
		Scanner Leia= new Scanner(System.in);
		System.out.println("\nEntre com um número inteiro: ");
		int Num=Leia.nextInt();
		
		if (Lista.contains(Num)) {
			System.out.println("\nNúmero " +Num+ " Encontrado!");
		}else {
			System.out.println("O número "+Num+ " não foi Encontrado..");
		}
	}

}
