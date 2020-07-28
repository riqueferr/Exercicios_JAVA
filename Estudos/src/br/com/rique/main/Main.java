package br.com.rique.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		
		//INPUT DO USUÁRIO COM STRING
		Scanner scanner = new Scanner (System.in);
		//System.out.println("Cuspir na tela quebrando linha.");
		//System.out.print("Cuspir na tela SEM quebrar linha.");
		System.out.println(" ");
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Bem-vindo: " + nome);
		
		
		//INPUT DO USUÁRIO COM STRING
		System.out.print("Digite sua idade: ");
		//int idade = Integer.parseInt(scanner.nextLine()) ;  CAST
		int idade = scanner.nextInt();
		System.out.println("Digite sua idade: " + idade);
		System.out.println("Ok, você tem " + idade + " anos.");
		
		
		//DIFERENÇA DO NEXT E NEXTLINE
		//NEXT RETORNA A PRIMEIRA COISA ANTES DO ESPAÇAMENTO
		//NEXTLINE RETORNA TUDO ANTES DE DAR ENTER
		
		System.out.print("Digite a operação matemárica: ");
		char operacaoMatematica = scanner.next().charAt(0); 
		//charAt retornar apenas o 
		//primeiro char - local 0
		System.out.println("Você digitou: " + operacaoMatematica);
				
		
		//ESTRUTURA DE DECISÃO COM IF.
		int resultado = 0;
		if (operacaoMatematica == '+') {
			resultado = idade + idade;
		} else if (operacaoMatematica == '-') {
			resultado = idade - idade;
		} else if (operacaoMatematica == '/') {
			resultado = idade / idade;
		} else if  (operacaoMatematica == '*') {
			resultado = idade * idade;
		} else {
			System.out.println("Você não digitou uma operação adequada!");
		}
		
		System.out.println(String.format("A conta realizada foi %d %c %d = %d", idade, operacaoMatematica, idade, resultado));
		String resultadoArray = String.format("A conta realizada foi %d %c %d = %d", idade, operacaoMatematica, idade, resultado);
		
		
		
		//ARRAYLIST SÓ PODE ACEITAR VARIÁVEL STRING
		ArrayList<String> historico = new ArrayList<String>();
		historico.add(resultadoArray);
		System.out.println("ArrayList = " + resultadoArray);
		
		scanner.close();
	}

}
