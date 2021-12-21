package com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Double a, b;
		
		System.out.println("Digite o promeiro valor: ");
		a=(double) scan.nextInt();
		System.out.println("Digite o Segundo Valor: ");
		b = (double) scan.nextInt();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double divisao = divisao(a,b);
		double multiplicacao = multiplicacao(a,b);
		
		System.out.println("Soma: " + soma);
		System.out.println("sub: " + subtracao);
		System.out.println("Div: " + divisao);
		System.out.println("Mult: " + multiplicacao);
		
	}
	
		
		public static double soma(Double a, Double b) {
			return a+b;		
		}
		
		public static double subtracao(Double a, Double b) {
			return a-b;
		}
		
		public static double divisao(Double a, Double b) {
			return a/b;
		}
		
		public static double multiplicacao(Double a, Double b) {
			return a*b;
}
}
