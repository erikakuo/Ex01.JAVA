package br.com.generation.exe01;

import java.util.Scanner;

public class IdadeAnosMesesDias {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, m,d ;
		
		System.out.println("Idade expressa em dias. ");
		
				
		System.out.println("Agora informe seu ano de nascimento: ");
		a = leia.nextInt();
		
		System.out.println("Agora informe os meses: ");
		m = leia.nextInt();
		
		System.out.println("Agora informe os dias: ");
		d = leia.nextInt();
		
		d = ((2022- a) * 365) + ((12-m-11)* 30) + ((-1)* (d-26)) ;
		System.out.println("\nA sua idade em dias é " + d);
		
		leia.close();
		
		
	}

}