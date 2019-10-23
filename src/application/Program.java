package application;

import java.util.Scanner;

import entities.Numero;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Numero numero = new Numero();
		System.out.print("Digite o número: ");
		numero.numeroDigitado = sc.nextInt();
		System.out.println(numero);
		
		sc.close();
	}
}
