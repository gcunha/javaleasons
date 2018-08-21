package com.giuliano.aula15;

import java.util.Scanner;

public class Aula15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo numero:");
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println("O primeiro numero é o maior:");	
		} else if (num1 == num2){
			System.out.println("Os numeros são iguais:");
		} else {
			System.out.println("O segundo numero é o maior:");
		}
		
		
	}

}
