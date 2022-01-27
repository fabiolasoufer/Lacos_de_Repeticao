package Repeticao;

import java.util.Scanner;

public class Ex6_DoWhile {

	public static void main(String[] args) {
		
		int x; 
		double media=0.0, cont=0.0, soma=0.0;
		
		Scanner leia = new Scanner(System.in);
				
		do
		{
			System.out.println("Digite um número: ");
			x = leia.nextInt();
			
			if (x%3==0 && x!=0)
			{
				cont++;
				soma=soma+x;
			}
		}
		while (x!=0);
		
		media=soma/cont;
		System.out.println("A média dos números digitados que são múltiplos por 3 é "+media);

	}

}
