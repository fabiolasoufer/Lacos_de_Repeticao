package Repeticao;

import java.util.Scanner;

public class Ex3_While {

	public static void main(String[] args) {
		
		int idade, maior50=0, menor21=0;
		
		System.out.println("Digite sua idade: ");
		Scanner leia = new Scanner(System.in);
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
		if (idade<21)
		{
			menor21++;
		}
		if (idade>50)
		{
			maior50++;
		}
		}
		System.out.println("O total de pessoas menores de 21 anos, é: "+menor21);
		System.out.println("O total de pessoas maiores de 50 anos, é: "+maior50);
		
	}

}
