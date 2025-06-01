package main;

import java.util.Scanner;

public class ContaTerminal {
	
	/*
	
	 DESAFIO: Ler os dados digitados pelo usuário no terminal e retornar uma frase com os dados notificados.
	 
	 Dados)
	 1)Número da conta (inteiro)
  	 2)Número da agência (texto)
     3)Nome do cliente (texto)
     4)Saldo da conta (decimal)
     
     Frase) "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
	
	*/
	
	public static void main (String[] args) {
		
		int numero;
		String agencia;
		String nomeCliente;
		float saldo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("=>===================");
		System.out.println("=> CONTA BANCARIA");
		System.out.println("=>===================");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Programa: Por gentileza, digite o numero da conta");
		System.out.print("Cliente: ");	
		numero = teclado.nextInt();
		System.out.println("Programa: Por gentileza, digite o numero da agencia");
		System.out.print("Cliente: ");	
		agencia = teclado.next();
		System.out.println("Programa: Por gentileza, digite o seu nome");
		System.out.print("Cliente: ");	
		nomeCliente = teclado.next();
		System.out.println("Programa: Por gentileza, digite o seu saldo (use virgula para separar as casas decimais)");
		System.out.print("Cliente: ");	
		saldo = teclado.nextFloat();
		
		System.out.println("\n");		
		System.out.println("Ola "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");		
		
	}
	
}
