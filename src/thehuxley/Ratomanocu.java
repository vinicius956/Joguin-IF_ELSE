package thehuxley;

import java.util.Scanner;

public class Ratomanocu {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	String ol�_mundo = "Ol� Mundo, bem vindos aos jogos mortais.";
	System.out.println(ol�_mundo);
	
	String ir, comer, fugir, lutar, escondo, entro, saio, fujo, acao; 
	System.out.println("Voc� est� perdido, com fome e na chuva, e ao tentar procurar abrigo, v� uma casa. O que faz? 'entra' ou 'sai'? ");
	ir = keyboard.nextLine();
	
	if (ir.equalsIgnoreCase("entra")) {
		System.out.println("Ao entrar, voc� percebe que todas as portas se trancam e uma tela se acende, dizendo as palavras 'eu quero jogar um jogo'. O que voc� faz?");
		System.out.println(">   ");
		acao = keyboard.next();
	} else if (ir.equalsIgnoreCase("sai")) { 
		System.out.println("Voc� se depara com um cara procurando um rato");
		System.out.println("> Voc� pergunta: Que rato?");
		System.out.println("'Ratomanocu.' Diz o homem, virando cinzas logo em seguida ");
	}
	
	
	}

}
