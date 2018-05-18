package thehuxley;

import java.util.Scanner;

public class Ratomanocu {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	String olá_mundo = "Olá Mundo, bem vindos aos jogos mortais.";
	System.out.println(olá_mundo);
	
	String ir, comer, fugir, lutar, escondo, entro, saio, fujo, acao; 
	System.out.println("Você está perdido, com fome e na chuva, e ao tentar procurar abrigo, vê uma casa. O que faz? 'entra' ou 'sai'? ");
	ir = keyboard.nextLine();
	
	if (ir.equalsIgnoreCase("entra")) {
		System.out.println("Ao entrar, você percebe que todas as portas se trancam e uma tela se acende, dizendo as palavras 'eu quero jogar um jogo'. O que você faz?");
		System.out.println(">   ");
		acao = keyboard.next();
	} else if (ir.equalsIgnoreCase("sai")) { 
		System.out.println("Você se depara com um cara procurando um rato");
		System.out.println("> Você pergunta: Que rato?");
		System.out.println("'Ratomanocu.' Diz o homem, virando cinzas logo em seguida ");
	}
	
	
	}

}
